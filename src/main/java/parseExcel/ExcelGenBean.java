package parseExcel;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import util.MyUtil;

import com.google.common.collect.Lists;

import parseExcel.head.ExcelHead;

public class ExcelGenBean {
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		genBeans();
	}

	
	
	public static void genBeans() {
		String path = "src/main/resources/excels";
		String path2 = "excels";
		File dir = new File(path);
		if (dir.isDirectory()) {
			for (File f : dir.listFiles()) {
				String fileName = f.getName();
				String filePath = path2 + "/" + fileName;
				Map<String, List<ExcelHead>> map_head = ExcelUtil.getExcelBeans(false, filePath);
				createDataBeanFile(map_head);
				// ExcelReadData.readData(filePath, map_head);
			}
		}
	}

	private static void createDataBeanFile(Map<String, List<ExcelHead>> map_head) {
		final String path = "src/main/java/parseExcel/bean/";
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}

		final String templateString = MyUtil.getFileContent("src/main/resources/genTemplate/ExcelBeanFile");
		final String field = "private";
		for (Entry<String, List<ExcelHead>> entry : map_head.entrySet()) {
			final String cname = entry.getKey();
			final List<ExcelHead> fieldList = entry.getValue();
			IBeanFile beanFileLogic = new IBeanFile() {
				@Override
				public String createContent(String cname, List<ExcelHead> fieldList) {
					List<String> conDefList_str = Lists.newArrayList();
					List<String> conDefList = Lists.newArrayList();
					List<String> conRefList = Lists.newArrayList();
					List<String> toStringList = Lists.newArrayList();
					String fieldFormat = "\t//%s\n\t%s %s %s;\n";
					StringBuilder fieldsb = new StringBuilder();

					String conAssignFormat = "\tthis.%s=%s;\n";
					StringBuilder conAssignsb = new StringBuilder();

					String getMethodFormat = "public %s get%s(){\n \treturn %s;\n}\n";
					StringBuilder getMethodsb = new StringBuilder();

					String setMethodFormat = "public void set%s(%s %s){\n \tthis.%s=%s;\n}\n";
					StringBuilder setMethodsb = new StringBuilder();

					String insertSqlFormat = "insert into `pureland`.`%s`(%s) values(";
					List<String> insertSqlList = Lists.newArrayList();
					List<String> fieldSqlList = Lists.newArrayList();

					String aaFormat = "'\\\").append(this.%s()).append(\\\"',";
					String bbFormat = "\\\").append(this.%s()).append(\\\",";
					for (ExcelHead head : fieldList) {
						insertSqlList.add("`" + getTableName(head.title) + "`");
						if ("String".equals(head.type)) {
							fieldSqlList.add(String.format(aaFormat, createGetMethod(head.title)));
						} else {
							fieldSqlList.add(String.format(bbFormat, createGetMethod(head.title)));
						}
						String type = transferType(head.type);
						fieldsb.append(String.format(fieldFormat, head.desc, field, type, head.title));

						getMethodsb.append(String.format(getMethodFormat, type,
								MyUtil.firstChar2Upper(head.title), head.title));

						setMethodsb.append(String.format(setMethodFormat, MyUtil.firstChar2Upper(head.title),
								type, head.title, head.title, head.title));

						conDefList_str.add("String " + head.title);
						conDefList.add(type + " " + head.title);
						if ("String".equals(type)) {
							conRefList.add(head.title);
						} else {
							conRefList.add(getMethod(head.type) + "(" + head.title + ")");
						}
						toStringList.add(head.title + "=\\\"+" + head.title);
						conAssignsb.append(String.format(conAssignFormat, head.title, head.title));
					}
					String conDef_str = MyUtil.getJoinString(conDefList_str, "", ",", "");
					String conDef = MyUtil.getJoinString(conDefList, "", ",", "");
					String conRef = MyUtil.getJoinString(conRefList, "", ",", "");
					String toString = MyUtil.getJoinString(toStringList, "", "+\\\", ", "");
					// 去掉最后一个','
					toString = toString.substring(0, toString.length() - 1);

					String insertSql_str = MyUtil.getJoinString(insertSqlList, "", ",", "");
					String fieldSql = MyUtil.getJoinString(fieldSqlList, "", "", "");

					String tableName = getTableName(MyUtil.firstChar2Lower(cname));
					String insertSql = String.format(insertSqlFormat, tableName, insertSql_str);

					String content = templateString.replaceAll("%cname%", cname)
							.replaceAll("%field_def%", fieldsb.toString())
							.replaceAll("%construct_def%", conDef)
							.replaceAll("%construct_strDef%", conDef_str)
							.replaceAll("%construct_assign%", conAssignsb.toString())
							.replaceAll("%construct_strAssign%", conRef)
							.replaceAll("%toString%", toString.toString())
							.replaceAll("%get_method%", getMethodsb.toString())
							.replaceAll("%set_method%", setMethodsb.toString())
							.replaceAll("%insert_sql%", insertSql).replaceAll("%field_Sql%", fieldSql);
					return content;
				}

				private String createGetMethod(String title) {
					if (title.length() == 0) {
						System.out.println();
					}
					return "get" + MyUtil.firstChar2Upper(title);
				}

				private String getTableName(String cname) {
					StringBuilder sb = new StringBuilder();
					for (int i = 0; i < cname.length(); i++) {
						char c = cname.charAt(i);
						if (Character.isUpperCase(c)) {
							sb.append("_").append(Character.toLowerCase(c));
						} else {
							sb.append(c);
						}
					}
					return sb.toString();
				}

				private String getMethod(String type) {
					if ("int".equals(type.trim())) {
						return "Integer.parseInt";
					} else if ("double".equals(type.trim())) {
						return "Double.parseDouble";
					} else if ("long".equals(type.trim())) {
						return "Long.parseLong";
					} else {
						return "String";
					}
				}

				private String transferType(String type) {
					if ("int".equals(type.trim())) {
						return "Integer";
					} else if ("double".equals(type.trim())) {
						return "Double";
					} else if ("long".equals(type.trim())) {
						return "Long";
					} else {
						return "String";
					}
				}
			};

			FileUtil.writeFile("src/main/java/parseExcel/bean/" + cname,
					beanFileLogic.createContent(cname, fieldList));
		}
	}
}

package test;

import java.util.HashMap;
import java.util.Map;

public class SubExtendsTest {
	
	private static class Base{
		public Map doStuff(HashMap map){
			System.out.println("in Base");
		}
	}
	
	private static class Sub extends Base{
		public HashMap doStuff(Map map){
			System.out.println("in Sub");
		}
	}
	
	public static void main(String[] args) {
		Base b = new Sub();
		b.doStuff(new HashMap<>());
	}
}

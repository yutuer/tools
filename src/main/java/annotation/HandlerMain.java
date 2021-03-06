package annotation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.config.AopNamespaceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import annotation.aop.TestBean;
import annotation.dao.ADao;
import annotation.handler.AHandler;
import annotation.service.AService;

public class HandlerMain {

	@Autowired
	private AHandler i;

	public static final Logger logger = LoggerFactory.getLogger(HandlerMain.class);

	public static void main(String[] args) throws IOException {
		// String log4jPath = "log4j.properties";
		// // 配置log4j日志文件
		// PropertyConfigurator.configureAndWatch(log4jPath, 1000);
		System.out.println(Thread.currentThread().getContextClassLoader());

		// try(ConfigurableApplicationContext context = new
		// ClassPathXmlApplicationContext("anno.xml")){
		// //此方法会通知所有实现了lifeCycle接口的类
		// context.start();
		//
		// AHandler ah = context.getBean(AHandler.class.getSimpleName(),
		// AHandler.class);
		// ah.handler();
		//
		// context.stop();
		// }
		// {
		//
		// Resource r = new ClassPathResource("anno.xml");
		// ResourceLoader rl = new DefaultResourceLoader();
		// ResourcePatternResolver ppResolver = new
		// PathMatchingResourcePatternResolver();
		// for (Resource resource :
		// ppResolver.getResources("classpath**:anno.xml")) {
		// logger.info(resource.getDescription());
		// }
		//
		
		{
//			new AopNamespaceHandler();
//			ApplicationContext app = new ClassPathXmlApplicationContext("anno.xml");
//		@SuppressWarnings("resource")
//		ApplicationContext app = new ClassPathXmlApplicationContext("aop.xml");
//			TestBean tb = (TestBean)app.getBean("test");
//			tb.test();
//		System.out.println(Arrays.asList(app.getBeanDefinitionNames()));
//		System.out.println(app.getBean(ADao.class));
		}
		
		// {
		// Map<String, IHandler> beansOfType =
		// app.getBeansOfType(IHandler.class);
		// logger.info(beansOfType.toString());
		//
		// AHandler ah = app.getBean(AHandler.class.getSimpleName(),
		// AHandler.class);
		// logger.info("{}", ah);
		// ah.handler();
		// }
		// {
		// ADao aDao = app.getBean(ADao.class.getSimpleName(), ADao.class);
		// logger.info("{}", aDao);
		// aDao.daoDo();
		// }
		// }
		// {
		// ApplicationContext app = new
		// ClassPathXmlApplicationContext("anno.xml");
		// AHandler ah = app.getBean(AHandler.class.getSimpleName(),
		// AHandler.class);
		// logger.info("{}", ah);
		// ah.handler();
		//
		// AutowireCapableBeanFactory autoWiringBeanFactory =
		// findAutoWiringBeanFactory(app);
		// Object bean = autoWiringBeanFactory.autowire(HandlerMain.class,
		// AutowireCapableBeanFactory.AUTOWIRE_CONSTRUCTOR, false);
		// HandlerMain cast = HandlerMain.class.cast(bean);
		// autoWiringBeanFactory.autowireBeanProperties(cast,
		// AutowireCapableBeanFactory.AUTOWIRE_BY_NAME, false);
		//
		// if (app instanceof ConfigurableApplicationContext) {
		//
		// ConfigurableListableBeanFactory cast2 =
		// ((ConfigurableApplicationContext) app).getBeanFactory();
		// if(cast2 instanceof BeanDefinitionRegistry){
		// BeanDefinitionRegistry cast3 =
		// BeanDefinitionRegistry.class.cast(cast2);
		// cast3.registerBeanDefinition(HandlerMain.class.getName(), new
		// RootBeanDefinition(HandlerMain.class));
		// }
		// }
		//
		// HandlerMain bean2 = autoWiringBeanFactory.getBean(HandlerMain.class);
		// logger.info(bean2.toString());
		// }
		
		{
//			Resource parentResource = new ClassPathResource("aop.xml");
//			@SuppressWarnings("deprecation")
//			XmlBeanFactory parentXmlBeanFactory = new XmlBeanFactory(parentResource);
			
			Resource childResource = new ClassPathResource("anno.xml");
			@SuppressWarnings("deprecation")
			XmlBeanFactory childXmlBeanFactory = new XmlBeanFactory(childResource);
			Object bean = childXmlBeanFactory.getBean("car");
			System.out.println(bean);
			//			@SuppressWarnings("unused")
//			ADao aDao = childXmlBeanFactory.getBean(ADao.class);
//			AService aService = childXmlBeanFactory.getBean("AService", AService.class);
//			aService.serviceDo();
		}
	}

	protected static AutowireCapableBeanFactory findAutoWiringBeanFactory(ApplicationContext context) {
		if (context instanceof AutowireCapableBeanFactory) {
			return (AutowireCapableBeanFactory) context;
		} else if (context instanceof ConfigurableApplicationContext) {
			return ((ConfigurableApplicationContext) context).getBeanFactory();
		} else if (context.getParent() != null) {
			return findAutoWiringBeanFactory(context.getParent());
		}
		return null;
	}

}

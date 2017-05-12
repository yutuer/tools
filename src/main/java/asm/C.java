package asm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C implements A{
	
	private static Logger log = LoggerFactory.getLogger(C.class.getSimpleName());
	
	public A a = new A(){
		@Override
		public void a() {
			log.info("in inner A, classLoader:{}", this.getClass().getClassLoader());
		}};
	
	private int i = 1;
	
	private static String s;
	
	public void m() throws Exception{
		Thread.sleep(100);
	}
	
	public void a(){
		log.info("success in C.a, classLoader:{}", this.getClass().getClassLoader());
	}
	
	public void b() {
		
	}
}
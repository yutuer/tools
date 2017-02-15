package test;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FutureTest {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				int i = 0;
				try {
					while(true){
//						Thread.sleep(0L);
						if(i++%10000000== 0){
							System.out.println("r1:" + i);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(Thread.currentThread().isInterrupted());
				}
				System.out.println("r1 out:" + i);
			}
		};
		
		ThreadPoolExecutor es = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		Future<?> f =  es.submit(r);
		
		Thread.sleep(1000L);
		
		f.cancel(true);
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				int i = 0;
				try {
					while(true){
						if(Thread.interrupted()){
							break;
//							Thread.currentThread().interrupt();
//							throw new RuntimeException();
						}
						TimeUnit.NANOSECONDS.sleep(1);
						if(i++%10000== 0){
							System.out.println("r2:" + i);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(Thread.currentThread().isInterrupted());
				}
				System.out.println("r2 out:" + i);
			}
		};
		Future<?> f2 = es.submit(r2);
		Thread.sleep(1000L);
		f2.cancel(true);
	}
}

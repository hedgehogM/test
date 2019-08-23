package xiancheng;

import java.util.concurrent.*;


public class test {

	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		System.out.println(Long.MAX_VALUE);
		int corePoolSize = 5;
		int maximumPoolSeize = 5;
		long keepAliveTim = 10;
		TimeUnit utit = TimeUnit.SECONDS;
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(20);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSeize, keepAliveTim, utit, workQueue);
		executor.prestartAllCoreThreads();
		try {
			for (int j = 0; j < 20; j++) {
				MyTask mt = new MyTask(j);
				executor.execute(mt);
			}
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			executor.shutdown();
			System.out.println("==关闭线程池==");
			try {
				if(executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
					final long endTime = System.currentTimeMillis();
					System.out.println("==线程执行完毕==耗时："+ (endTime - startTime)/1000);
				} else {
					System.out.println("==线程关闭超时==");
				}
//				executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
//				System.out.println("==线程执行完毕==");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void zhixing() {

			int corePoolSize = 5;
			int maximumPoolSeize = 5;
			long keepAliveTim = 10;
			TimeUnit utit = TimeUnit.SECONDS;
			BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(5);
			ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSeize, keepAliveTim, utit, workQueue);
			executor.prestartAllCoreThreads();
		try {
			for (int j = 0; j < 6; j++) {
				MyTask mt = new MyTask(j);
				Thread.sleep(3000);
				executor.execute(mt);
			}
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			executor.shutdown();
		}

	}

	private static class MyTask implements Runnable {
		private int num;

		public MyTask(int j) {
			num = j;
		}

		@Override
		public void run() {
			shuchu(num);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	private static void shuchu(int j) {
		System.out.println("="+ j +"=");
	}

}

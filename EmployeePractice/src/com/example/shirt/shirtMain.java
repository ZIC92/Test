package com.example.shirt;
import java.lang.Thread;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
public class shirtMain extends shirtReport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		shirtReport sr = new shirtReport();
//		sr.Report();

		ExampleRunnable r1 = new ExampleRunnable();
		ExampleRunnable2 r2 = new ExampleRunnable2();
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();


	}
	final static CyclicBarrier barrier = new CyclicBarrier(2);
	public static class ExampleRunnable implements Runnable {
		public void run() {
			try {
				barrier.await();
				PurchasingAgent pa = new PurchasingAgent();
				pa.purchase();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public static class ExampleRunnable2 implements Runnable {
		public void run() {
			PurchasingAgent pa = new PurchasingAgent();
			pa.purchase();
		}
	}
}

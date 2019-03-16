package threads;

import java.util.Iterator;

public class ThreadA extends Thread {

	@Override
	public void run() {
		System.out.println("entering thread A");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadA=" + i);

		}
		System.out.println("exiting thread A");

	}

}

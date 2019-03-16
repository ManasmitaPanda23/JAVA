package threads;

public class ThreadB extends Thread {

	@Override
	public void run() {
		System.out.println("entering thread B");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread B=" + i);
		}
		System.out.println("exiting Thread B");
	}

}

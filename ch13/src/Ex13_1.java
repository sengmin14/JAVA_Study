class Ex13_1 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	  // 생성자 Thread(Runnable target)

		t1.start();
//		t1.run();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread { // Thread클래스를 상속해서 쓰레드를 구현
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable { // 2. Runnable인터페이스를 구현해서 쓰레드를 구현
	public void run() {
		for(int i=0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
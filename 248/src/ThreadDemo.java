class ThreadDemo implements Runnable {
	Thread t1;
	String name;
	Utility ut;
	public ThreadDemo(String ThreadName, Utility uti) {
		this.name = ThreadName;
		this.ut = uti;
		t1 = new Thread(this, ThreadName);
		t1.start();
	}
	public void run() {
		System.out.println("Thread " + name + " starting");
		ut.print();
		System.out.println("Thread " + name + " ending");
	}
}
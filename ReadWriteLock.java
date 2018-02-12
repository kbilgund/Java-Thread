public class ReadWriteLock {
	
	public static void main(String[] args){
		Counter cnt = new Counter();
		
		Thread1 t1 = new Thread1(cnt);
		Thread2 t2 = new Thread2(cnt);
		
		t1.start();
		t2.start();
		
		
	}
	
	
}
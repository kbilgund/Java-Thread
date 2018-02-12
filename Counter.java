import java.util.concurrent.locks.ReentrantReadWriteLock;
public class Counter {
	
	private int count;
	final ReentrantReadWriteLock RWLock = new ReentrantReadWriteLock();

	
	Counter(){
		count = 0;
	}
	
	public  void increment(){
		try {
			RWLock.writeLock().lock();
			count = count + 1;
			System.out.println("Thread 1 incrementing the count Thread ");
		}

		finally {
			RWLock.writeLock().unlock();
		}
		
		try{
			Thread.sleep(10);
		}
		catch (Exception e ){
		}
		
	}
	
	public  int getCount(){
		try{
			RWLock.readLock().lock();
			System.out.println("Thread 2 getting the count " + count);
			return count;
		}
		finally {
			RWLock.readLock().unlock();
		}
	}
	

}
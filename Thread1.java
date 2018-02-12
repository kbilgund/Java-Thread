public class Thread1 extends Thread {
	
	Counter my_counter;
	
	Thread1(Counter c){
		my_counter = c;
	}
	
	public void run(){
		for(int i = 0; i <10 ; i++){
			my_counter.increment();
			

		}
	}
	
}
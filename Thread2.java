public class Thread2 extends Thread {
	
	Counter my_counter;
	
	Thread2(Counter c){
		my_counter = c;
	}
	
	public void run(){
		for(int i = 0; i <10 ; i++){
			int temp = my_counter.getCount();
			
		}

	}
	
}
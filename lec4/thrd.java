class thrd extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("in run choots");
			try{
				Thread.sleep(500);
			}
			catch(Exception e){}
		}

	}

	public static void main(String[] args) {
		thrd obj= new thrd ();
		obj.start();
		while(true){
			System.out.println("in main choots");
			try{
				Thread.sleep(500);
			}
			catch(Exception e){}
		}

	}
}

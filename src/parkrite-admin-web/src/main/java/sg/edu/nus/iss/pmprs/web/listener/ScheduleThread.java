package sg.edu.nus.iss.pmprs.web.listener;

public class ScheduleThread extends Thread {

	
	    public ScheduleThread(String str) {
	        super(str);
	    }
	 
	    public void run() {
	    	while(true)
        	{
        	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println("thread from1");
        	}
        	

	    }
	
}

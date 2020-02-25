package lab8;
public class TimerMain {
	public static void main(String[] args) {
		Runnable runnable = new Timer();
		Thread thread = new Thread(runnable);
		try {
			thread.start();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

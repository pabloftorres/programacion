package proyectos;

public class cWait {
	public void wait(int segons) {
		try {
			Thread.sleep(segons * 1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		} 
	}
}

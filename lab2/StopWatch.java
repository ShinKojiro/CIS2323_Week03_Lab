package lab2;

public class StopWatch {
	private double startTime;
	private double stopTime;
	
	public void start(){
		startTime = System.nanoTime();
	}
	public void stop(){
		stopTime = System.nanoTime();
	}
	public double time(){
		return ((stopTime - startTime) / 1000000.0);
	}
}
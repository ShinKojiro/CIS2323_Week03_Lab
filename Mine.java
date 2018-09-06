import mystuff.*;
import lab2.*;

public class Mine{
	public static void main(String[] args){
		Lamp myLamp = new Lamp();
		System.out.println("This is my lamp!");
		
		myLamp.setColor("White");
		myLamp.setWatts(50);
		myLamp.turnOn();
		String status = myLamp.showStatus();
		System.out.println(status);
		//System.out.println(myLamp.showStatus()); //this does the same as above 2 lines
		
		Lamp yourLamp = new Lamp();
		Yours.print();
		yourLamp.setWatts(60);
		yourLamp.setColor("blue");
		// no yourLamp.turnOn(); defaults to off within Lamp class.
		System.out.println(yourLamp.showStatus());
		
		//Lamp othersLamp = new Lamp();
		//Others.print();
		
		StopWatch s = new StopWatch();
		s.start();
		s.stop();
		System.out.println("Timer ran for " + s.time() + " seconds.");
	}
}
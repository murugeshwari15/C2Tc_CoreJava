
package circle;
import java.util.Scanner;
public class Circlee {
	 public double radius;
	 public String colour;
	   public void getInput() {
	    	Scanner s= new Scanner(System.in);
	    	System.out.println("enter the color:");
	    	colour=s.nextLine();
	    	System.out.println("enter the radius:");
	    	radius=s.nextInt();
	    	s.close();
	         }
	public double calcArea() {
		return 3.14*radius*radius;
	}
}

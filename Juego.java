import java.util.Scanner;

class Operator {
	int v1;
	int v2;
	
	public Operator(int a, int b) {
		
		this.v1 = a;
		this.v2 = b;
		
	}
	
	public int Add() {
		return v1+v2;
	}

}

public class Juego {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;

		//x = Integer.parseInt(args[0]);
		//y = Integer.parseInt(args[1]);

		//x = 3;
		//y = 6;

		/**/
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter value 01 :");
	    String xs = myObj.nextLine();
	    System.out.println("Enter value 02 :");
	    String ys = myObj.nextLine();
	    x = Integer.parseInt(xs);
		y = Integer.parseInt(ys);
		/**/


		Operator obj1 = new Operator(x,y);

		System.out.println("Suma : " + obj1.Add());

	}

}

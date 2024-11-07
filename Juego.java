import java.util.Scanner;
import javax.swing.JOptionPane;

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
		
		String xs = JOptionPane.showInputDialog("Enter value 01 :");
		String ys = JOptionPane.showInputDialog("Enter value 02 :");
		x = Integer.parseInt(xs);
		y = Integer.parseInt(ys);
	    
		
		Operator obj1 = new Operator(x,y);
		
		JOptionPane.showMessageDialog(null, "Suma " + obj1.Add() + "!");

	}

}

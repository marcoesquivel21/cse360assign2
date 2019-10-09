/**
 * @author marcoesquivel
 * @class ID LC7
 * @assignment 2
 */

package cse360assign2;


public class AddingMachine {
	
	//private global variables 
	private int total;
	private String strTotal = "0";
	
	//testing main method
	public static void main(String [] args) {
		AddingMachine calc = new AddingMachine();
		calc.add(5);
		calc.add(2);
		calc.subtract(3);
		System.out.println(calc.toString());
		System.out.println(calc.getTotal());
		calc.clear();
		calc.subtract(3);
		calc.add(4);
		System.out.println(calc.toString());
		System.out.println(calc.getTotal());
	}
	
	
	//constructor
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	//returns total of calculator
	public int getTotal () {
		return total;
	}
	
	
	//adding method
	public void add (int value) {
		total += value;
		strTotal += " + " + value;
	}
	
	
	//subtracting method
	public void subtract (int value) {
		total -= value;
		strTotal += " - " + value;
	}
	
	
	//to string method
	public String toString () {
		return strTotal;
	}
	
	
	//clears calculator 
	public void clear() {
		strTotal = "0";
		total = 0;
		
	}
	

}

/*Derek Osborne
 * CMIS 242
 * Assignment 3 : GUI and Polymorphism
 *11/21/2022
 *
* Convertor.java to return input values
*/
 
public class Converter {
	
	//Attributes
	private double input;
    
    //Default convert() constructor
    public Converter() {
        input = Double.NaN;
    }
    
    //Overloaded Convertor() constructor
    public Converter(double input) {
    	this.input = input;
    }
        
	//getInput to Get method
    public double getInput() {
    	return input;
    }
  
    //setInput to Set method
    public void setInput(double input) {
    	this.input = input;
    }
	
    //Convert() return input value
	public double convert(double input) {
		return input;
	}
}

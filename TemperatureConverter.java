/*
* This class inherits parent methods and overrides convert function to calculate temperature
*/
 
public class TemperatureConverter extends Converter {
	
	//Inherits attributes from Converter Class
	
    //Constructor calls parent constructor
    public TemperatureConverter(double input) {
    	super(input);
    }
         
	//Inherit Set and Get method to return input value
    @Override
	public double convert(double input) {
    	double celsius;
    	
    	if (input != Double.NaN) {
    	celsius = ((input-32)*5)/9;
		return celsius;
		
    	} else {
    		return Double.NaN;
    	}
	}
}

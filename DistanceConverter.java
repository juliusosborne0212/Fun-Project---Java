/*
*This class inherits parent methods and overrides convert() to calculate distance
*/
 
public class DistanceConverter extends Converter {
	
	//Inherits attributes from Converter and calls parent constructor
    public DistanceConverter (double input) {
    	super(input);
    }
        
	//Inherits Set and Get method from Converter Class to return input value
    @Override
	public double convert(double input) {
    	double km;
		
    	if (input != Double.NaN) {
    	km = input*1.609;
		return km;
    	} else {
    		return Double.NaN;
    	}
	}

}

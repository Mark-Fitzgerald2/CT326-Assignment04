package ballTypes;

import java.text.DecimalFormat;

public enum Ball {
	
	//setup the weights and diameters of the balls
	BASEBALL(149, 73),
    BASKETBALL(624, 239),
    FOOTBALL(450, 216),
    GOLF(46, 43),
    POOL(156, 60),
    SOFTBALL(180, 97),
    TENNIS(59, 64),
    VOLLEYBALL(260, 218);
    
	//Setup the decimal format for output
	DecimalFormat precis = new DecimalFormat("0.00");
	//create diameter and weight variables
    private int diameter;
	private int weight;
	
    Ball(int w, int d) {
    	//store the value of the weight and diameters 
    	//to local variables
    	this.weight = w;
		this.diameter = d;
	}
    
    public String getCircumference() {
    	//return the name and value of circumference
    	//formula is d*pi
		return "The circumference of a " + name() 
					+ " is: " + precis.format(diameter * Math.PI) + " mm";
    }
    
    public String getVolume() {
    	//return the name and value of volume
    	//formula is (4/3)x(pi x r^3)
    	return "The diameter of a " + name() + " is: " 
    				+ precis.format((4/3D) * Math.PI * Math.pow(diameter/2D, 3)) + " mm^3";
    }
    
    public String toString() {
    	//print out the information of the balls
    	//create variable to return
    	String out = "";
    	//check the dimensions of the ball
    	//setup the output so that it prints in columns 
    	//if loop determines how much spaces to use
    	if(weight < 100 && diameter < 100) { 		
    		out = String.format("%-16s%-3s%-3s%-3s%-3s", name(), weight, "g", diameter, "mm");
    	} else if(weight<100) {
    		out = String.format("%-16s%-3s%-2s%-4s%-3s", name(), weight, "g", diameter, "mm");
    	} else if(diameter<100) {
    		out = String.format("%-15s%-4s%-3s%-3s%-2s", name(), weight, "g", diameter, "mm");
    	} else {
    		out = String.format("%-15s%-4s%-2s%-4s%-3s", name(), weight, "g", diameter, "mm");
    	}
    	return out;
    }

	public int getWeight() {
		//returns weight of the ball
		return weight;
	}
	
	public int getDiameter() {
		//returns diameter of the ball
		return diameter;
	}
}

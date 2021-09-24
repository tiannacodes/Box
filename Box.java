-removed package line as it contains sensitive data-

public class Box {

	private double L1, W1, H1, Weight;
	
	//Constructor #1 - has no parameters and initializes the Box's instance variables to 0
	public Box() {
	L1 = 0;
	W1 = 0;
	H1 = 0;
	Weight = 0;
	}
	
	//Constructor #2 - has four integer parameters that initializes the Box object's L,W,H,Weight
	public Box(double L, double W, double H, double weight1) {
		L1 = L;
		W1 = W;
		H1 = H;
		Weight = weight1;
	}
	
//main - computes the Box's Volume and Density, then outputs the results to the user's screen.
	public static void main(String[] args) {
		
		Box first = new Box(10,5,5,2600); //an instance of the Box object with L1=10, W1=5, H1=5, Weight=2600
		double boxVolume = 0;
		double boxDensity = 0;
		
		//calculate box volume, passing first instance L,W,H,weight as parameters
		boxVolume = first.calculateVolume(boxVolume);
		
		//calculate box density, passing first instance L,W,H,weight as parameters
		boxDensity = boxVolume; //assigning boxDensity the same value as the calculated volume
								//doing this so that the volume value is passed to boxDensity for calculations
		boxDensity = first.calculateDensity(boxDensity);
		
		if (boxDensity > 0) {
			//print statistics to user
			System.out.println("Box Measurements:");
			System.out.println("Length = 10.00 feet");
			System.out.println("Width = 5.00 feet");
			System.out.println("Height = 5.00 feet");
			System.out.println("Weight = 2,600.00 pounds");
			System.out.println("The volume of the box is: " + String.format("%.2f",boxVolume) + " cubic feet");
			System.out.println("The density of the box is: " + String.format("%.2f",boxDensity) + " pounds per cubic foot");	
			}
		
		else {System.out.println("Bye!");
		}
		
	}//end of main
	
	//method calculateVolume( ) which returns the volume (formula: L1*W1*H1) of the Box object as a double.
	public double calculateVolume(double volume){
		volume = L1*W1*H1;
		return volume;
	}
	
	//method calculateDensity( ) which returns the density of the Box (formula: weight/volume) as a double, check for divide by 0.
	public double calculateDensity(double vol) {//pass the volume as box parameter
			double density = 0;
			if (vol > 0 && Weight > 0) {
				density = Weight / vol;
			}
			
			else {System.out.println("Error: Cannot divide by 0");
			}

	return density;
	}
		
}//end of Box class


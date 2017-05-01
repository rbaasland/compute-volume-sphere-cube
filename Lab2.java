// Ronald Baasland
// Lab 2: Gets radius computes volume
// October 24, 2008

import java.util.*;
public class Lab2
{	
	public static void main(String[] args)
	{
		double radius = 0;
		double side = 0;
		String response = "yes";
		Scanner input = new Scanner(System.in);
		
		while (response.equalsIgnoreCase("yes"))
		{
			System.out.println("Please enter the length of a radius: ");
			radius = input.nextDouble();
			
			System.out.println("Please enter the length of a side: ");
			side = input.nextDouble();
			
			computeSphereVol(radius);
			computeCubeVol(side);
			
			System.out.println(""); //Puts empty line between statements
			System.out.println("Would you like to run this program again?");
			response = input.next();
			
			if (response.equalsIgnoreCase("no"))
				System.out.println("Thank you for using the program!");						
		} //End of while loop
		
	}// End of Main
	
	public static void computeSphereVol(double radius)
	{
		double sphereVolume = radius * radius * radius * 3.1416;
		System.out.println("The radius is: " + radius);
		System.out.println("The volume of the sphere is: " + sphereVolume);
	}// End of method
	
	public static void computeCubeVol(double side)
	{
		double cubeVolume = side * side * side;
		System.out.println("The length of the side is: " + side);
		System.out.println("The volume of the cube is: " + cubeVolume);
		
		
	}//End of method




}//End of class

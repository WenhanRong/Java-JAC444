package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String []args) {
		String fileName = "shapes.txt";
		
		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.println("------->Task 1 ... <-------");
		
		Shapes shapeArray[] = new Shapes[32];
		int count = 0;
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((s = br.readLine()) != null) {
			String[] tokens = s.split(",");
			
				for(int i = 0; i < tokens.length; i++){
					switch(tokens[i]) {
					case "Circle":
						if(tokens.length == 2 && Double.parseDouble(tokens[1]) > 0) {
							shapeArray[count] = new Circle(Double.parseDouble(tokens[1]));
							count++;
						}
						else {
							System.out.println("Invalid radius!");
						}
						break;
						
					case "Parallelogram":
						if(tokens.length == 3 && Double.parseDouble(tokens[1]) > 0 &&  Double.parseDouble(tokens[2]) > 0) {
							shapeArray[count] = new Parallelogram(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
							count++;
						}
						else {
							System.out.println("Invalid side!");
						}
						break;
						
					case "Rectangle":
						if(tokens.length == 3 && Double.parseDouble(tokens[1]) > 0 &&  Double.parseDouble(tokens[2]) > 0) {
							shapeArray[count] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
							count++;
						}
						else {
							System.out.println("Invalid side!");
						}
						break;
						
					case "Square":
						if(tokens.length == 2 && Double.parseDouble(tokens[1]) > 0) {
							shapeArray[count] = new Square(Double.parseDouble(tokens[1]));
							count++;
						}
						else {
							System.out.println("Invalid side!");
						}
						break;
						
					case "Triangle":
						if(tokens.length == 4 && Double.parseDouble(tokens[1]) > 0 &&  Double.parseDouble(tokens[2]) > 0 &&  Double.parseDouble(tokens[3]) > 0
						&& (Double.parseDouble(tokens[1]) + Double.parseDouble(tokens[2])) > Double.parseDouble(tokens[3])
						&& (Double.parseDouble(tokens[1]) + Double.parseDouble(tokens[3])) > Double.parseDouble(tokens[2])
						&& (Double.parseDouble(tokens[2]) + Double.parseDouble(tokens[3])) > Double.parseDouble(tokens[1])
								) {
							shapeArray[count] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
							count++;
						}
						else {
							System.out.println("Invalid side!(s)");
						}
						break;

					default:
					break;
					}
				}
			}
		} catch (IOException e) {
			 System.out.println(e.getMessage());
			}
		
		System.out.println("\n" + shapeArray.length + " shapes were created:");
		
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i] + "\n");
	
		}	
	}	
	
}

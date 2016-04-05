import java.util.Scanner;
public class Chapter2Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double BMRMan, BMRWoman;
		int ChocIntakeMan, ChocIntakeWoman;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds");
		double weight = keyboard.nextDouble();
		
		System.out.println("Enter height in inches");
		double height = keyboard.nextDouble();
		
		System.out.println("Enter age in years");
		double age = keyboard.nextDouble();
		
		BMRMan = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		BMRWoman = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		
		System.out.println("Your BMR rating is " +BMRMan + " if you are a man.");
		System.out.println("Your BMR rating is " +BMRWoman + " if you are a woman.");
		
		ChocIntakeMan = (int) (BMRMan/230);
		ChocIntakeWoman = (int) (BMRWoman/230);
			
		System.out.println("Eat about " + ChocIntakeMan + " chocolate bars if you are a man to mantiain your weight");		
		System.out.println("Eat about " + ChocIntakeWoman + " chocolate bars if you are a woman to mantiain your weight");		
		
		keyboard.close();
	}

}

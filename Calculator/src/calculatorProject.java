import java.util.Scanner;

public class calculatorProject
	{
		static double num1;
		static double num2;
		public static void main(String[] args)
			{
		greeting();
//		add(num1,num2);
//		subtract(num1, num2);
//		divide(num1, num2);
//		multiply(num1, num2);
//		Math.pow(num1, num2);
			}
		public static void greeting()
		{
			System.out.println("This is a calculator program.");
			System.out.println("Please choose which type of math you would like.");
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("1: add");
			System.out.println("2: subtract");
			System.out.println("3: divide");
			System.out.println("4: multiply");
			System.out.println("5: exponents");
			int operation = userInput2.nextInt();
			
			System.out.println("Please type the first number.");
			Scanner userInput = new Scanner(System.in);
			num1 = userInput.nextDouble();
			System.out.println("Please type the second number.");
			num2 = userInput.nextDouble();
			
			if (operation == 1)
				{
					System.out.println("The answer is " + add(num1, num2));
				}
			else if (operation == 2)
				{
					System.out.println("The answer is " + subtract(num1, num2));
				}
			else if (operation == 3)
				{
					System.out.println("The answer is " + divide(num1, num2));
				}
			else if (operation == 4)
				{
					System.out.println("The answer is " + multiply(num1, num2));
		
				}
			else
				{
					System.out.println("The answer is " + Math.pow(num1, num2));
				}
		}
		
		public static double add (double x, double y)
		{
			return x + y;
		}
		
		public static double subtract (double x, double y)
			{
				return x - y;
			}
		public static double divide (double x, double y)
			{
				return x / y;
			}
		public static double multiply (double x, double y)
			{
				return x * y;
			}
		
	}

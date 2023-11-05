import java.util.Scanner;
public class BasicCalculator{
		public static void main(String[] mno){
		Scanner input=new Scanner(System.in);
		while(true){
			try{
				System.out.println("\nBasic Calculator\n");
				System.out.println("Enter an expression(for example: '5 + 10':)");
			
			//for input string
			String expression=input.nextLine();
			
			//Splitting the string by spaces
			String[]tokens=expression.split(" ");
			
			if(tokens.length !=3){
			throw new IllegalArgumentException("\nInvalid format. Please enter the expression like: '5 + 2'");
			}
			
			//parse
			double num1=Double.parseDouble(tokens[0]);
			String operator=tokens[1];
			double num2=Double.parseDouble(tokens[2]);
			double outcome=0;
			
			//alculation with operator
			switch (operator){
				case"+":
				outcome=num1+num2;
				break;
				
				case"-":
				outcome=num1-num2;
				break;
				
				case"*":
				outcome=num1*num2;
				break;
				
				case"/":
				if (num2==0){
					throw new ArithmeticException("\nDivision by 0 is not allowed.");
				}
				outcome=num1/num2;
				break;
				
				default:
				throw new IllegalArgumentException("\nEntered operator is invalid. Valid operators are: '+', '-', '/', '*'");
			}
			
			//Result
			System.out.println("Result:"+outcome);
			
			//Asking to continue
			System.out.println("\nWould you like to continue the calculation? (Enter 'Y' to continue or press any key to finish)\n");
			String response=input.nextLine().toLowerCase();
			
			//if the input is not y, the loop will exit with a message
			if(!response.equals("y")){
				System.out.println("Thank you for using the Basic Calulator");
				break;
			}
			}

			catch(IllegalArgumentException | ArithmeticException e){
				System.out.println("Error:"+e.getMessage());
			}
		}
		}
	}
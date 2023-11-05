BASIC CALCULATOR
Explanation
This is a Basic Calculator to perform basic mathematical operations (Addition, Subtraction, Multiplication and Division) of two numbers.
The program will prompt you to enter an expression in the format “number operator number” (e.g. “5 + 10”) and calculate and display the result.

Instructions:
1.On starting the program, you have to enter a mathematical expression in the following format: “number operator number”(e.g.“5 + 10”). 
  The program supports four basic operators: (+, -, /, *). Invalid expressions will be rejected with a message displayed and you will need to re-enter a valid expression.
2.If you enter an invalid expression or attempt to divide by zero ‘0’, the program will display an error message and prompt you to re-enter a valid expression.
3.After entering the valid expression, the program will calculate the numbers and display the result.
4.You will be asked if you want to continue the program. To continue, enter ‘Y’ (case-insensitive). To exit the program, press any key other than ‘Y’.
5.The program will continue running until you decide to exit it.

Design and Implementation:
The program is implemented as a basic calculator with the following design choices:
•It uses a Scanner to read input from the user.
•It uses a while loop to keep the calculator running until the user decides to exit.
•The program splits the input expression into three parts (two numbers and an operator) using space between the operator.
•It checks the validity of the input expression and handles potential exceptions (e.g. division by zero or invalid operator) by using try-catch.
•The calculator supports four basic mathematical operations: addition, subtraction, multiplication, and division.
•It displays the result of the calculation and prompts the user to continue or exit.
•If the user enters an invalid expression or attempts to divide by zero, the program provides an error message.

How to Compile and Run:
1.Make sure you have installed Java on your system.
2.Save the Java code in a file with a “.java” extension, like “BasicCalculator.java”.
3.Open the command prompt (CMD) and navigate to the directory where you saved the “BasicCalculator.java” file.
4.Compile the Java program using the javac command, e.g. “javac BasicCalculator.java”.
5.Run the compiled program using the java command e.g. “java BasicCalculator”.
6.Enter a valid expression to perform calculations and display the result. To exit the program, 
  press any key other key other than ‘Y’ when asked after the display result.

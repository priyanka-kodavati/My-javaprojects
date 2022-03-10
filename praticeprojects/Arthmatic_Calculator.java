package praticeprojects;
import java.util.Scanner;
public class Arthmatic_Calculator {
	

		public static void main(String args[]) {
			 double n1, n2; 
			    
			    Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the numbers");
		        n1 = sc.nextDouble();
		        n2 = sc.nextDouble();
		        System.out.println("Enter the operator (+,-,*,/,%)");
		      
		        char op = sc.next().charAt(0);
		        double d = 0;
		        switch (op) {
		        case '+':
		            d = n1 + n2;
		            break;
		        case '-':
		            d = n1 - n2;
		            break;
		        case '*':
		            d = n1 * n2;
		            break;
		        case '/':
		            d = n1 / n2;
		            break;
		        case '%':
		        	d = n1 % n2;
		        	break;
		        default:
		            System.out.println("You enter wrong input");
		            break;
		        }
		        System.out.println("The final result:");
		        System.out.println();
		        System.out.println(n1 + " " + op + " " + n2+ " = " + d);
		}		


		}

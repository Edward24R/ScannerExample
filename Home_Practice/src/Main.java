import java.util.Scanner;

public class Main {
public static void main (String[]args) {

@SuppressWarnings("resource")
Scanner Calc = new Scanner (System.in);

double side1;
double side2;
double side3;

System.out.println("Please Enter Triangle Side Values");
System.out.println("Enter side1:");
side1= Calc.nextDouble();
System.out.println("Enter side2:");
side2= Calc.nextDouble();
System.out.println("Enter side3:");
side3= Calc.nextDouble();


double area= FunctionA.areaOfTriangle(side1,side2,side3);

System.out.println("Area of Triangle"+area);		

		
  }
		
}

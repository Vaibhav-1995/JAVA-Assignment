// Check the given number is EVEN or ODD.
/*class EvenorOdd{
	
	public static void checkEvenorOdd(int num){
		if(num%2==0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is even");
		}
	}
	public static void main(String[] args){
		checkEvenorOdd(20);
	}
} */
//-----------------------------------------------------
2. Write a Java Program to find the Factorial of given number. 
--->>class FactorialExample{
     public static void main(String args[]){
     int i,fact=1;
     int number=5;  //it is the number of calculate factorial
     for(i=1;i<=number;i++){
     	fact=fact*i;
      }
      System.out.println("Factorial of"+number+"is:"+fact);
      }
      }
//-----------------------------------------------------
3. Find the Factorial of a number using Recursion.
--->>import java.io.*;
     class Perfect{
     	private int num;
	public Perfect(int n){
		num = n;
	}
        public int sumOfFactors(int i){
		if(i==1)
		return1+sumOfFactors(i+1);
		else if(i < num && num % i == 0) 
		return i+ sumIfFactors(i+1);
		else if(i < num && num % i !=0)
		return i+ sumIfFactors(i+1);
		else
			return 0;
		}
--------------------------------------------------------------
//4. Swap two numbers without using third variable approach. 
/*
class Swap{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		System.out.println("Before swap a="+a+" and b="+b);
		
		a =a + b;
		b =a - b;
		a =a - b;
	
		System.out.println("After swap a="+a+" and b="+b);
	}
}
*/	
//-----------------------------------------------------	
//5. How to check the given number is Positive or Negative in Java?
/*
class Check{
	public static void main(String[] args){
		int num= 1200;
		if(num>=0){
			System.out.println("Number is positive");
		}
		else{
			System.out.println("Number is Negative");
		}
	}
}
*/
//-----------------------------------------------------
//6. Write a Java Program to find whether given number is Leap year or NOT? 
/*
class Leapyear{
	public static void main(String[] args){
		int year= 1300;
		if((year%100!=0) & (year%4==0)){
			System.out.println("Year is Leap year");
		}
		else if(year%400==0){
			System.out.println("Year is Leap year");
		}
		else{
			System.out.println("Year is Not a Leap year");
		}
	}
}
*/
//-----------------------------------------------------
//7. Write a Java Program to Print 1 To 10 Without Using Loop. 

/*
class Printnum{
	public static void Recursion(int n){
		if (n<=10){
			System.out.println(n);
			Recursion(n+1);
		}
	}
	public static void main(String[] args){
		Recursion(1);
	}
}
*/
//-----------------------------------------------------
//8. Write a Java Program to print the digits of a Given Number. 
--->>import java.util.Scanner;
public class Extract_Digits 
{
    public static void main(String args[])
    {
        int n, m, a, i = 1, counter = 0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            n = n / 10;
            counter++;
        }
        while(m > 0)
        {
            a = m % 10;
            System.out.println("Digits at position "+counter+":"+a);
            m = m / 10;
            counter--;
        }
//-----------------------------------------------------
//9. Write a Java Program to print all the Factors of the Given number.
/*
class Factors{
	public static void main(String[] args){
		int num = 13;
		System.out.print("Factors of "+num+" are ");
		for (int i=1;i<=num;i++){
			if (num%i==0){
				System.out.print(i+" ");
			}
		}
	}
}
*/
 //-----------------------------------------------------
//10. Write a Java Program to find sum of the digits of a given number.
/*
class Digitsum{
	public static void main(String[] args){
		int a = 12341;
		int digitsum = 0;
		while(a>0){
			int rem=a%10;
			a=a/10;
			digitsum=digitsum+rem;
		}
		System.out.println(digitsum);
	}
} 
*/

//-----------------------------------------------------
//11. Write a Java Program to find the smallest of 3 numbers (a,b,c).
/*
class Smallest{
	static void least(int a, int b, int c){
		if(a < b){
			if(b < c){
				System.out.println(a+" is smallest number");
			}
			else if(c<a){
				System.out.println(c+" is smallest number");
			}
			else{
				System.out.println(a+" is smallest number");
			}
		}
		else if(b < a){
			if(a < c){
				System.out.println(b+" is smallest number");
			}
			else if(c<b){
				System.out.println(c+" is smallest number");
			}
			else{
				System.out.println(b+" is smallest number");
			}
		}
		else{
				System.out.println(c+" is smallest number");
			}
	}
	public static void main(String[] args){
		least(10,30,10);
	}
}
*/

//-----------------------------------------------------
//12. How to add two numbers without using the arithmetic operators in Java? 
/*
class Addition{
	public static void main(String[] args){
		
		int a =10;
		int b =30;
		for (int i=1;i<=b;i++){
			a++;
		}
		System.out.println("Addition of two numbers="+a);
	}
}
*/
//-----------------------------------------------------
//13. Write a java program to Reverse a given number. 
/*
class Reversenum{
	public static void main(String[] args){
		int a = 1234;
		int b = 0;
		while(a>0){
			int rem=a%10;
			a=a/10;
			b=(b*10)+rem;
		}
		System.out.println(b);
	}
}
*/
//-----------------------------------------------------
//14. Write a Java Program to find GCD of two given numbers. 
--->>public class FindGCDExample2  
{  
public static void main(String[] args)   
{  
int n1=50, n2=60;  
while(n1!=n2)   
{  
if(n1>n2)  
n1=n1-n2;  
else  
n2=n2-n1;  
}  
System.out.printf("GCD of n1 and n2 is: " +n2);  
}  
}  
//-----------------------------------------------------
//15. Write a java program to LCM of TWO given number. 
--->>public class LcmExample1  
{  
public static void main(String args[])   
{  
int a = 12, b = 9, gcd = 1;  
//finds GCD  
for(int i = 1; i <= a && i <= b; ++i)   
{  
//divides both the numbers by i, if the remainder is 0 the number is completely divisible by i  
//Checks that i is present in both or not  
//returns true if both conditions are true  
if(a % i == 0 && b % i == 0)  
//assigns i into gcd  
gcd = i;  
}  
//determines lcm of the given number  
int lcm = (a * b) / gcd;  
//prints the result  
System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);  
//-----------------------------------------------------
//16. Write a java program to LCM of TWO given number using Prime Factors method. 
--->>public class Main {
  public static void main(String[] args) {

    int n1 = 72, n2 = 120, lcm;

    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}
//-----------------------------------------------------
//17. Check whether the Given Number is a Palindrome or NOT.
/*
class Palindrome{
	public static void main(String[] args){
		int num = 121;
		int a = num;
		int b = 0;
		while(a>0){
			int rem=a%10;
			a=a/10;
			b=(b*10)+rem;
		}
		System.out.println(b);
		if (num==b){
			System.out.println("Numer is palindrome number");
		}
		else{
			System.out.println("Numer is Not palindrome number");
		}
	}
} 
*/
//-----------------------------------------------------
//18. Write a Java Program to print all the Prime Factors of the Given Number.
--->>import java.util.Scanner;

public class PrimeFactors {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      number = sc.nextInt();
     
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}
//-----------------------------------------------------
//19. To print the following series EVEN number Series 2 4 6 8 10 12 14 16 .....
/*
class Even{
	public static void main(String[] args){
		int a = 20;
		for (int i=2;i<=a;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		
		//Alternate method
		//int i=2;
		//while(i<=a){
		//	System.out.print(i+" ");
		//	i=i+2;
		//}
		
	}
}
*/
//-----------------------------------------------------
//20. To print the following series ODD number Series 1 3 5 7 9 11 13 ....
/*
class Odd{
	public static void main(String[] args){
		int a = 20;
		
		//for (int i=1;i<=a;i++){
		//	if(i%2!=0){
		//		System.out.print(i+" ");
		//	}
		//}
		
		 //Alternate method
		int i=1;
		while(i<=a){
			System.out.print(i+" ");
			i=i+2;
		}
		
	}
}
*/
/*

///Abstract Assignment------------*********************------------------
1}Create an abstract class 'Parent' with a method 'message'.
 It has two subclasses each having a method with the same name 'message' 
 that prints "This is first subclass" and "This is second subclass" respectively. 
 Call the methods 'message' by creating an object for each subclass.     */
 
 /*
abstract class Parent{
	abstract void message();
}

class Child1 extends Parent{
	void message(){
		System.out.println("This is first subclass") ;
	}
}
class Child2 extends Parent{
	void message(){
		System.out.println("This is second subclass") ;
	}
}

public class Abstractpra{
	public static void main(String[] args){
		Parent p1 = new Child1();
		p1.message();
		Parent p2 = new Child2();
		p2.message();
	}
}
 */
//--------------------------------------------------------------
/* 2}Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
Call this method by creating an object of each of the three classes.   */

/*
abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{
	void getBalance(){
		System.out.println("$100");
	}
}
class BankB extends Bank{
	void getBalance(){
		System.out.println("$150");
	}
}
class BankC extends Bank{
	void getBalance(){
		System.out.println("$200");
	}
}
public class Abstractpra{
	public static void main(String[] args){
		Bank b1 = new BankA();
		b1.getBalance();
		Bank b2 = new BankB();
		b2.getBalance();
		Bank b3 = new BankC();
		b3.getBalance();
	}
}

*/
//--------------------------------------------------------------
/* 3}We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
by student A and in four subjects (each out of 100) by student B. 
Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' each having a method with the same name 
which returns the percentage of the students. The constructor of student A takes 
the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
Create an object for eac of the two classes and print the percentage of marks for both the students.
*/
/*
abstract class Marks{
	abstract float getPercentage();
}
class A extends Marks{
	int a;
	int b;
	int c;
	A(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	float getPercentage(){
		float add=(this.a+this.b+this.c);
		float percentage=(add/150)*100;
		System.out.println(percentage);
		return percentage;
	}
}
class B extends Marks{
	int a;
	int b;
	int c;
	int d;
	B(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	float getPercentage(){
		float add=(this.a+this.b+this.c+this.d);
		float percentage=(add/200)*100;
		return percentage;
	}
}
class Getmarks{
	public static void main(String [] args){
		Marks m= new A(50,46,23);
		Marks m1=new B(46,48,42,46);
		System.out.println("Percentage of Student A is:"+m.getPercentage());
		System.out.println("Percentage of Student B is:"+m1.getPercentage());
	}
}
*/

//--------------------------------------------------------------
/* 4}An abstract class has a construtor which prints "This is constructor of abstract class", 
an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method". 
Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
*/

/*
abstract class Abstract{
	Abstract(){
		System.out.println("This is constructor of abstract class");
	}
	abstract void a_method();
	void nonabstract_method(){
		System.out.println("This is a normal method of abstract class");
	}
}
class SubClass extends Abstract{
	void a_method(){
		System.out.println("This is abstract method");
	}
}
public class Abstractpra{
	public static void main(String[] args){
		Abstract a1 = new SubClass();
		a1.a_method();
		a1.nonabstract_method();
	}
}
*/
//--------------------------------------------------------------
/* 5}Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and 
a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. 
Now create an object for each of the subclasses and call their respective methods.
*/

/*
abstract class Animals{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals{
	void cats(){
		System.out.println("Cats meow");
	}
	void dogs(){}
}
class Dogs extends Animals{
	void dogs(){
		System.out.println("Dogs bark");
	}
	void cats(){}
}
public class Abstractpra{
	public static void main(String[] args){
		Animals a1 = new Cats();
		a1.cats();
		Animals a2 = new Dogs();
		a2.dogs();
	}
}

*/
-------------------------------------------------------------------------
/* 6}We have to calculate the area of a rectangle, a square and a circle. 
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' 
taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
The parameters of 'RectangleArea' are its length and breadth, 
that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
Now create another class 'Area' containing all the three methods 
'RectangleArea', 'SquareArea' and 'CircleArea' for 
printing the area of rectangle, square and circle respectively. 
Create an object of class 'Area' and call all the three methods.
*/
/*
abstract class Shape{
	abstract void RectangleArea(int length,int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(double radius);
}
class Area extends Shape{
	void RectangleArea(int length,int breadth){
		System.out.println("Area of Rectangle "+(length*breadth));
	}
	void SquareArea(int side){
		System.out.println("Area of Square "+(side*side));
	}
	void CircleArea(double radius){
		System.out.println("Area of Circle "+(2.0*3.14*radius*radius));
	}
}
public class Abstractpra{
	public static void main(String[] args){
		Shape s1 = new Area();
		s1.RectangleArea(10,20);
		s1.SquareArea(10);
		s1.CircleArea(7.0);
	}
}
*/
-----------------------------------------------------------------------------------
/////**********Assignment no 2***************------------------
/*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
--->>public class Exercise1 {
 
 public static void main(String[] args) {
  System.out.println("Hello\nAlexandra Abramov!");
 }
}
----------------------------------------------------------------------
/*2.Write a Java program to print the sum of two numbers.
--->>public class Exercise2 {
 
 public static void main(String[] args) {
  System.out.println(24+26);
 }
}
----------------------------------------------------------------------
/*3.Write a Java program to divide two numbers and print on the screen.
--->>public class Exercise2 {
 
 public static void main(String[] args) {
  System.out.println(24+26);
 }
}
-----------------------------------------------------------------------
/*4.Write a Java program to print the result of the following operations.
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
--->>public class Exercise3 {
 
 public static void main(String[] args) {
  System.out.println(50/3);
 }
}
----------------------------------------------------------------------
/*5.Write a Java program that takes two numbers as input and display the 
product of two numbers.
Input first number: 25
Input second number: 5
---->>public class Main
{
  static int x = 25;
  static int y = 5;
 public static void main(String[] args)
  {
   System.out.println(x*y);
   }
}
---------------------------------------------------------------------
/*6.Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers.
--->>import java.util.Scanner;
 
public class Exercise6 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
 
  System.out.println(num1 + " + " + num2 + " = " + 
  (num1 + num2));
   
  System.out.println(num1 + " - " + num2 + " = " + 
  (num1 - num2));
   
  System.out.println(num1 + " x " + num2 + " = " + 
  (num1 * num2));
   
  System.out.println(num1 + " / " + num2 + " = " + 
  (num1 / num2));
 
  System.out.println(num1 + " mod " + num2 + " = " + 
  (num1 % num2));
 }
}
----------------------------------------------------------------------
/*7. Write a Java program that takes a number as input and prints its multiplication 
table upto 10.
--->>import java.util.Scanner;
 
public class Exercise7 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input a number: ");
  int num1 = in.nextInt();
   
  for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
  }
 }
}
---------------------------------------------------------------------------
/*8. Write a Java program to compute the specified expressions and 
print the output.
--->>public class Exercise9 {
 
    public static void main(String[] arg) {

        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
}
--------------------------------------------------------------------------
/*9.Write a Java program to compute a specified formula.
--->>public class Exercise10 {
    public static void main(String[] args) {
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result); //
    }
}
-------------------------------------------------------------------------
/*10.Write a Java program to print the area and perimeter of a circle.
--->>public class Exercise11 {
 
   private static final double radius = 7.5;

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
-----------------------------------------------------------------------------
/*11.Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers.
--->>import java.util.Scanner;
 
public class Exercise12 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
   
  System.out.print("Input fourth number: ");
  int num4 = in.nextInt();
  
  System.out.print("Enter fifth number: ");
  int num5 = in.nextInt();
   
   
  System.out.println("Average of five numbers is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5);
 }
}
----------------------------------------------------------------------------
/*12.Write a Java program to print the area and perimeter of a rectangle.
--->>public class Exercise13 {
 
   public static void main(String[] strings) {

        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}
------------------------------------------------------------------------
/*13.Write a Java program to print a face.
--->>public class Exercise16 {
    public static void main(String[] args)
    {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
}
--------------------------------------------------------------------------
/*14.Write a Java program to add two binary numbers.
--->>import java.util.Scanner;
public class Exercise17 {
 public static void main(String[] args)
 {
  long binary1, binary2;
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Input first binary number: ");
  binary1 = in.nextLong();
  System.out.print("Input second binary number: ");
  binary2 = in.nextLong();

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}
----------------------------------------------------------------------------
/*15.Write a Java program to multiply two binary numbers.
--->>import java.util.Scanner;
public class Exercise18 {
 public static void main(String[] args)
 {
  long binary1, binary2, multiply = 0;
  int digit, factor = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Input the first binary number: ");
  binary1 = in.nextLong();
  System.out.print("Input the second binary number: ");
  binary2 = in.nextLong();
  while (binary2 != 0)
  {
   digit = (int)(binary2 % 10);
   if (digit == 1) 
   {
    binary1 = binary1 * factor;
    multiply = binaryproduct((int) binary1, (int) multiply);
   } 
   else
   {
    binary1 = binary1 * factor;
   }
   binary2 = binary2 / 10;
   factor = 10;
  }
  System.out.print("Product of two binary numbers: " + multiply+"\n");
 }
 static int binaryproduct(int binary1, int binary2) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }
  return binary_prod_result;
 }
 }
 -------------------------------------------------------------------------------
 /*16.Write a Java program to convert a decimal number to binary number.
--->>public class DecimalToBinaryExample2{    
public static void toBinary(int decimal){    
     int binary[] = new int[40];    
     int index = 0;    
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println();//new line  
}    
public static void main(String args[]){      
System.out.println("Decimal of 10 is: ");  
toBinary(10);    
System.out.println("Decimal of 21 is: ");  
toBinary(21);    
System.out.println("Decimal of 31 is: ");    
toBinary(31);  
}}      
-------------------------------------------------------------------------------
/*17.Write a Java program to convert a decimal number to hexadecimal number.
--->>public class DecimalToHexExample2{    
public static String toHex(int decimal){    
     int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0)  
     {  
       rem=decimal%16;   
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
    return hex;  
}    
public static void main(String args[]){      
     System.out.println("Hexadecimal of 10 is: "+toHex(10));  
     System.out.println("Hexadecimal of 15 is: "+toHex(15));  
     System.out.println("Hexadecimal of 289 is: "+toHex(289));  
------------------------------------------------------------------------------
/*18.Write a Java program to convert a decimal number to octal number.
--->>public class DecimalToOctalExample2{    
//creating method for conversion so that we can use it many times  
public static String toOctal(int decimal){    
    int rem; //declaring variable to store remainder  
    String octal=""; //declareing variable to store octal  
    //declaring array of octal numbers  
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
    //writing logic of decimal to octal conversion   
    while(decimal>0)  
    {  
       rem=decimal%8;   
       octal=octalchars[rem]+octal;   
       decimal=decimal/8;  
    }  
    return octal;  
}    
public static void main(String args[]){      
//Calling custom method to get the octal number of given decimal value  
System.out.println("Decimal to octal of 8 is: "+toOctal(8));  
System.out.println("Decimal to octal of 19 is: "+toOctal(19));  
System.out.println("Decimal to octal of 81 is: "+toOctal(81));  
------------------------------------------------------------------------------
/*19.Write a Java program to convert a binary number to decimal number.
--->>public class BinaryToDecimalExample2{  
public static void main(String args[]){  
System.out.println(Integer.parseInt("1010",2));  
System.out.println(Integer.parseInt("10101",2));  
System.out.println(Integer.parseInt("11111",2));  
}}  
---------------------------------------------------------------------------------
/*20.Write a Java program to convert a binary number to hexadecimal number.
--->>import java.util.Scanner;
public class Exercise23 {
 public static void main(String[] args) 
 {
  int[] hex = new int[1000];
  int i = 1, j = 0, rem, dec = 0, bin;
  Scanner in = new Scanner(System.in);
  System.out.print("Input a Binary Number: ");
  bin = in.nextInt();
  while (bin > 0) {
   rem = bin % 2;
   dec = dec + rem * i;
   i = i * 2;
   bin = bin / 10;
  }
   i = 0;
  while (dec != 0) {
   hex[i] = dec % 16;
   dec = dec / 16;
   i++;
  }
  System.out.print("HexaDecimal value: ");
  for (j = i - 1; j >= 0; j--)
  {
   if (hex[j] > 9) 
   {
    System.out.print((char)(hex[j] + 55)+"\n");
   } else
   {
    System.out.print(hex[j]+"\n");
   }
  }
 }
}
---------------------------------------------------------------------------------
/*21.Write a Java program to convert a binary number to a Octal number.
--->>import java.util.*;
public class Exercise24 {
public static void main(String[] args) 
    {
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
      while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
 System.out.print("\n");
 
    }
}
----------------------------------------------------------------------------
/*21.Write a Java program to convert a octal number to a decimal number.
--->>import java.util.Scanner;

public class Exercise25 {
 
public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     long octal_num, decimal_num = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
    octal_num = in.nextLong();
    while (octal_num != 0) 
     {
      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
      octal_num = octal_num / 10;
     }
    System.out.print("Equivalent decimal number: " + decimal_num+"\n");
   }
}
----------------------------------------------------------------------------
/************Method Assignments***********--------------------------
/*1.Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different methods with the same name 'printn' having a parameter for each datatype.
--->>public class PrintNumber {
    public int print(int a){
        System.out.println(a);
        return a;
    }
     public float print(float b){
         System.out.println(b);
        return b;
    }
      public double print(double c){
           System.out.println(c);
        return c;
       
    }
       public String print(String d){
           System.out.println(d);
        return d;
    }

public static void main(String[] args) {
      
PrintNumber a = new PrintNumber ();
PrintNumber b = new PrintNumber ();
a.print("madjber");
a.print(9.23);
a.print(0.2221);
a.print(25);

}
-------------------------------------------------------------------------
/*2.Create a class to print an integer and a character with two methods having the same 
name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), 
then that of the second method will be of the form (char c, int n).
--->>public class Print 
public static void main(String[] args) {
Print obj = new Print();

        obj.Printn(10, 'A');

        obj.Printn('B', 5);
}
	void Printn(int a , char c){  

        System.out.println("Integer is: "+a+ "\t Char is: "+c);
}    
void Printn(char c,int a ){

System.out.println("Char is: "+c+ "\tInteger is: "+a );
	}   
}
---------------------------------------------------------------------------
/*3.Create a class to print the area of a square and a rectangle. The class has two methods with the same 
name but different number of parameters. The method for printing area of rectangle has two parameters which 
are length and breadth respetively while the other method for printing area 
of square has one parameter which is side of square.
--->>//Java Program to Find the Area of Square, Rectangle and Circle using Method Overloading
public class Main 
{
    //Driver Code
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        // Calling function
        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        Circle obj1 = new Circle();
        // Calling function
        obj1.Area(3);
        obj1.Area(5.5);
        Square obj2 = new Square();
        // Calling function
        obj2.Area(20);
        obj2.Area(5.2);
        
    }
}
class Square 
{
    // Overloaded function to
    // calculate the area of the square
    // It takes one double parameter
    void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
    // Overloaded function to
    // calculate the area of the square
    // It takes one float parameter
    void Area(float side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
}
class Circle 
{
    static final double PI = Math.PI;
  
    // Overloaded function to
    // calculate the area of the circle.
    // It takes one double parameter
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
  
    // Overloaded function to
    // calculate the area of the circle.
    // It takes one float parameter
    void Area(float r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
}
class Rectangle 
{
     // Overloaded function to
    // calculate the area of the rectangle
    // It takes two double parameters
    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
    // Overloaded function to
    // calculate the area of the rectangle.
    // It takes two float parameters
    void Area(int l, int b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
}
------------------------------------------------------------------------------
/*4.Create a class 'Student' with three data members which are name, age and address. The constructor of the 
class assigns default values name as "unknown", age as '0' and address as "not available". It has two members 
with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the 
second method takes has three parameters which are assigned to name, age and address respectively. Print the name, 
age and address of 10 students.
Hint - Use array of objects
--->>import java.util.*;

public class Student

{

String name;

int age;

String address;

public Student()

{

this.name="unknown";

this.age=0;

this.address="not avaliable";

}

public void setinfo(int age,String name)

{

this.name=name;

this.age=age;

}

public void setinfo(int age ,String name,String address)

{

this.name=name;

this.age=age;

this.address=address;

}

@Override

public String toString()

{

return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";

}

public static void main(String[] args)

{

List<Student> stu=new ArrayList<>();

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.get(0).setinfo(55, "Name1");

stu.get(2).setinfo(50, "Name3","Bombay,India");

stu.get(3).setinfo(45, "Name4","Bhopal,India");

stu.get(5).setinfo(30, "Name6","Pune,India");

stu.get(6).setinfo(65, "Name7","Delhi,India");

stu.get(8).setinfo(55, "Name9");

for(Student s :stu)

{

System.out.println(s);

}

}

}
-------------------------------------------------------------------------------
/*5.Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two 
subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an
Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.
--->>class Program
{
    class Degree
    {
        static void getDegree()
        {
            Console.WriteLine("I got a degree");               
        }

        class Undergraduate
        {
            static void getDegree()
            {
                Console.WriteLine("I am an Undergraduate");
            }

        }

        class Postgraduate
        {
            static void getDegree()
            {
                Console.WriteLine("I am a Postgraduate");
            }

        }
    }
}

static void Main(string[] args)
{
    Degree.x;
    Undergraduate.y;
    Postgraduate.z;

    x.getDegree();
    y.getDegree();
    z.getDegree();

    Console.ReadLine();
}
------------------------------------------------------------------------
/*6.A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank 
C respectively. We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses 
named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns 
the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.
--->>import java.util.*;

abstract class Bank

{

   abstract void getBalance();

}

class BankA extends Bank

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank A is $1000");

   }

}

class BankB extends Bank

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank B is $1500");

   }

}

class BankC extends Bank

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank C is $2000");

   }

}

public class Main

{

public static void main(String[] args)

{

    Bank A = new BankA();

    A.getBalance();

    Bank B= new BankB();

    B.getBalance();

    Bank C = new BankC();

    C.getBalance();

}

}
--------------------------------------------------------------------
/*A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'.
Its subclass also has an integer data member 'j' and a method named 'printNum' to print the value 
of 'j'. Make an object of the subclass and use it to assign a value to 'i' and to 'j'. Now call the method 
'printNum' by this object.
--->>class I{
int i;
public void printNum(){
System.out.println(i);
  }
}
class J extends I{
   int j;
   public void printnum(){
   System.out.println(j);
   }
  }
  class Ans{
    publi static void main(String[] args){
    J a= new J();
    a.i = 5;
    a.j = 7;
    a.j = a.i;
    a.printnum();
    }
  }
 --------------------------------------------------------------------------
 /*8.Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static 
 method with the same name to print "Child". Now call this method by the objects of the two classes. 
 Also, call this method by an object of the parent class refering to the child class i.e. A obj = new B().
 --->>
 
 -----------------------------------------------------------------------------
 /*9.All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum 
 interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, 
 suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are 
 free to use 4% interest rate or to set any rates above it.
 Write a JAVA program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism 
 concept. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB 
 etc). Assume and implement required member variables and functions in each class.
--->>Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
}
Class Account
{
// Account Detail ...
// Few functions ...
}
Class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() { }
Public double GetWithdrawalLimit() { }
}
Class SBI: public RBI
{
//Use RBI functionality or define own functionality.
}
Class ICICI: public RBI
{
//Use RBI functionality or define own functionality.
}
________________________________________-----------------------------------
@@@@@  Level 1
/*1.1.Write a program to print the sum of two numbers entered by user by defining your own method.
--->>public class SumOfNumbers1  
{  
public static void main(String args[])   
{  
int n1 = 225, n2 = 115, sum;  
sum = n1 + n2;  
System.out.println("The sum of numbers is: "+sum);  
}  
}  
------------------------------------------------------------------------------
/*2.Define a method that returns the product of two numbers entered by user.
--->>import java.util.Scanner;
public class ProductOfNumbur1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
// create scanner object
System.out.print("Enter the first number: ");
int num1=sc.nextInt();
//this method reads value for num1 providing by user
System.out.print("Enter the second number: ");
int num2=sc.nextInt();
//this method reads value for num2 providing by user
sc.close();//closing the scanner class
calcProduct(num1,num2); //calling the method
}
//calcTotal method
public static void calcProduct(int x,int y){
    int result=0;
result=x*y;
System.out.println("product of two numbers  "+result);
}
}
---------------------------------------------------------------------------
/*3.3.Write a program to print the circumference and area of a circle of radius entered 
by user by defining your own method
--->>import java.util.Scanner;  
public class AreaAndCircumferenceOfCircle  
{  
public static void main(String args[])  
{  
double circumference, area;   
int radius;  
//object of the Scanner class  
Scanner sc=new Scanner (System.in);  
System.out.print("Enter the radius of the circle: ");  
radius=sc.nextInt();  
//calculating area of circle  
area=Math.PI*(radius*radius);  
//prints the calculated area  
System.out.println("The area of the circle is: "+area);  
//calculating circumference of circle  
circumference=Math.PI*2*radius;  
//prints the calculated circumference  
System.out.println("The circumference of the circle is: "+circumference);  
}  
}  
----------------------------------------------------------------------------
/*4.Define two methods to print the maximum and the minimum number respectively among 
three numbers entered by user.
--->>public class Main {   public static void main(String args[]) {   
// creating scanner to accept radius of circle Scanner scanner = new Scanner(System.in); 
System.out.println("Welcome in Java program to find largest and smallest of three numbers");   
System.out.println("Please enter first number :"); int first = scanner.nextInt();   
System.out.println("Please enter second number :"); int second = scanner.nextInt();  
System.out.println("Please enter third number :"); int third = scanner.nextInt();   
int largest = largest(first, second, third); int smallest = smallest(first, second, third);   
System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest); 
System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);   
scanner.close(); }

-----------------------------------------------------------------------------
/*5.A person is elligible to vote if his/her age is greater than or equal to 18. Define a 
method to find out if he/she is elligible to vote.
--->>// Java program to find valid for vote or not
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) 
	{
          // Declaring variables
          int age,shrt;
          // taking values from user at run time
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter your age");
		age = scan.nextInt();
		// Checking condition for voting..
		if(age>=18)
		{
			System.out.println("Welcome to voting system Yo can Vote");
		}
		else
		{
			shrt= (18 - age);
			System.out.println("Sorry,You can vote after :"+ shrt + " years");
		}

	}

}
-------------------------------------------------------------------------------
/*6.Define a method to find out if number is prime or not.
--->>public class Main {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
-------------------------------------------------------------------------------
/*7.Write a program which will ask the user to enter his/her marks (out of 100). Define a method 
that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
--->>// Java Program to Read Grade & Displaying Equivalent Desc

// Importing Classes/Files
import java.util.*;

public class GFG {

	// Main Driver Method
	public static void main(String[] args)
	{

		// User is supposed to enter grade among them
		System.out.println(
			"Enter Grade varying from S,A,B,C,D");
		String grade = "A";

		// Checking whether grade == "S" or not
		if (grade == "S") {
			System.out.println(
				"Student has scored between 90 to 100");
		}
		// Checking whether grade == "A" or not
		else if (grade == "A") {
			System.out.println(
				"Student has scored between 80 to 90");
		}
		// Checking whether grade == "B" or not
		else if (grade == "B") {
			System.out.println(
				"Student has scored between 70 to 80");
		}
		// Checking whether grade == "C" or not
		else if (grade == "C") {
			System.out.println(
				"Student has scored between 60 to 70");
		}
		// Checking whether grade == "D" or not
		else if (grade == "D") {
			System.out.println(
				"Student has scored between 50 to 60");
		}
		else {

			// Printing message-user pressed some other key
			System.out.println(
				"The grade you entered is not valid!");
		}
	}
}
--------------------------------------------------------------------------------
/*9.9.
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 0
--->>import java.util.*;
class Ans{
public static int fact(int x){
if (x==0 || x == 1){
return 1;
}
else{
return fact(x-1)*x;
}
}

public static void main(String[] args){
System.out.println(fact(5));
System.out.println(fact(10));
System.out.println(fact(1));
System.out.println(fact(0));
}
}
----------------------------------------------------------------------------
////***********Object Assignment*************################
1.Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.
--->>class Main{
   public static void main(String args[]){
     //create array of employee object  
    Employee[] obj = new Employee[2] ;
 
     //create & initialize actual employee objects using constructor
     obj[0] = new Employee(100,"ABC");
     obj[1] = new Employee(200,"XYZ");
 
     //display the employee object data
     System.out.println("Employee Object 1:");
     obj[0].showData();
     System.out.println("Employee Object 2:");
     obj[1].showData();
  }
}
//Employee class with empId and name as attributes
class Employee{
  int empId;
  String name;
  //Employee class constructor
  Employee(inteid, String n){
     empId = eid;
     name = n;
  }
public void showData(){
   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
   System.out.println();
 }
}
----------------------------------------------------------------------------------
/*2.Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). 
The marks are entered by user.
--->>package javaapplication1;

import java.util.Scanner;

public class marks {

public static void main(String[] args) {

int roll, s1, s2, s3;
Scanner input = new Scanner(System.in);
for(int i=0; i<=8; i++){

for(int j=i; j<=8; j++){
System.out.print("Enter Roll number :");
roll = input.nextInt();

System.out.print("Enter First subject number :");
s1 = input.nextInt();

System.out.print("Enter second subject number :");
s2 = input.nextInt();

System.out.print("Enter third subject number :");
s3 = input.nextInt();

int avg = (s1 +s2 + s3)/3 ;
System.out.println("Student of Roll No " +roll + " get Avarage mark of "+avg);
}
}
}

}
-----------------------------------------------------------------------------
/*3.Write a program to calculate the average height of all the students of a class.
The number of students and their heights in a class are entered by user.
--->>import java.util.*;

class Avg{
  public static void main(String[] args){
  	
  	float sum = 0, avg;
  	
    Scanner s1 = new Scanner(System.in);
    
    System.out.println("Enter number of students");
    int n = s1.nextInt();
    
    System.out.println("Enter height of students");
    
    for (int i = 0; i < n; i++) {
    	System.out.println("Student " + (i+1) + ":");
    	float height = s1.nextFloat();
    	sum = sum + height;
    }
    
    avg = sum/n;
    System.out.println("Average heigth : " + avg);
  }
}
---------------------------------------------------------------------------
/*4.4.Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be 
entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.

--->>import java.util.Scanner;  
class BankDetails {  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    //method to display account details  
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    //method to deposit money  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
public class BankingApp {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }  
        // loop runs until number 5 is not pressed to exit  
        int ch;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. 
	    Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }  
-----------------------------------------------------------------------------
 /*5.5.Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family
(f) Unique ID No.
The program will support the following menu based activities:
(a) Create a database entry (The Unique ID number must be unique for every entry, the telephone numbers of 
two or more persons can be same if and only if the head of family is same)
(b) Edit an entry (Must be identified by only the Unique ID number)
(c) Search by keyword (Any keyword may not be complete; even if the keyword matches partially with any field,
the corresponding information must be displayed)
--->>

-----------------------------------------------------------------------------
////// Class Object Assignment*****************//////////////////
/*1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value 
of roll_no as '2' and that of name as "John" by creating an object of the class Student.
--->>package com.codesdope;

public class Student {
    String name;
    int roll_no;
}

public class TestStudent {
    
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;
        
        System.out.println("Name is " + s.name + " add roll number is " + s.roll_no);
    }
}
----------------------------------------------------------------------------------
/*2.2.
Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively 
by creating two objects of class 'Student'.
--->>class Student {

int RollNumber;

int PhoneNumber;

String Address;

}

public class CreateClass {

public static void main(String[] args) {

Student Sam = new Student();

Student John = new Student();

Sam.RollNumber=20;

Sam.PhoneNumber=1234567890;

Sam.Address="London !";

John.RollNumber=01;

John.PhoneNumber=976541230;

John.Address="China !";

System.out.println(Sam.RollNumber+" "+Sam.PhoneNumber+" "+Sam.Address); System.out.println(John.RollNumber+" "+John.PhoneNumber+" "+John.Address);

}

}
------------------------------------------------------------------------------------
3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by 
creating a class named 'Triangle' 
without any parameter in its constructor.
--->>public class Triangle {
    int a, b, c;
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.pow((s * (s - a) * (s - b) * (s - c)), .5);
    }
    public double getPerimeter() {
        return (a + b + c);
    }
}         

public class TestTriangle {
             
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 2;
        t.b = 5;
        t.c = 6;
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter);
    }
}
--------------------------------------------------------------------------------
4.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
class named 'Triangle' with constructor having the three sides as its parameters.
--->>class Triangle_qfour
{
    int s1,s2,s3;
    public Triangle_qfour(int side1,int side2,int side3)
     {
        s1=side1;
        s2=side2;
        s3=side3;
     }
       public static void main(String[] args)
       {
             Triangle_qfour t1=new Triangle_qfour(3,4,5);
             int peri=(t1.s1+t1.s2+t1.s3);
             System.out.println("perimeter is:"+peri);
             int sp=(peri/2);
             int ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));       
             int area=(int)Math.sqrt(ar);   
             System.out.println("Area is:"+area);
        }
}
-------------------------------------------------------------------------------
/*5.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by 
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and 
breadth passed as parameters to its constructor.
--->>package com.codesdope;
    public class Rectangle {
    int length;
    int breadth;
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    public int getArea() {

        return length * breadth;
    }

    public int getPerimeter() {
            return 2 * (length * breadth);
    }
}
         
public class TestRectangle {
             
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(5, 8);
        System.out.println("Area : " + a.getArea() + " Perimeter is " + a.getPerimeter());
        System.out.println("Area : " + b.getArea() + " Perimeter is " + b.getPerimeter());
    }
}---------------------------------------------------------------------------------
6.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method 
named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
--->>public class Ans4{

public static void main(String[] args){

Area a = new Area(4,5);

a.setDim();

}

}

class Area{

int length, breadth;

Area(int l , int b){

length = l;

breadth = b;

}

void setDim(){

int disp = length * breadth;

System.out.println(disp);

}

}
________________________________________
7.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its 
length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of 
the rectangle. Length and breadth of rectangle are entered through keyboard.
--->.import java.util.Scanner;
class Area
{
    int length,breadth;
  public Area(int l,int b)
  {
       length=l;
       breadth=b;
   }
  public int getArea()
  {
        return length*breadth;
  }
  
  public static void main(String[] args)
  {
     int l,b;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter length"); 
     l=s.nextInt();
     System.out.println("Enter breadth");
     b=s.nextInt();
     Area a=new Area(l,b);
    System.out.println("Area is :"+a.getArea());
  }
}  
 ------------------------------------------------------------------------------
8.Print the average of three numbers entered by user by creating a class named 'Average' having a 
method to calculate and print the average.
--->>import java.util.Scanner;
public class Exercise2 {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
---------------------------------------------------------------------------------
9.Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
with separate methods for each operation whose real and imaginary parts are entered by user.
package com.codesdope;
   
public class Complex {
    int real;
    int imag;
    public Complex(int r, int i) {

        real = r;
        imag = i;
    }
       
    public static Complex add(Complex a, Complex b) {

        return new Complex((a.real + b.real), (a.imag - b.imag));
    }
       
    public static Complex diff(Complex a, Complex b) {

        return new Complex((a.real - b.real), (a.imag - b.imag));
    }
       
    public static Complex product(Complex a, Complex b) {

        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }
      
    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }                          
}
   
public class TestComplex {
       
    public static void main(String[] args) {
           
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);
           
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();            
    }
}
--------------------------------------------------------------------------------
10.Write a program that would print the information (name, year of joining, salary, address) of 
three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
--->>class Employee{
  private String name, address;
  private int year, salary;
  public Employee(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}

class Emp{
  public static void main(String[] args){
    Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
    Employee e2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
    Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());  // printing details of employee 3
  }
}
------------------------------------------------------------------------------
11.Add two distances in inch-feet by creating a class named 'AddDistance'.
--->>import java.util.Scanner;
class Adddistance
{ 
        int feet,r;
        public void Convert(int a,int b,int c,int d)
          {
              int count=0;
              r=a+b;
              while(r>12)
              {
                   r=r-12;
                   count++;
              }
               feet=c+d+count;  
        }
       public int feet()
      {
             return feet;
       }
        public int inches()
        {
             return r;
       }
      public static void main(String[] args)
     {
          int f1,i1,f2,i2;
          Scanner s=new Scanner(System.in);
          Adddistance dis=new Adddistance();
          System.out.println("Enter distance1 in feet");
          f1=s.nextInt();
          System.out.println("Enter distance1in inches");
          i1=s.nextInt();
          System.out.println("Enter distance2 in feet");
          f2=s.nextInt();
          System.out.println("Enter distance2 in inches");
          i2=s.nextInt();
          dis.Convert(i1,i2,f1,f2);
          System.out.println("Distance in feet is"+dis.feet());
          System.out.println("Distance in inches is"+dis.inches());
}
}

//UTSA - Spring 2023 - cs1083 - 001 - prj 1 - written by: Bryan Conger - QML168 

import java.util.Scanner;
public class project1_qml168{
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input base number (bn):");
  int bn = in.nextInt();
   System.out.println("Input first number (fn):");
  int fn = in.nextInt();
   System.out.println("Input last number (ln):");
  int ln = in.nextInt();
   System.out.println("Input increasment (inc):");
  int inc = in.nextInt();
   System.out.println("Input multiple(s) skipped (ms):");
  int ms = in.nextInt();
  int result = 0;
  //scanner for user input and defining varibles

  System.out.println("- Multiplication with table -");
   System.out.println("Value" + " \t " + "Results");
  
  
  //for loop for obtaining user information and using it for the table
 for( int i = fn; i <= ln; i += inc)
 {
  result = (i* bn);
   if(result % 5 == 0)
  {
    System.out.println(i + "\t->  Skipped - " + result + " <-");
  }
   else{
  System.out.println(i + "\t"  + result); 
   }
 
  
 }
 
 System.out.println("\nThank you for using this software Bryan Conger!");
  
 }
  
  }





/*
* Wyatt Hamby and Mike Rossignol
* CIS-4520
* Project Due: 10/25/2020
*
* Based on the original code at Tutorials Point
* Modified to include user-interaction and actual shapes
* Version control via GitHub
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();
    Scanner shapeChoice = new Scanner(System.in);

    // Variables for selection purposes
    boolean repeat = true;
    int choice;
    String response = "";

    // Introduction
    System.out.println("===============");
    System.out.println(" Shape Options");
    System.out.println(" 1) Rectangle");
    System.out.println(" 2) Square");
    System.out.println(" 3) Circle");
    System.out.println("===============");
    
    // For choosing which shape to draw
    while (repeat == true) {
      while (!response.equalsIgnoreCase("yes")) {
        System.out.println();
        System.out.print("Choose a shape: ");
        choice = shapeChoice.nextInt();
        System.out.println();
        if (choice == 1) {
          shapeMaker.drawRectangle();
        } else if (choice == 2) {
         shapeMaker.drawSquare();
        } else if (choice == 3) {
         shapeMaker.drawCircle();
        } else {
          shapeMaker.drawInvalid();
        }
        System.out.print("Would you like to quit? ");
        response = shapeChoice.next();
        if (response.equalsIgnoreCase("yes")) {
          repeat = false;
        } else {
          repeat = true;
        }
      }  
    }
  }
}
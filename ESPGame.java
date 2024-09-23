/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: A program that tests extrasensory perception
 * Due: 09/22/2024
 * Platform/compiler: vscode/java
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or * any source. I have not given my code to any student.
 * Print your Name here: Ariel Niaba
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ESPGame
{
    public static void main(String[] args) throws IOException
    {
        String colors;           // The user's answer 
        int roundNum;           // The number for the rounds
        int guessNum = 0;      // Amount of values guessed
        int randomNum;        // Random Number from the system 

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);        
        
        // Display of the Assingment Title
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        // Get the file name colors.txt.
        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();
        
        // Print the 16 colors to colors.txt.
        System.out.println("There are sixteen colors from a file:");
        
        PrintWriter outputFile = new PrintWriter(filename);

        outputFile.println("1 black");
        outputFile.println("2 white");
        outputFile.println("3 gray");
        outputFile.println("4 silver");
        outputFile.println("5 maroon");
        outputFile.println("6 red");
        outputFile.println("7 purple");
        outputFile.println("8 fuchsia");
        outputFile.println("9 green");
        outputFile.println("10 lime");
        outputFile.println("11 olive");
        outputFile.println("12 yellow");
        outputFile.println("13 navy");
        outputFile.println("14 blue");
        outputFile.println("15 teal");
        outputFile.println("16 aqua");

        outputFile.close();
        
        // Open the colors.txt.
        File myFile = new File("colors.txt");
        Scanner inputFile = new Scanner(myFile);

        // Read lines from the colors.txt until no more are left.
        while (inputFile.hasNext())
        {
            // Read the next color.
            String line = inputFile.nextLine();

            // Display the last color read.
            System.out.println(line);
        }

        // Close the colors.txt.
        inputFile.close();
       
        // Repeat each round 3 times.
        for (roundNum = 1; roundNum <= 3; roundNum++)
        {   
            int colorNum = 0;       // Color number reset  
            
            // Display round number, questions and guess.
            System.out.println(); 
            System.out.print("Round ");
            System.out.println(roundNum);
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it one of list of colors above?");
            System.out.print("Enter your guess: ");
            colors = keyboard.nextLine();
            
            // If the chosen color equals any of the options than add a number to colorNum.
            if (colors.equals("black"))
                colorNum += 1;
            if (colors.equals("white"))
                colorNum += 2;
            if (colors .equals( "gray"))
                colorNum += 3;
            if (colors.equals( "silver"))
                colorNum += 4;
            if (colors.equals( "maroon"))
                colorNum += 5;
            if (colors.equals( "red"))
                colorNum += 6;
            if (colors.equals( "purple"))
                colorNum += 7;
            if (colors.equals( "fuchisa"))
                colorNum += 8;
            if (colors.equals( "green"))
                colorNum += 9;
            if (colors.equals( "lime"))
                colorNum += 10;
            if (colors.equals( "olive"))
                colorNum += 11;
            if (colors.equals( "yellow"))
                colorNum += 12;
            if (colors.equals( "navy"))
                colorNum += 13;
            if (colors.equals( "blue"))
                colorNum += 14;
            if (colors.equals( "teal"))
                colorNum += 15;
            if (colors.equals( "auqa"))
                colorNum += 16;            
            
            // Display the program's randomly selected color.
            System.out.println("I was thinking of ");
            
            Random randomNumbers = new Random();
            randomNum = randomNumbers.nextInt(16)+1; 

            if (colorNum == randomNum)
                guessNum++; 

            switch (randomNum)
            {
               case 1:
                    System.out.println("black"); 
                    break;
                case 2:
                    System.out.println("white"); 
                    break;
                case 3:
                    System.out.println("gray"); 
                    break;
                case 4:
                    System.out.println("silver"); 
                    break;
                case 5:
                    System.out.println("maroon"); 
                    break;
                case 6:
                    System.out.println("red"); 
                    break;
                case 7:
                    System.out.println("purple"); 
                    break;
                case 8:
                    System.out.println("fuchsia"); 
                    break; 
                case 9:
                    System.out.println("green"); 
                    break;
               case 10:
                    System.out.println("lime"); 
                    break;
                case 11:
                    System.out.println("olive"); 
                    break;
                case 12:
                    System.out.println("yellow"); 
                    break;
                case 13:
                    System.out.println("navy"); 
                    break;
                case 14:
                    System.out.println("blue"); 
                    break;
                case 15:
                    System.out.println("teal"); 
                    break;
                case 16:
                    System.out.println("aqua"); 
                    break;
            }    
        }

        // Display Game Over after the 3rd round.
        if (roundNum > 3)
            System.out.println("\nGame Over\n");
        
        // Display amount of correct guesses
        System.out.print("You guessed ");
        System.out.print(guessNum);
        System.out.println(" out of 3 colors correctly.\n");

        // Display User Information
        System.out.print("Enter your name: ");
        keyboard.nextLine();
        System.out.print("Describe yourself: ");
        keyboard.nextLine();
        System.out.print("Due Date: ");
        keyboard.nextLine();
        System.out.println("User Name: Ariel Niaba");
        System.out.println("User Description: I am a CMSC203 student with a major in Computer Science");
        System.out.println("Due Date: 9/22");
    }
}

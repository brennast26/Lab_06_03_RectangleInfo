package com.company;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	    double length = 0, side = 0;
        String trash = "";
        double area = 0, perimeter = 0;
        double a2 = 0, b2 = 0;
        int LengthofDiag = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the length of the rectangle in inches. ");
        if (in.hasNextInt())
        {
            length = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.print("You must enter a valid length "+trash);
            return;
        }
        System.out.print("Please enter a value for the side in inches. ");
        if (in.hasNextInt())
        {
            side = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.print("You must enter a valid input for the side. "+trash);
            return;
        }
        area = length*side;
        perimeter = (length*2)+(side*2);
        a2 = (length*length);
        b2 = (side*side);
        LengthofDiag = (int) (a2 + b2);
        System.out.print("The area of the rectangle is "+area+" in ");
        System.out.print("The perimeter of the rectangle is "+perimeter+" in ");
        System.out.print("The diagonal of the rectangle is "+LengthofDiag+" in ");

    }
}

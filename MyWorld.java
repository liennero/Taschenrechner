import greenfoot.*;  
import javax.swing.*;
import java.lang.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author jonathan
 * @version final?
 */
public class MyWorld extends World
{
    String ersteZahl;
    String zweiteZahl;
    String dritteZahl;
    String rechenzeichen;
    
    int Operation;
    int Zahl;
    int Zahl1;
    int Zahl2;
    int Zahl3;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public void act()
    {
        informationPopUp();//first pop up, shows infos
        InputPopup();//pop ups für input
        convert();
        showText();
        Greenfoot.stop();
    }

    public void informationPopUp()
    {
        JOptionPane.showMessageDialog(null, "This is a calculator written by Jonathan. Its in progress right now");
    }

    public void InputPopup()
    {
        ersteZahl=JOptionPane.showInputDialog(null, "Please type in the first number", "1. Zahl", 3);//first number pop up

        Zahl1 = Integer.parseInt (ersteZahl);//changes the string into int

        rechenzeichen=JOptionPane.showInputDialog(null, "Bitte die Rechenoperation eingeben", "Rechenoperation", 3);//second pop up for the operation

        zweiteZahl=JOptionPane.showInputDialog(null, "Bitte die zweite Zahl eingeben", "2. Zahl", 3);//third pop up for sec number

        Zahl2 = Integer.parseInt (zweiteZahl);//changes string to int
    }

    public void convert()//actual maths going on here
    {
        if (rechenzeichen.equals ("+")) //how do I check that 
        {
            Zahl3 = Zahl1 + Zahl2;
        }

        if (rechenzeichen.equals ("-"))
        {
            Zahl3 = Zahl1 - Zahl2;
        }

        if (rechenzeichen.equals ("*"))
        {
            Zahl3 = Zahl1 * Zahl2;
        }

        if (rechenzeichen.equals ("/"))
        {
            Zahl3 = Zahl1 / Zahl2;
        }
    }

    public void showText()
    {
        showText ("Erste Zahl:  " + ersteZahl, 100, 50);
        showText ("Zweite Zahl:   " + zweiteZahl, 100, 100);
        showText ("Ergebnis:"  +Zahl3, 100, 150);
    }
}
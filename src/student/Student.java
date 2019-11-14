/*
 * Program: Grading System
 * Date:    7th October, 2019.
 */
package student;

/**
 *
 * @author Justech@ubuntusystems.com
 */

//My imports
import javax.swing.JOptionPane;

public class Student {
    //Student attributes
        public static String userName = null;
        static String regNo;
        
    public static void main(String [] args) throws NumberFormatException{
        try{   
            //Welcoming message
            JOptionPane screen = new JOptionPane();
            screen.showMessageDialog(null, "Welcome to Justech grading system. \n"+"Proceed?");

            //Variable definition
            JOptionPane keyboard = new JOptionPane();
            userName = keyboard.showInputDialog("Username:");
            regNo = keyboard.showInputDialog("Registration Number:");
            
            //Object instantiation
            Grading student1 = new Grading();
            student1.gradingFunction();

            //Exit status
            System.exit(0);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog (null,e +" The meangrade cann't be null! \nProgram exiting...");
            System.exit(-1);
        }
      //Program exit status upon success
      System.exit(0);
    }
}
  

//Class definations are found here 

package student;

/**
 *
 * @author Justech@ubuntusystems.com
 */
//my imports
import javax.swing.JOptionPane;

//Import My package
import myExceptions.InvalidMeanException;

public class Grading {
    public void gradingFunction(){
        //Variable definations
        String mean, remarks;
        int m;
      
        try{
            //Scan the student's mean
            mean = JOptionPane.showInputDialog("Enter your meangrade:");
            m = Integer.parseInt(mean);
        
                if( m<0 || m>100 ){
                    throw new InvalidMeanException ();
                }
                
                //Remarks message based on the mean
            if (m >= 70) {
                remarks = "first-class honours.";
            } else if (m >= 60) {
                remarks = "second-class honours, upper division.";
            } else if (m >= 50) {
                remarks = "second-class honours, lower division.";
            } else if (m >= 40) {
                remarks = "third-class honours.";
            } else {
                remarks = "pass.";
            }
            //Output remarks
            JOptionPane screen1 = new JOptionPane();
            screen1.showMessageDialog(null, "Congratulations "+Student.userName + "!"+"\nYou have been awarded, " + remarks);

            }catch(InvalidMeanException e){
                JOptionPane screen2 = new JOptionPane();
                screen2.showMessageDialog(null,e.getMessage());
                System.exit(-1);
        }

    }
    
}


package letsgetquizzical;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JDialog;
/**
 *
 * @author Khera'S
 */
public class submit extends javax.swing.JFrame {
     public submit() 
    {
        
        
        JDialog.setDefaultLookAndFeelDecorated(true);
        
    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
        JOptionPane.YES_NO_OPTION);
    if (response == JOptionPane.NO_OPTION) {
        new second();
     
    }
    else if (response == JOptionPane.YES_OPTION) {
      if((second.ch).equals(connection.result[second.value][6]))
      {
          if(90<=second.value&&second.value<=99)
          {
              new last();
              dispose();

          }
          else if(50<=second.value&&second.value<=59)
          {
              new lakh();
              dispose();
          }
           else
          {
              new correct();
              dispose();
            }
      }
      else
      {
          new incorrect();
          dispose();
      }
    } 
    else if (response == JOptionPane.CLOSED_OPTION) {
      System.out.println("JOptionPane closed");
    }
    
       
    }
    }
    


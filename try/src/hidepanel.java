
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class hidepanel
{
    
  public hidepanel() {
  JFrame f=new JFrame("change panel");
    f.setLayout(new BorderLayout());
    final JPanel p = new JPanel();
    JButton b= new JButton("change");
  JButton b1= new JButton("change");
    p.add(new JLabel("vikash"));
    p.add(b);
    
    f.add(p, BorderLayout.CENTER);
    final JPanel p1=new JPanel();
    p1.add(new JLabel("mangal"));
    p1.add(b1);
    f.add(p1,BorderLayout.NORTH);
    p1.setVisible(false);

    //create a button which will hide the panel when clicked.
    
    b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
                p.setVisible(false);
                p1.setVisible(true);
        }   
    });
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
                p1.setVisible(false);
                p.setVisible(true);
        }   
    });
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(200,150);
    f.setVisible(true);
}
    public static void main(String[] args) {
        new hidepanel();
    }
}
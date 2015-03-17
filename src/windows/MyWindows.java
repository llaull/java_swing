package windows;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author moi
 */
public class MyWindows extends JFrame{
    
    public MyWindows(){
        
        Dimension screenSize = getToolkit().getScreenSize();
        
        setTitle("test swinging");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setIconImage(new ImageIcon(getClass().getResource("icone.png")).getImage());
        setSize(800,600);
        
        //setLocation(50, 50);
        //setBounds(screenSize.width/4, screenSize.height/4, screenSize.width/2, screenSize.height/2);
        setLocation(screenSize.width/2-this.getSize().width/2, screenSize.height/2-this.getSize().height/2);
        setVisible(true);
        setResizable(false);
    }
    
    
    
}


package ermss;

import databaseconnection.DBConnect;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ERMSS {


    public static void main(String[] args) {
        
        DBConnect.getInstance().ConnectionDB();
        
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ERMSS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Mainframe main = new Mainframe();
       main.setVisible(true);
        
        
    }
    
}

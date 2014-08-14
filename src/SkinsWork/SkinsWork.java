
package SkinsWork;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SkinsWork {

    public static void processingSkins(String laf, JFrame frame){
        try {
            UIManager.setLookAndFeel(laf);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SkinsWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(SkinsWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(SkinsWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SkinsWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SwingUtilities.updateComponentTreeUI(frame);
        
    }
    
}

import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarkLaf;

public class FlatLaf {
    public static void initialize() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize FlatLaf");
            ex.printStackTrace();
        }
    }
}
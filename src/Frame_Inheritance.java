import javax.swing.*;
import java.awt.*;

public class Frame_Inheritance extends JFrame {
    // constructor of our class
    Frame_Inheritance(){
        this.setTitle("JFrame Tuortial Bro Code");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true); // make visible

        ImageIcon icon_image = new ImageIcon("C:\\Users\\gyawa\\OneDrive - Tribhuvan University\\Pictures\\kio1.jpg"); // create imageIcon
        this.setIconImage(icon_image.getImage()); // change icon of this
        this.getContentPane().setBackground(new Color(0,0,250));
    }
}

import javax.swing.*;
import java.awt.*;

public class Pane extends JPanel {


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);

        //verticaal x
        g.fillRect(100,50, 25, 350);
        g.fillRect(150,50, 25, 350);
        g.fillRect(200,50, 25, 350);
        g.fillRect(250,50, 25, 350);

        //horizontaal y
        g.fillRect(50,150, 300, 25);
        g.fillRect(50,200, 300, 25);
        g.fillRect(50,250, 300, 25);
        g.fillRect(50,300, 300, 25);





    }
}

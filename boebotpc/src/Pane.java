import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Pane extends JPanel {
private Color c;
private ArrayList<RectangleRoute> routePieces = new ArrayList();

public void addRoutePiece(RectangleRoute routePiece){
    routePieces.add(routePiece);
}

    public void clearRoutePiece(){
        routePieces.clear();
    }

public void setColor(Color c){
    this.c = c;
}
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(c);

        //verticaal x
        g.fillRect(100,50, 25, 375);
        g.fillRect(175,50, 25, 375);
        g.fillRect(250,50, 25, 375);
        g.fillRect(325,50, 25, 375);

        //horizontaal y
        g.fillRect(50,125, 350, 25);
        g.fillRect(50,200, 350, 25);
        g.fillRect(50,275, 350, 25);
        g.fillRect(50,350, 350, 25);

        for(RectangleRoute r : routePieces){
            r.draw(g2d);
        }




    }
}

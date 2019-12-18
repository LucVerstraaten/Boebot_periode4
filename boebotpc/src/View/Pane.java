package View;

import Models.RectangleRoute;

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
        g.fillRect(100,50, 25, 445);
        g.fillRect(175,50, 25, 445);
        g.fillRect(250,50, 25, 445);
        g.fillRect(325,50, 25, 445);
        g.fillRect(400,50, 25, 445);
        g.fillRect(475,50, 25, 445);
        g.fillRect(550,50, 25, 445);
        g.fillRect(625,50, 25, 445);

        //horizontaal y
        g.fillRect(50,125, 650, 25);
        g.fillRect(50,200, 650, 25);
        g.fillRect(50,275, 650, 25);
        g.fillRect(50,350, 650, 25);
        g.fillRect(50,425, 650, 25);

        for(RectangleRoute r : routePieces){
            r.draw(g2d);
        }




    }
}

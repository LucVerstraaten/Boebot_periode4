package Models;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class RectangleRoute extends Point2D {
    //private Point2D position;
    private int width;
    private int height;
    private double x, y;

    public RectangleRoute(int width, int height){
        //this.position = position;
        this.width = width;
        this.height = height;
    }

    public void drawB(Graphics2D g2d){
        Shape shape = new Rectangle2D.Double(x,y, width, height) ;
        System.out.println("hoi");
        g2d.setColor(Color.blue);
        g2d.fill(shape);
        g2d.draw(shape);


    }
    public void drawR(Graphics2D g2d){
        Shape shape = new Rectangle2D.Double(x,y, width, height) ;
        System.out.println("hoi");
        g2d.setColor(Color.RED);
        g2d.fill(shape);
        g2d.draw(shape);


    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

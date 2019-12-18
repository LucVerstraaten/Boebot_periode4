package Models;

public class Blockade {
    private static int x1,x2,y1,y2;

    public Blockade(int x1, int x2, int y1,int y2) {
        this.x1 =x1;
        this.x2 =x2;
        this.y1 =y1;
        this.y2 =y2;
    }

    public static int getX1() {
        return x1;
    }

    public static void setX1(int x1) {
        Blockade.x1 = x1;
    }

    public static int getX2() {
        return x2;
    }

    public static void setX2(int x2) {
        Blockade.x2 = x2;
    }

    public static int getY1() {
        return y1;
    }

    public static void setY1(int y1) {
        Blockade.y1 = y1;
    }

    public static int getY2() {
        return y2;
    }

    public static void setY2(int y2) {
        Blockade.y2 = y2;
    }


}

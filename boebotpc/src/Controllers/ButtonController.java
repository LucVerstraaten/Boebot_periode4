package Controllers;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

public class ButtonController {

    private static boolean start=false;
    private static boolean end=false;

    public void StartPoint(JButton btn) {
        try {
            btn.setIcon(null);
            Image img = ImageIO.read(new FileInputStream("resources/r2-d2.jpg"));
            Image newimg = img.getScaledInstance( 25, 25,  java.awt.Image.SCALE_SMOOTH );
            btn.setIcon(new ImageIcon(newimg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void EndPoint(JButton btn) {
        try {
            btn.setIcon(null);
            Image img = ImageIO.read(new FileInputStream("resources/falcon.jpg"));
            Image newimg = img.getScaledInstance( 25, 25,  java.awt.Image.SCALE_SMOOTH );
            btn.setIcon(new ImageIcon(newimg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public void resetPoint(JButton btn) {
        try {
            btn.setIcon(null);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void addActionListener(BoebotController boc, JButton btn, int x, int y) {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (!start) {
                    boc.setStartcordx(x);
                    boc.setStartcordy(y);
                    StartPoint(btn);
                    start = true;


                } else if (start && !end) {

                    boc.setEndcordx(x);
                    boc.setEndcordy(y);
                    EndPoint(btn);
                    end = true;

                } else if (start && end) {
                    JOptionPane.showMessageDialog(null, "Klik reset if you want to change things", "WARNING: everything is slected", JOptionPane.WARNING_MESSAGE);

                }
            }

        });
    }

    public static boolean isStart() {
        return start;
    }

    public static void setStart(boolean start) {
        ButtonController.start = start;
    }

    public static boolean isEnd() {
        return end;
    }

    public static void setEnd(boolean end) {
        ButtonController.end = end;
    }
}

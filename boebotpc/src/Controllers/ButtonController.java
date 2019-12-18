package Controllers;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

public class ButtonController {

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
                if (boc.getStartcordx() == 0 && boc.getEndcordx() == 0) {
                    boc.setStartcordx(x);
                    boc.setStartcordy(y);
                    StartPoint(btn);


                } else if (boc.getStartcordx() != 0 && boc.getEndcordx() == 0) {

                    boc.setEndcordx(x);
                    boc.setEndcordy(y);
                    EndPoint(btn);
                } else if (boc.getStartcordx() != 0 && boc.getEndcordx() != 0) {
                    boc.setStartcordx(0);
                    boc.setStartcordy(0);
                    resetPoint(btn);
                } else if (boc.getEndcordx() != 0) {
                    boc.setEndcordx(0);
                    boc.setEndcordy(0);
                    resetPoint(btn);
                }
            }

        });
    }
}

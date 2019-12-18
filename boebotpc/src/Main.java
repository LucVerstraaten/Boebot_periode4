import Controllers.BoebotController;
import Controllers.ButtonController;
import Controllers.WifiController;
import View.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends JFrame {
    private static JButton btn_x1_y1 = new JButton();
    private static JButton btn_x2_y1 = new JButton();
    private static JButton btn_x3_y1 = new JButton();
    private static JButton btn_x4_y1 = new JButton();
    private static JButton btn_x1_y2 = new JButton();
    private static JButton btn_x2_y2 = new JButton();
    private static JButton btn_x3_y2 = new JButton();
    private static JButton btn_x4_y2 = new JButton();
    private static JButton btn_x1_y3 = new JButton();
    private static JButton btn_x2_y3 = new JButton();
    private static JButton btn_x3_y3 = new JButton();
    private static JButton btn_x4_y3 = new JButton();
    private static JButton btn_x1_y4 = new JButton();
    private static JButton btn_x2_y4 = new JButton();
    private static JButton btn_x3_y4 = new JButton();
    private static JButton btn_x4_y4 = new JButton();
    private static Button btn_x5_y1 = new Button();
    private static Button btn_x5_y2 = new Button();
    private static Button btn_x5_y3 = new Button();
    private static Button btn_x5_y4 = new Button();
    private static Button btn_x1_y5 = new Button();
    private static Button btn_x2_y5 = new Button();
    private static Button btn_x3_y5 = new Button();
    private static Button btn_x5_y5 = new Button();
    private static Button btn_x4_y5 = new Button();
    private static Button btn_x1_y6 = new Button();
    private static Button btn_x2_y6 = new Button();
    private static Button btn_x3_y6 = new Button();
    private static Button btn_x4_y6 = new Button();
    private static Button btn_x5_y6 = new Button();
    private static Button btn_x1_y7 = new Button();
    private static Button btn_x2_y7 = new Button();
    private static Button btn_x3_y7 = new Button();
    private static Button btn_x4_y7 = new Button();
    private static Button btn_x5_y7 = new Button();
    private static Button btn_x1_y8 = new Button();
    private static Button btn_x2_y8 = new Button();
    private static Button btn_x3_y8 = new Button();
    private static Button btn_x4_y8 = new Button();
    private static Button btn_x5_y8 = new Button();
    private static JButton btn_Route = new JButton();
    private static JButton btn_Send = new JButton();
    private static JButton btn_reset = new JButton();

    private static WifiController wifi = new WifiController();

    private static BoebotController trans = new BoebotController();
    private static ButtonController bc = new ButtonController();

    private static Main window = new Main();
    private static Pane p = new Pane();


    public static void main(String args[]) {


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        btn_x1_y1.setBounds(100, 425, 25, 25);
        btn_x2_y1.setBounds(100, 350, 25, 25);
        btn_x3_y1.setBounds(100, 275, 25, 25);
        btn_x4_y1.setBounds(100, 200, 25, 25);
        btn_x5_y1.setBounds(100, 125, 25, 25);

        btn_x1_y2.setBounds(175, 425, 25, 25);
        btn_x2_y2.setBounds(175, 350, 25, 25);
        btn_x3_y2.setBounds(175, 275, 25, 25);
        btn_x4_y2.setBounds(175, 200, 25, 25);
        btn_x5_y2.setBounds(175, 125, 25, 25);

        btn_x1_y3.setBounds(250, 425, 25, 25);
        btn_x2_y3.setBounds(250, 350, 25, 25);
        btn_x3_y3.setBounds(250, 275, 25, 25);
        btn_x4_y3.setBounds(250, 200, 25, 25);
        btn_x5_y3.setBounds(250, 125, 25, 25);

        btn_x1_y4.setBounds(325, 425, 25, 25);
        btn_x2_y4.setBounds(325, 350, 25, 25);
        btn_x3_y4.setBounds(325, 275, 25, 25);
        btn_x4_y4.setBounds(325, 200, 25, 25);
        btn_x5_y4.setBounds(325, 125, 25, 25);

        btn_x1_y5.setBounds(400, 425, 25, 25);
        btn_x2_y5.setBounds(400, 350, 25, 25);
        btn_x3_y5.setBounds(400, 275, 25, 25);
        btn_x4_y5.setBounds(400, 200, 25, 25);
        btn_x5_y5.setBounds(400, 125, 25, 25);

        btn_x1_y6.setBounds(475, 425, 25, 25);
        btn_x2_y6.setBounds(475, 350, 25, 25);
        btn_x3_y6.setBounds(475, 275, 25, 25);
        btn_x4_y6.setBounds(475, 200, 25, 25);
        btn_x5_y6.setBounds(475, 125, 25, 25);

        btn_x1_y7.setBounds(550, 425, 25, 25);
        btn_x2_y7.setBounds(550, 350, 25, 25);
        btn_x3_y7.setBounds(550, 275, 25, 25);
        btn_x4_y7.setBounds(550, 200, 25, 25);
        btn_x5_y7.setBounds(550, 125, 25, 25);

        btn_x1_y8.setBounds(625, 425, 25, 25);
        btn_x2_y8.setBounds(625, 350, 25, 25);
        btn_x3_y8.setBounds(625, 275, 25, 25);
        btn_x4_y8.setBounds(625, 200, 25, 25);
        btn_x5_y8.setBounds(625, 125, 25, 25);

        btn_Route.setBounds(500, 500, 100, 50);
        btn_Send.setBounds(600, 500, 100, 50);
        btn_reset.setBounds(700, 500, 100, 50);
        btn_Route.setText("Bereken route");
        btn_Send.setText("Send route");
        btn_reset.setText("reset route");

        bc.addActionListener(trans, btn_x1_y1, 1, 1);
        bc.addActionListener(trans, btn_x2_y1, 2, 1);
        bc.addActionListener(trans, btn_x3_y1, 3, 1);
        bc.addActionListener(trans, btn_x4_y1, 4, 1);
        bc.addActionListener(trans, btn_x1_y2, 1, 2);
        bc.addActionListener(trans, btn_x2_y2, 2, 2);
        bc.addActionListener(trans, btn_x3_y2, 3, 2);
        bc.addActionListener(trans, btn_x4_y2, 4, 2);
        bc.addActionListener(trans, btn_x1_y3, 1, 3);
        bc.addActionListener(trans, btn_x2_y3, 2, 3);
        bc.addActionListener(trans, btn_x3_y3, 3, 3);
        bc.addActionListener(trans, btn_x4_y3, 4, 3);
        bc.addActionListener(trans, btn_x1_y4, 1, 4);
        bc.addActionListener(trans, btn_x2_y4, 2, 4);
        bc.addActionListener(trans, btn_x3_y4, 3, 4);
        bc.addActionListener(trans, btn_x4_y4, 4, 4);
        bc.addRouteActionListener(trans, btn_Route, p);
        btn_Send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                if (bc.isStart() && bc.isEnd()) {
                    try {
                        ArrayList<Integer> commands = trans.getCommands();
                        wifi.ConnectionSetup();
                        wifi.Send(commands);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        btn_reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bc.resetPoint(btn_x1_y1);
                bc.resetPoint(btn_x2_y1);
                bc.resetPoint(btn_x3_y1);
                bc.resetPoint(btn_x4_y1);
                bc.resetPoint(btn_x1_y2);
                bc.resetPoint(btn_x2_y2);
                bc.resetPoint(btn_x3_y2);
                bc.resetPoint(btn_x4_y2);
                bc.resetPoint(btn_x1_y3);
                bc.resetPoint(btn_x2_y3);
                bc.resetPoint(btn_x3_y3);
                bc.resetPoint(btn_x4_y3);
                bc.resetPoint(btn_x1_y4);
                bc.resetPoint(btn_x2_y4);
                bc.resetPoint(btn_x3_y4);
                bc.resetPoint(btn_x4_y4);
                trans.clearCommand();
                p.clearRoutePiece();
                p.repaint();
                bc.setStart(false);
                bc.setEnd(false);


            }
        });

        window.add(btn_x1_y1);
        window.add(btn_x2_y1);
        window.add(btn_x3_y1);
        window.add(btn_x4_y1);
        window.add(btn_x5_y1);

        window.add(btn_x1_y2);
        window.add(btn_x2_y2);
        window.add(btn_x3_y2);
        window.add(btn_x4_y2);
        window.add(btn_x5_y2);

        window.add(btn_x1_y3);
        window.add(btn_x2_y3);
        window.add(btn_x3_y3);
        window.add(btn_x4_y3);
        window.add(btn_x5_y3);

        window.add(btn_x1_y4);
        window.add(btn_x2_y4);
        window.add(btn_x3_y4);
        window.add(btn_x4_y4);
        window.add(btn_x5_y4);

        window.add(btn_x1_y5);
        window.add(btn_x2_y5);
        window.add(btn_x3_y5);
        window.add(btn_x4_y5);
        window.add(btn_x5_y5);

        window.add(btn_x1_y6);
        window.add(btn_x2_y6);
        window.add(btn_x3_y6);
        window.add(btn_x4_y6);
        window.add(btn_x5_y6);

        window.add(btn_x1_y7);
        window.add(btn_x2_y7);
        window.add(btn_x3_y7);
        window.add(btn_x4_y7);
        window.add(btn_x5_y7);

        window.add(btn_x1_y8);
        window.add(btn_x2_y8);
        window.add(btn_x3_y8);
        window.add(btn_x4_y8);
        window.add(btn_x5_y8);

        window.add(btn_Route);
        window.add(btn_Send);
        window.add(btn_reset);
        window.add(p);
        window.setTitle("Frans ik heb vraag");
        window.setMinimumSize(new Dimension(1000, 1000));
        window.setMaximumSize(new Dimension(1000, 1000));
        window.repaint();

        window.setVisible(true);

    }


}

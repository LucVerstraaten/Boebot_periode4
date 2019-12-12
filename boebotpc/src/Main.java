import Controllers.BoebotController;
import Controllers.WifiController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends JFrame {
    private static Button btn_x1_y1 = new Button();
    private static Button btn_x2_y1 = new Button();
    private static Button btn_x3_y1 = new Button();
    private static Button btn_x4_y1 = new Button();
    private static Button btn_x1_y2 = new Button();
    private static Button btn_x2_y2 = new Button();
    private static Button btn_x3_y2 = new Button();
    private static Button btn_x4_y2 = new Button();
    private static Button btn_x1_y3 = new Button();
    private static Button btn_x2_y3 = new Button();
    private static Button btn_x3_y3 = new Button();
    private static Button btn_x4_y3 = new Button();
    private static Button btn_x1_y4 = new Button();
    private static Button btn_x2_y4 = new Button();
    private static Button btn_x3_y4 = new Button();
    private static Button btn_x4_y4 = new Button();
    private static Button btn_Route = new Button();
    private static Button btn_Send = new Button();
    private static WifiController wifi = new WifiController();
    private static int startcordx = 0;
    private static int endcordx = 0;
    private static int startcordy = 0;
    private static int endcordy = 0;
    private static BoebotController trans = new BoebotController();

    private static Main window = new Main();
    private  static Pane p = new Pane();


    public static void main(String args[]) {



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        btn_x1_y1.setBounds(100,350,25,25);
        btn_x2_y1.setBounds(100,275,25,25);
        btn_x3_y1.setBounds(100,200,25,25);
        btn_x4_y1.setBounds(100,125,25,25);
        btn_x1_y2.setBounds(175,350,25,25);
        btn_x2_y2.setBounds(175,275,25,25);
        btn_x3_y2.setBounds(175,200,25,25);
        btn_x4_y2.setBounds(175,125,25,25);
        btn_x1_y3.setBounds(250,350,25,25);
        btn_x2_y3.setBounds(250,275,25,25);
        btn_x3_y3.setBounds(250,200,25,25);
        btn_x4_y3.setBounds(250,125,25,25);
        btn_x1_y4.setBounds(325,350,25,25);
        btn_x2_y4.setBounds(325,275,25,25);
        btn_x3_y4.setBounds(325,200,25,25);
        btn_x4_y4.setBounds(325,125,25,25);
        btn_Route.setBounds(500,500,100,50);
        btn_Send.setBounds(600,500,100,50);
        btn_Route.setLabel("Bereken route");
        btn_Send.setLabel("Send route");

        btn_x1_y1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 1;
                    startcordy = 1;
                    btn_x1_y1.setBackground(Color.GREEN);

                }
                else if (startcordx != 0 && endcordx == 0)
                {

                    endcordy = 1;
                    endcordx = 1;
                    btn_x1_y1.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x1_y1.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x1_y1.setBackground(Color.WHITE);
                }
            }
        });

        btn_x2_y1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 2;
                    startcordy = 1;
                    btn_x2_y1.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 2;
                    endcordy = 1;
                    btn_x2_y1.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x2_y1.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x2_y1.setBackground(Color.WHITE);
                }
            }
        });

        btn_x3_y1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 3;
                    startcordy = 1;
                    btn_x3_y1.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 3;
                    endcordy = 1;
                    btn_x3_y1.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x3_y1.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x3_y1.setBackground(Color.WHITE);
                }
            }
        });

        btn_x4_y1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 4;
                    startcordy = 1;
                    btn_x4_y1.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 4;
                    endcordy = 1;
                    btn_x4_y1.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x4_y1.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x4_y1.setBackground(Color.WHITE);
                }
            }
        });

        btn_x1_y2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 1;
                    startcordy = 2;
                    btn_x1_y2.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 1;
                    endcordy = 2;
                    btn_x1_y2.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x1_y2.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x1_y2.setBackground(Color.WHITE);
                }
            }
        });

        btn_x2_y2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 2;
                    startcordy = 2;
                    btn_x2_y2.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 2;
                    endcordy = 2;
                    btn_x2_y2.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x2_y2.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x2_y2.setBackground(Color.WHITE);
                }
            }
        });

        btn_x3_y2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 3;
                    startcordy = 2;
                    btn_x3_y2.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 3;
                    endcordy = 2;
                    btn_x3_y2.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x3_y2.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x3_y2.setBackground(Color.WHITE);
                }
            }
        });

        btn_x4_y2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 4;
                    startcordy = 2;
                    btn_x4_y2.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 4;
                    endcordy = 2;
                    btn_x4_y2.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x4_y2.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x4_y2.setBackground(Color.WHITE);
                }
            }
        });

        btn_x1_y3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 1;
                    startcordy = 3;
                    btn_x1_y3.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 1;
                    endcordy = 3;
                    btn_x1_y3.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x1_y3.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x1_y3.setBackground(Color.WHITE);
                }
            }
        });

        btn_x2_y3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 2;
                    startcordy = 3;
                    btn_x2_y3.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 2;
                    endcordy = 3;
                    btn_x2_y3.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x2_y3.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x2_y3.setBackground(Color.WHITE);
                }
            }
        });

        btn_x3_y3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 3;
                    startcordy = 3;
                    btn_x3_y3.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 3;
                    endcordy = 3;
                    btn_x3_y3.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x3_y3.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x3_y3.setBackground(Color.WHITE);
                }
            }
        });

        btn_x4_y3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 4;
                    startcordy = 3;
                    btn_x4_y3.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 4;
                    endcordy = 3;
                    btn_x4_y3.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x4_y3.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x4_y3.setBackground(Color.WHITE);
                }
            }
        });

        btn_x1_y4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 1;
                    startcordy = 4;
                    btn_x1_y4.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 1;
                    endcordy = 4;
                    btn_x1_y4.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x1_y4.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x1_y4.setBackground(Color.WHITE);
                }
            }
        });

        btn_x2_y4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 2;
                    startcordy = 4;
                    btn_x2_y4.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 2;
                    endcordy = 4;
                    btn_x2_y4.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x2_y4.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x2_y4.setBackground(Color.WHITE);
                }
            }
        });


        btn_x3_y4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 3;
                    startcordy = 4;
                    btn_x3_y4.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 3;
                    endcordy = 4;
                    btn_x3_y4.setBackground(Color.red);
                }
                else if (startcordx != 0 && endcordx != 0)
                {
                    startcordy = 0;
                    startcordx = 0;
                    btn_x3_y4.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x3_y4.setBackground(Color.WHITE);
                }
            }
        });


        btn_x4_y4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (startcordx == 0 && endcordx == 0)
                {
                    startcordx = 4;
                    startcordy = 4;
                    btn_x4_y4.setBackground(Color.GREEN);
                }
                else if (startcordx != 0 && endcordx == 0)
                {
                    endcordx = 4;
                    endcordy = 4;
                    btn_x4_y4.setBackground(Color.red);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x4_y4.setBackground(Color.WHITE);
                }
                else if (endcordx != 0)
                {
                    endcordx = 0;
                    endcordy = 0;
                    btn_x4_y4.setBackground(Color.WHITE);
                }

            }
        });


        btn_Route.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                int xlength = Math.abs(startcordx - endcordx);
                int ylength = Math.abs(startcordy - endcordy);
                int nextcordx =0;
                int nextcordy =0;
                p.clearRoutePiece();
                while(xlength != 0)
                {
                    RectangleRoute pos = new RectangleRoute(25,50);

                    if(startcordx>endcordx) {
                        nextcordx = startcordx-1;
                        trans.commandTranslator(startcordx,startcordy,nextcordx,startcordy);
                        pos.setLocation(175+((startcordy-2)*75),150+((startcordx-2)*75));
                        p.addRoutePiece(pos);
                        startcordx = nextcordx;
                    }
                    if(startcordx<endcordx) {
                        nextcordx = startcordx+1;
                        trans.commandTranslator(startcordx,startcordy,nextcordx,startcordy);
                        pos.setLocation(100 +((startcordy-1)*75),150+((startcordx-1)*75));
                        p.addRoutePiece(pos);
                        startcordx = nextcordx;
                        //addRoutePiece();
                    }
                    xlength--;
                }
                while(ylength != 0)
                {
                    RectangleRoute pos = new RectangleRoute(50,25);
                    if(startcordy>endcordy) {
                        nextcordy = startcordy-1;
                        trans.commandTranslator(startcordx,startcordy,startcordx,nextcordy);
                        pos.setLocation(125+((startcordy-2)*75),350 -((startcordx-1)*75));
                        p.addRoutePiece(pos);
                        startcordy = nextcordy;
                    }
                    else if(startcordy<endcordy) {
                        nextcordy = startcordy+1;
                        trans.commandTranslator(startcordx,startcordy,startcordx,nextcordy);
                        pos.setLocation(125+((startcordy-1)*75),350 -((startcordx-1)*75));
                        p.addRoutePiece(pos);
                        startcordy = nextcordy;
                    }
                    ylength--;
                }

                p.repaint();
            }

        });
        btn_Send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {


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
            });
        window.add(btn_x1_y1);
        window.add(btn_x2_y1);
        window.add(btn_x3_y1);
        window.add(btn_x4_y1);
        window.add(btn_x1_y2);
        window.add(btn_x2_y2);
        window.add(btn_x3_y2);
        window.add(btn_x4_y2);
        window.add(btn_x1_y3);
        window.add(btn_x2_y3);
        window.add(btn_x3_y3);
        window.add(btn_x4_y3);
        window.add(btn_x1_y4);
        window.add(btn_x2_y4);
        window.add(btn_x3_y4);
        window.add(btn_x4_y4);
        window.add(btn_Route);
        window.add(btn_Send);
        window.add(p);
        window.setTitle("Frans ik heb vraag");
        window.setMinimumSize(new Dimension(1000,1000));
        window.setMaximumSize(new Dimension(1000,1000));
        window.repaint();

        window.setVisible(true);

    }
}

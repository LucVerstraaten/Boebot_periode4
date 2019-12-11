import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private static int startcordx = 0;
    private static int endcordx = 0;
    private static int startcordy = 0;
    private static int endcordy = 0;



    public static void main(String args[]) {
        Main window = new Main();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Pane p = new Pane();
        btn_x1_y1.setBounds(100,300,25,25);
        btn_x2_y1.setBounds(100,250,25,25);
        btn_x3_y1.setBounds(100,200,25,25);
        btn_x4_y1.setBounds(100,150,25,25);
        btn_x1_y2.setBounds(150,300,25,25);
        btn_x2_y2.setBounds(150,250,25,25);
        btn_x3_y2.setBounds(150,200,25,25);
        btn_x4_y2.setBounds(150,150,25,25);
        btn_x1_y3.setBounds(200,300,25,25);
        btn_x2_y3.setBounds(200,250,25,25);
        btn_x3_y3.setBounds(200,200,25,25);
        btn_x4_y3.setBounds(200,150,25,25);
        btn_x1_y4.setBounds(250,300,25,25);
        btn_x2_y4.setBounds(250,250,25,25);
        btn_x3_y4.setBounds(250,200,25,25);
        btn_x4_y4.setBounds(250,150,25,25);
        btn_Route.setBounds(500,500,100,50);
        btn_Route.setLabel("Bereken route");

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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 1;
                    endcordx = 1;
                    btn_x1_y1.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 2;
                    endcordx = 1;
                    btn_x2_y1.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 3;
                    endcordx = 1;
                    btn_x3_y1.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 4;
                    endcordx = 1;
                    btn_x4_y1.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 1;
                    endcordx = 2;
                    btn_x1_y2.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 2;
                    endcordx = 2;
                    btn_x2_y2.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 3;
                    endcordx = 2;
                    btn_x3_y2.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 4;
                    endcordx = 2;
                    btn_x4_y2.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 1;
                    endcordx = 3;
                    btn_x1_y3.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 2;
                    endcordx = 3;
                    btn_x2_y3.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 3;
                    endcordx = 3;
                    btn_x3_y3.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 4;
                    endcordx = 3;
                    btn_x4_y3.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 1;
                    endcordx = 4;
                    btn_x1_y4.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 2;
                    endcordx = 4;
                    btn_x2_y4.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 3;
                    endcordx = 4;
                    btn_x3_y4.setBackground(Color.red);
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
                    startcordy = 0;
                    startcordx = 0;
                    endcordy = 4;
                    endcordx = 4;
                    btn_x4_y4.setBackground(Color.red);
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
                while(xlength != 0)
                {

                    if(startcordx>endcordx) {
                        nextcordx = endcordx-1;
                        //bla.bla(startcordx,startcordy,nextcordx,endcordy,1 temp);
                    }
                    if(startcordx<endcordx) {
                        nextcordx = endcordx+1;
                        //bla.bla(startcordx,startcordy,nextcordx,endcordy,1 temp);
                        startcordx = nextcordx;
                    }
                    xlength--;
                }
                while(ylength != 0)
                {
                    if(startcordy>endcordy) {
                        nextcordy = endcordy-1;
                        //bla.bla(startcordx,startcordy,startcordx,nextcordy,1 temp);
                        startcordy = nextcordy;
                    }
                    if(startcordy<endcordy) {
                        nextcordy = endcordy+1;
                        //bla.bla(startcordx,startcordy,startcordx,nextcordy,1 temp);
                        startcordy = nextcordy;
                    }
                    ylength--;
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
        window.add(p);
        window.setTitle("Frans ik heb vraag");
        window.setMinimumSize(new Dimension(1000,1000));
        window.setMaximumSize(new Dimension(1000,1000));
        window.repaint();

        window.setVisible(true);

    }
}

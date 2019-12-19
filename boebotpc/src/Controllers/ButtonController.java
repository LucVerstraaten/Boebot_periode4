package Controllers;

import Models.Blockade;
import Models.RectangleRoute;
import View.Pane;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.ArrayList;


public class ButtonController {

    private static boolean start = false;
    private static boolean end = false;
    private static BlockadeController blockade = new BlockadeController();
    private static int xlength = 0;
    private static int ylength = 0;

    public void StartPoint(JButton btn) {
        try {
            btn.setIcon(null);
            Image img = ImageIO.read(new FileInputStream("resources/r2-d2.jpg"));
            Image newimg = img.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
            btn.setIcon(new ImageIcon(newimg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void EndPoint(JButton btn) {
        try {
            btn.setIcon(null);
            Image img = ImageIO.read(new FileInputStream("resources/falcon.jpg"));
            Image newimg = img.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
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

    public void addRouteActionListener(BoebotController boc, JButton btn, Pane p) {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                ArrayList<Blockade> blockades = new ArrayList<>();
                xlength = Math.abs(boc.getStartcordx() - boc.getEndcordx());
                ylength = Math.abs(boc.getStartcordy() - boc.getEndcordy());
                int nextcordx = 0;
                int nextcordy = 0;
                Boolean block = false;
                p.clearRoutePiece();
                while (xlength != 0) {


                    if (boc.getStartcordx() > boc.getEndcordx()) {
                        nextcordx = boc.getStartcordx() - 1;
                        for (Blockade b : blockades) {
                            if (blockade.isBlocked(b, boc.getStartcordx(), boc.getEndcordx(), boc.getStartcordy(), boc.getStartcordy())) {
                                block = true;
                            }
                        }
                        if (!block) {
                            xAxis(boc, nextcordx, p, true);

                        } else {
                            if (boc.getStartcordy() > boc.getEndcordy()) {
                                nextcordy = boc.getStartcordy() - 1;
                                yAxis(boc, nextcordy, p, true);
                            } else if (boc.getStartcordy() < boc.getEndcordy()) {
                                nextcordy = boc.getStartcordy() + 1;
                                yAxis(boc, nextcordy, p, false);
                            }
                        }
                    } else if (boc.getStartcordx() < boc.getEndcordx()) {
                        nextcordx = boc.getStartcordx() + 1;
                        for (Blockade b : blockades) {
                            if (blockade.isBlocked(b, boc.getStartcordx(), boc.getEndcordx(), boc.getStartcordy(), boc.getStartcordy())) {
                                block = true;
                            }
                        }
                        if (!block) {
                            xAxis(boc, nextcordx, p, false);
                        } else {
                            if (boc.getStartcordy() > boc.getEndcordy()) {
                                nextcordy = boc.getStartcordy() - 1;
                                yAxis(boc, nextcordy, p, true);
                            } else if (boc.getStartcordy() < boc.getEndcordy()) {
                                nextcordy = boc.getStartcordy() + 1;
                                yAxis(boc, nextcordy, p, false);
                            }
                        }
                    }

                    block = false;

                }
                while (ylength != 0) {
                    if (boc.getStartcordy() > boc.getEndcordy()) {
                        nextcordy = boc.getStartcordy() - 1;
                        for (Blockade b : blockades) {
                            if (blockade.isBlocked(b, boc.getStartcordx(), boc.getStartcordx(), boc.getStartcordy(), nextcordy)) {
                                block = true;
                            }
                        }
                        if (!block) {
                            yAxis(boc, nextcordy, p, true);
                        } else {

                            nextcordy = boc.getStartcordy() - 1;
                            yAxis(boc, nextcordy, p, true);
                            yAxis(boc, nextcordy, p, true);
                            nextcordy = boc.getStartcordy() + 1;
                            yAxis(boc, nextcordy, p, true);
                        }


                    } else if (boc.getStartcordy() < boc.getEndcordy()) {
                        nextcordy = boc.getStartcordy() + 1;
                        for (Blockade b : blockades) {
                            if (blockade.isBlocked(b, boc.getStartcordx(), boc.getStartcordx(), boc.getStartcordy(), nextcordy)) {
                                block = true;
                            }
                        }
                        if (!block) {
                            yAxis(boc, nextcordy, p, false);
                        }
                    } else {

                        nextcordy = boc.getStartcordy() - 1;
                        yAxis(boc, nextcordy, p, true);
                        yAxis(boc, nextcordy, p, false);
                        nextcordy = boc.getStartcordy() + 1;
                        yAxis(boc, nextcordy, p, true);
                    }

                }
                block = false;
                p.repaint();
            }
        });
    }

    private void yAxis(BoebotController boc, int nextcordy, Pane p, boolean bigger) {
        RectangleRoute pos = new RectangleRoute(50, 25);
        if (bigger) {
            boc.commandTranslator(boc.getStartcordx(), boc.getStartcordy(), boc.getStartcordx(), nextcordy);
            pos.setLocation(125 + ((boc.getStartcordy() - 2) * 75), 425 - ((boc.getStartcordx() - 1) * 75));
        } else {
            boc.commandTranslator(boc.getStartcordx(), boc.getStartcordy(), boc.getStartcordx(), nextcordy);
            pos.setLocation(125 + ((boc.getStartcordy() - 1) * 75), 425 - ((boc.getStartcordx() - 1) * 75));
        }
        p.addRoutePiece(pos);
        boc.setStartcordy(nextcordy);
        ylength--;
    }

    private void xAxis(BoebotController boc, int nextcordx, Pane p, boolean bigger) {
        RectangleRoute pos = new RectangleRoute(25, 50);
        if (bigger) {
            pos.setLocation(175 + ((boc.getStartcordy() - 2) * 75), 150 + ((boc.getStartcordx() - 2) * 75));
            boc.commandTranslator(boc.getStartcordx(), boc.getStartcordy(), nextcordx, boc.getStartcordy());
            p.addRoutePiece(pos);
        } else {
            pos.setLocation(100 + ((boc.getStartcordy() - 1) * 75), 375 - ((boc.getStartcordx() * 75 - 75)));
            boc.commandTranslator(boc.getStartcordx(), boc.getStartcordy(), nextcordx, boc.getStartcordy());
            p.addRoutePiece(pos);
        }
        boc.setStartcordx(nextcordx);
        xlength--;
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

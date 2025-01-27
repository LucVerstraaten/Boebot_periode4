package Controllers;

import java.util.ArrayList;

public class BoebotController {

    private ArrayList<Integer> commands = new ArrayList<Integer>();
    private int  Orientation =1;

    public void commandTranslator(int cx, int cy,int nx,int ny )
    {
        /*
        COMMANDS:
                   1 - FORWARD
                   2 - TURNOURAUND
                   3 - TO THE LEFT
                   4 - TO THE RIGHT

        Orientation:
                    1 - NORTH
                    2 - EAST
                    3 - SOUTH
                    4 - WEST
         */
        switch (Orientation){
            case 1:
                if(nx == cx && ny < cy)
                {
                    Orientation = 4;
                    commands.add(3);
                    commands.add(1);
                }
                if(nx == cx && ny > cy)
                {
                    Orientation = 2;
                    commands.add(4);
                    commands.add(1);
                }
                if(nx < cx && ny == cy)
                {
                    Orientation = 3;
                    commands.add(2);
                    commands.add(1);
                }
                if(nx > cx && ny == cy)
                {
                    commands.add(1);
                }
                break;
            case 2:
                if(nx == cx && ny < cy)
                {
                    Orientation = 4;
                    commands.add(2);
                    commands.add(1);
                }
                if(nx == cx && ny > cy)
                {
                    commands.add(1);
                }
                if(nx < cx && ny == cy)
                {
                    Orientation = 3;
                    commands.add(4);
                    commands.add(1);
                }
                if(nx > cx && ny == cy)
                {
                    Orientation = 1;
                    commands.add(3);
                    commands.add(1);
                }
                break;
            case 3:
                if(nx == cx && ny < cy)
                {
                    Orientation = 4;
                    commands.add(4);
                    commands.add(1);
                }
                if(nx == cx && ny > cy)
                {
                    Orientation = 2;
                    commands.add(3);
                    commands.add(1);
                }
                if(nx < cx && ny == cy)
                {

                    commands.add(1);
                }
                if(nx > cx && ny == cy)
                {
                    Orientation = 1;
                    commands.add(2);
                    commands.add(1);
                }
                break;
            case 4:
                if(nx == cx && ny < cy)
                {
                    commands.add(1);
                }
                if(nx == cx && ny > cy)
                {
                    Orientation = 2;
                    commands.add(2);
                    commands.add(1);
                }
                if(nx < cx && ny == cy)
                {
                    Orientation = 3;
                    commands.add(3);
                    commands.add(1);
                }
                if(nx > cx && ny == cy)
                {
                    Orientation = 1;
                    commands.add(4);
                    commands.add(1);
                }
                break;
        }

    }

    public ArrayList<Integer> getCommands() {
        return commands;
    }

}

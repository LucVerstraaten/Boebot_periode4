package Controllers;

import Models.Blockade;

public class BlockadeController {

    public boolean isBlocked(Blockade block, int x1, int x2, int y1, int y2 )
    {
        Boolean blocked = false;
        if(block.getX1() == x1 && block.getX2() == x2)
        {
            if(block.getY1() == y1 && block.getY2() == y2)
            {
                blocked = true;
            }
            if(block.getY1() == y2 && block.getY2() == y1)
            {
                blocked = true;
            }
        }
        if(block.getX1() == x2 && block.getX2() == x1)
        {
            if(block.getY1() == y1 && block.getY2() == y2)
            {
                blocked = true;
            }
            if(block.getY1() == y2 && block.getY2() == y1)
            {
                blocked = true;
            }
        }
        return blocked;
    }

}

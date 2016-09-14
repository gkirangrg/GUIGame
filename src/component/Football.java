/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import core.Direction;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author vikram
 */
public class Football extends GameObject{

    public Football(Point location, String imageName) {
        super(location, imageName);
        vertical = Direction.down;
        horizontal = Direction.left;
    }

    @Override
    public void move() {
        if(location.y>=370-height)
        { 
            vertical = Direction.up;
        }
        if(location.x>=600-width)
        {
          horizontal=Direction.left;
        }
        if(location.y<=0)
        {
            vertical=Direction.down;
        }
        if(location.x<=0)
        {
            horizontal=Direction.right;
        }
        if(vertical==Direction.down && horizontal==Direction.right)
        {
            location.y+=1;
            location.x+=1;
        }
        if(horizontal==Direction.right && vertical==Direction.up)
        {
            location.x+=1;
            location.y-=1;
        }
        else if(horizontal==Direction.left && vertical==Direction.up)
        {
            location.x-=1;
            location.y-=1;
        }
        else if(horizontal==Direction.left && vertical==Direction.down)
        {
            location.x-=1;
            location.y+=1;
        }

    }

    @Override
    public void design(Graphics g) {
    
    }
    
}

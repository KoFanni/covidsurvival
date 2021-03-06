package covidsurvival.level;

import covidsurvival.Option;
import covidsurvival.entity.Entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Obstacle extends Entity {
    protected int tileWidth = 32;
    protected int tileHeight = 32;
    protected int row;
    protected int col;
    protected int width;
    protected int height;
     Image image;

    {  image = Toolkit.getDefaultToolkit().getImage("res/open_tileset.png");
    }

    public Obstacle(int x, int y,int row, int col, int width, int height) {
        super(x, y);
        this.row = row;
        this.col = col;
        this.width = width;
        this.height = height;
        rect = new Rectangle(x,y,tileWidth*width,tileHeight*height);
    }
    public void paint(Graphics2D g) {
        g.drawImage(image,x,y,x+tileWidth*width,y+tileHeight*height,
                col*tileWidth,row*tileHeight,col*tileWidth+tileWidth*width,row*tileHeight+tileHeight*height,null);
    }

}

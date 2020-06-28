package covidsurvival.level.Obstacles;

import covidsurvival.level.Obstacle;

import java.awt.*;

public class Tree extends Obstacle {
    public Tree(int x, int y) {
        super(x, y, 15, 0, 3, 3);

    }

    @Override
    public void paint(Graphics2D g) {
        super.paint(g);
        this.rect = new Rectangle(x + 5, y + 5, 80, 80);
    }
}

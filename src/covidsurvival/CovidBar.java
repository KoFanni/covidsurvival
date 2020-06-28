package covidsurvival;

import javax.swing.*;
import java.awt.*;

public class CovidBar extends JProgressBar { //TODO: need to solve "fixed" positioning
    private int actualLevel;

    public CovidBar() {
        this.setBackground(Color.GRAY);
        this.setForeground(Color.GREEN);
        this.setPreferredSize(new Dimension(200, 20));
    }


    public int getValue() {
        return this.getValue();
    }

    public void setActualLevel(int change) {
        this.actualLevel += change;
        if (actualLevel < 0) actualLevel= 0;
        if (actualLevel > 100) actualLevel = 100;
        this.setValue(this.actualLevel);
    }
}

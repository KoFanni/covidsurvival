package covidsurvival.level.Obstacles;

import covidsurvival.Action;
import covidsurvival.GameWindow;
import covidsurvival.Option;
import covidsurvival.level.Interactable;
import covidsurvival.level.Obstacle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TV extends Obstacle implements Interactable {
    boolean powerIsOn = false;

    public TV(int x, int y) {
        super(x, y, 3, 11, 1, 2);
    }

    public void powerSwitch() {
        powerIsOn = !powerIsOn;
    }

    @Override
    public void paint(Graphics2D g){
        super.paint(g);
        rect.setBounds(x,y+23,31,40);
        g.setColor(Color.BLACK);
        g.drawRect(rect.x,rect.y,rect.width,rect.height);
    }

    @Override
    public void interact() {
        List<Option> list = new ArrayList<>();
        List<String> text = new ArrayList<>();
        text.add("Television:");
        text.add("Most egy olyan hosszú sort akarok beadni, amit");
        text.add("muszáj lesz splittelnie, hát ráménykeggyűnk!");
        if (!powerIsOn) {
            list.add(new Option("Bekapcsolás.", () -> {
                System.out.println("Bekapcsoltad a TV-t, itt majd más fog történni!");
                powerSwitch();
            }));
            list.add(new Option("Távozás.", () -> System.out.println("Viszlát...ez majd semmi lesz")));
        } else {
            list.add(new Option("Válts csatornát.", () -> System.out.println("Csatornát váltottál.")));
            list.add(new Option("Kikapcsolás.", () -> {
                System.out.println("Kikapcs.");
                powerSwitch();
            }));
            list.add(new Option("Távozás.", () -> System.out.println("Viszlát...ez majd semmi lesz")));
        }

        GameWindow.getDialog().show(text, list);
    }
}
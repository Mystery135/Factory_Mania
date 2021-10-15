import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LauncherActionListener implements ActionListener {

    @Override

    public void actionPerformed(ActionEvent e) {

Launcher.gameLaunched = true;
Factory1 factory1 = new Factory1();



        factory1.work();



        new Game_Window();

    }
}

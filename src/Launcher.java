import javax.swing.*;

public class Launcher {

   public Launcher(){



        JFrame launcherFrame = new JFrame();
        JPanel launcherPanel = new JPanel();

        launcherFrame.setSize(500,500);
        launcherPanel.setLayout(null);
        launcherFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        launcherFrame.setVisible(true);
        launcherFrame.add(launcherPanel);


    }




}

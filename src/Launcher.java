import javax.swing.*;
import java.awt.*;

public class Launcher {



public static JButton start;
   public JFrame launcherFrame = new JFrame();
    public JPanel launcherPanel = new JPanel();
   public Launcher(){
start = new JButton("Start!");
start.setBounds(190,170,100,100);
       start.addActionListener(new LauncherActionListener());
       start.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));



        launcherFrame.setSize(500,500);
        launcherPanel.setLayout(null);
        launcherPanel.add(start);
        launcherFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        launcherFrame.setVisible(true);
        launcherFrame.add(launcherPanel);


    }




}

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Launcher {
    public static boolean gameLaunched = false;


public static JButton start;
   public JFrame launcherFrame;
    public JPanel launcherPanel;
   public Launcher(){
       launcherPanel = new JPanel();

       launcherFrame = new JFrame("Factory Mania Launcher");
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


       Timer timer = new Timer();
       TimerTask timerTask = new TimerTask() {
           @Override
           public void run() {
if (gameLaunched == true){


    launcherFrame.dispose();
}

           }
       };
       timer.scheduleAtFixedRate(timerTask,1,1);

   }
}





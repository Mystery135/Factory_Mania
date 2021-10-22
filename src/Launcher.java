import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Launcher {
    public static boolean gameLaunched = false;


public static JButton start;
   public JFrame launcherFrame;
    public JPanel launcherPanel;
//    private static ImageIcon mountain = new ImageIcon("mountain.jpg");
    private ImageIcon mountain = new ImageIcon(getClass().getClassLoader().getResource("mountain.jpg"));
    private static JLabel mountainLabel;
    private JCheckBox checkBox1;
    private JPanel panel1;

    public Launcher(){
       launcherPanel = new JPanel();

       launcherFrame = new JFrame("Factory Mania Launcher");
start = new JButton("Start!");
Image mountainImage = mountain.getImage();
Image scaledmountainImage = mountainImage.getScaledInstance(500,500, Image.SCALE_SMOOTH);
mountain = new ImageIcon(scaledmountainImage);


mountainLabel = new JLabel(mountain);
mountainLabel.setBounds(-250,-270,1000,1000);


start.setBounds(190,170,100,100);
       start.addActionListener(new LauncherActionListener());
       start.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));






        launcherFrame.setSize(500,500);

        launcherPanel.setLayout(null);
        launcherPanel.add(start);
        launcherFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        launcherFrame.setVisible(true);
        launcherFrame.add(launcherPanel);
       launcherPanel.add(mountainLabel);

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





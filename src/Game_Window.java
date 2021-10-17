import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Game_Window {

    JFrame frame = new JFrame("Factory Mania");
    JPanel panel = new JPanel();
     static JLabel labelforupgradedollar;
private static JLabel balance;
    private static JButton upgradedollar;
    private static JButton upgradems;
    Game_Window(){
        Bank bank = new Bank();

        //balance
        ///////////////////////////////////////////////////////////////
        balance = new JLabel("Balance:"  + bank.getMoney());
        balance.setBounds(365,20,800,25);
        ///////////////////////////////////////////////////////////////
        //labelforupgradedollar
        ///////////////////////////////////////////////////////////////
        labelforupgradedollar = new JLabel("test");
        labelforupgradedollar.setBounds(170,100,1500,45);
        ///////////////////////////////////////////////////////////////
        //upgradedollar
        ///////////////////////////////////////////////////////////////
        upgradedollar = new JButton("Upgrade $/s");
        upgradedollar.setBounds(10,100,150,45);
        upgradedollar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        upgradedollar.addActionListener(new upgradedollarActionListener());
        ///////////////////////////////////////////////////////////////
        //upgradems
        ///////////////////////////////////////////////////////////////
        upgradems = new JButton("Upgrade Payout Period");
        upgradems.setBounds(10,150,200,45);
        upgradems.addActionListener(new upgrademsActionListener());
        upgradems.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ///////////////////////////////////////////////////////////////
        //Font
        ///////////////////////////////////////////////////////////////
        balance.setFont(new Font(null,Font.BOLD,20));
        labelforupgradedollar.setFont(new Font(null,Font.BOLD,15));
        ///////////////////////////////////////////////////////////////
        //panel
        ///////////////////////////////////////////////////////////////
        panel.add(upgradedollar);
        panel.add(balance);
        panel.add(upgradems);
        panel.add(labelforupgradedollar);
        panel.setLayout(null);
        ///////////////////////////////////////////////////////////////
        //frame
        ///////////////////////////////////////////////////////////////
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        ///////////////////////////////////////////////////////////////



















Timer timer = new java.util.Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
balance.setText("Balance:" + (int)bank.getMoney() );



}

        };

        timer.scheduleAtFixedRate(timerTask,1,1);


    }



}

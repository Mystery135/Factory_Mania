import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Game_Window {

    JFrame frame = new JFrame("Factory Mania");
    JPanel panel = new JPanel();
private static JLabel balance;
    private static JButton upgradedollar;
    private static JButton upgradems;
    Game_Window(){

        Bank bank = new Bank();


upgradems = new JButton("Upgrade Payout Period");
upgradems.setBounds(10,150,200,45);

    balance = new JLabel("Balance:"  + bank.getMoney());
    upgradedollar = new JButton("Upgrade $/s");
    upgradedollar.setBounds(10,100,150,45);
    upgradedollar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    upgradedollar.addActionListener(new upgradedollarActionListener());
    upgradems.addActionListener(new upgrademsActionListener());
upgradems.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


balance.setBounds(365,20,800,25);
panel.add(upgradedollar);
panel.add(balance);
        panel.add(upgradems);

        balance.setFont(new Font(null,Font.BOLD,20));


        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);



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

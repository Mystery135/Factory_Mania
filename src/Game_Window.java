import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Game_Window {

    JFrame frame = new JFrame("Factory Mania");
    JPanel panel = new JPanel();
     public static JLabel labelforupgradedollar;
private static JLabel balance;
    private static JButton upgradedollar;
    private static JButton upgradems;
    private static JLabel dollarpersecond;
    private static JLabel payoutperiod;
    Game_Window(){
        Bank bank = new Bank();
        Factory1 factory1 = new Factory1();

        //balance
        ///////////////////////////////////////////////////////////////
        balance = new JLabel("Balance:"  + bank.getMoney());
        balance.setBounds(365,20,800,25);
        ///////////////////////////////////////////////////////////////
        //dollarpersecond
        ///////////////////////////////////////////////////////////////
        dollarpersecond = new JLabel("$ per second:"+ factory1.getMoneyearned());
        dollarpersecond.setBounds(565,100,800,25);
        ///////////////////////////////////////////////////////////////
        //payoutperiod
        ///////////////////////////////////////////////////////////////
        payoutperiod = new JLabel("Payout period:" + factory1.getPeriod() + "ms");
        payoutperiod.setBounds(565,150,800,25);
        ///////////////////////////////////////////////////////////////
        //labelforupgradedollar
        ///////////////////////////////////////////////////////////////
        labelforupgradedollar = new JLabel("");
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
        payoutperiod.setFont(new Font(null,Font.BOLD,15));
        dollarpersecond.setFont(new Font(null,Font.BOLD,15));

        ///////////////////////////////////////////////////////////////
        //panel
        ///////////////////////////////////////////////////////////////
        panel.add(upgradedollar);
        panel.add(balance);
        panel.add(upgradems);
        panel.add(labelforupgradedollar);
        panel.add(payoutperiod);
        panel.add(dollarpersecond);
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
dollarpersecond.setText("$ per second:"+ factory1.getMoneyearned());
if (factory1.getPeriod()>0){

    payoutperiod.setText("Payout period:" + factory1.getPeriod() + "ms");


}else {
    payoutperiod.setText("Payout period: maxed! (" + factory1.getPeriod() + "ms)");


}



}

        };

        timer.scheduleAtFixedRate(timerTask,1,1);


    }



}

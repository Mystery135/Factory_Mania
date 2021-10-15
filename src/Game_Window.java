import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Game_Window {

    JFrame frame = new JFrame("Factory Mania");
    JPanel panel = new JPanel();
private static JLabel balance;
    private static JButton upgradedollar;
    Game_Window(){

        Bank bank = new Bank();




    balance = new JLabel("Balance:"  + bank.getMoney());
    upgradedollar = new JButton("Upgrade $/s");
    upgradedollar.setBounds(10,50,150,45);
    upgradedollar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    upgradedollar.addActionListener(new upgradedollarActionListener());



balance.setBounds(365,20,800,25);
panel.add(upgradedollar);
panel.add(balance);

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

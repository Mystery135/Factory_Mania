import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class upgradedollarActionListener implements ActionListener {
    Bank bank = new Bank();
    Factory1 factory1 = new Factory1();
    static int notenoughmoney;

    @Override
    public void actionPerformed(ActionEvent e) {



        if(bank.getMoney() >= factory1.getMoneyearned()*10) {


            bank.setMoney(bank.getMoney() - factory1.getMoneyearned() * 10);
            factory1.setMoneyearned(factory1.getMoneyearned() + 1);
            System.out.println("Upgraded! You now make $" + factory1.getMoneyearned() + " per second!");
            Game_Window.labelforupgradedollar.setText("Upgraded! You now make $" + factory1.getMoneyearned() + " per second!");
            notenoughmoney = 1;
            Game_Window.nextupgradedollar.setText("Next Upgrade:$" + factory1.getMoneyearned()*10);

        }else {

            Game_Window.labelforupgradedollar.setText("You don't have enough $! You need $" + ((factory1.getMoneyearned()*10)-bank.getMoney())+" more!");

            System.out.println("You don't have enough $! You need $" + ((factory1.getMoneyearned()*10)-bank.getMoney())+" more!");


            notenoughmoney = -1;


        }

    }    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {

            if (upgradedollarActionListener.notenoughmoney == 1){
                Game_Window.labelforupgradedollar.setText("Upgraded! You now make $" + factory1.getMoneyearned() + " per second!");
                upgradedollarActionListener.notenoughmoney = 0;


            }else if (upgradedollarActionListener.notenoughmoney == -1){

                Game_Window.labelforupgradedollar.setText("You don't have enough $! You need $" + ((factory1.getMoneyearned()*10)-bank.getMoney())+" more!");

                upgradedollarActionListener.notenoughmoney = 0;
            }else if(upgradedollarActionListener.notenoughmoney == 0){

                Game_Window.labelforupgradedollar.setText("Cost:" + factory1.getMoneyearned()*10);

            }timer.scheduleAtFixedRate(timerTask,0,3000);
        }


    };



}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class upgrademsActionListener implements ActionListener {
    Bank bank = new Bank();
    Factory1 factory1 = new Factory1();


    @Override
    public void actionPerformed(ActionEvent e) {

        if (bank.getMoney() >= factory1.getPeriodPrice()) {

            if (factory1.getPeriod() > 0) {

                factory1.changedperiod = true;
                factory1.setPeriod(factory1.getPeriod() - 50);
                System.out.println("Payout period is now " + factory1.getPeriod() + " milliseconds from " + (factory1.getPeriod() + 50) + " milliseconds");
                Game_Window.labelforupgradems.setText("Upgraded! Payout period is now "+factory1.getPeriod()+ " milliseconds! (-50ms)");
                bank.setMoney(bank.getMoney() - (factory1.getPeriodPrice()));
                System.out.println("Your balance is now " + bank.getMoney());

                factory1.setPeriodPrice((int) (factory1.getPeriodPrice() * 2));
                Game_Window.nextupgradems.setText("Next upgrade:$" + factory1.getPeriodPrice());

            } else {

                System.out.println("Already Maxed!");


            }


        }else{

            Game_Window.labelforupgradems.setText("You don't have enough $! You need $" + (factory1.getPeriodPrice() - bank.getMoney())+" more!");

        }
//
//        Timer timer = new Timer();
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                if(bank.getMoney() >= factory1.getPeriodPrice()) {
//
//                    if (factory1.getPeriod() > 0) {
//
//                        Game_Window.labelforupgradems.setText("Upgraded! Payout period is now "+factory1.getPeriod()+ " milliseconds! (-50ms)");
//
//
//
//
//                    }else {
//
//                        Game_Window.labelforupgradems.setText("Maxed!");
//
//
//                    }
//
//                }else {
//
//
//                    Game_Window.labelforupgradems.setText("You don't have enough $! You need $" + (factory1.getPeriodPrice() - bank.getMoney())+" more!");
//
//
//
//                }
//
//            }
//
//        };
//
//        timer.scheduleAtFixedRate(timerTask, 1,1);
//
    }
}

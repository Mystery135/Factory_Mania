import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class upgrademsActionListener implements ActionListener {
    Bank bank = new Bank();
    Factory1 factory1 = new Factory1();


    @Override
    public void actionPerformed(ActionEvent e) {

        if(bank.getMoney() >= 1010 - factory1.getPeriod()) {

            if (factory1.getPeriod() > 0 ){

                factory1.changedperiod = true;
                factory1.setPeriod(factory1.getPeriod()-50);
                System.out.println("Payout period is now " + factory1.getPeriod() + " milliseconds from " + (factory1.getPeriod() +50) + " milliseconds");
                bank.setMoney(bank.getMoney() - (960-factory1.getPeriod()));
                System.out.println("Your balance is now " + bank.getMoney());



            }else {

                System.out.println("Already Maxed!");


            }


        }




    }



}

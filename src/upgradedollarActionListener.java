import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class upgradedollarActionListener implements ActionListener {
    Bank bank = new Bank();
    Factory1 factory1 = new Factory1();
    @Override
    public void actionPerformed(ActionEvent e) {

        if(bank.getMoney() >= factory1.getMoneyearned()*10) {


            bank.setMoney(bank.getMoney() - factory1.getMoneyearned() * 10);
            factory1.setMoneyearned(factory1.getMoneyearned() + 1);
            System.out.println("Upgraded! You now make $" + factory1.getMoneyearned() + " per second! You balance is now $" + bank.getMoney() + " from $" + (bank.getMoney() + (factory1.getMoneyearned() - 1) * 10));
        }else {

            System.out.println("You don't have enough $! You need $" + ((factory1.getMoneyearned()*10)-bank.getMoney())+" more!");

        }
    }
}

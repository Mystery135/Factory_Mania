import java.util.Timer;
import java.util.TimerTask;

public class Factory1 extends Factory{
private static double moneyearned = 1;
private static int delay = 1000;//doesnt matter
    private static int period = 1000;





    @Override
    void work() {
        System.out.println("working!");
Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            Bank bank = new Bank();
            @Override
            public void run() {

double a = bank.getMoney();
bank.setMoney(a + moneyearned);
//System.out.print(bank.getMoney());
            }
        };
        timer.scheduleAtFixedRate(timerTask,delay,period);
    }

    public double getMoneyearned() {
        return moneyearned;
    }

    public void setMoneyearned(double moneyearned) {
        this.moneyearned = moneyearned;
    }


    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }


}

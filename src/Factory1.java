import java.sql.Struct;
import java.util.Timer;
import java.util.TimerTask;

public class Factory1 extends Factory{
    public static boolean changedperiod = false;
private static double moneyearned = 1;
private static int delay = 1000;//doesnt matter
    private static int period = 1000;
    private static int periodPrice =10;




    Bank bank = new Bank();
    @Override
    void work() {
        System.out.println("working!");
Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {


            @Override
            public void run() {

double a = bank.getMoney();
bank.setMoney(a + moneyearned);
//System.out.print(bank.getMoney());




            }
        };
        timer.scheduleAtFixedRate(timerTask,delay,period);

Timer changedperiodtimer = new Timer();
TimerTask changedperiodtimertask = new TimerTask() {
    @Override
    public void run() {

        if (changedperiod == true){
            System.out.println("Changedperiod is true(2)");
            changedperiod = false;
            timer.cancel();
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {


                @Override
                public void run() {

                    double a = bank.getMoney();
                    bank.setMoney(a + moneyearned);
//System.out.print(bank.getMoney());




                }
            };
            timer.scheduleAtFixedRate(timerTask,delay,period);

        }
    }
};
changedperiodtimer.scheduleAtFixedRate(changedperiodtimertask, 1, 1);





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

    public int getPeriodPrice(){

        return periodPrice;


    }
    public void setPeriodPrice(int periodPrice){
        this.periodPrice = periodPrice;




    }



}

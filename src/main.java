import java.util.Scanner;

/**
Author: Mystery
Version: 0.1
Alpha Release: 2021-10-10
 */

public class main {


    public static void main(String[] args){

Factory1 factory1 = new Factory1();

boolean started = false;

while(!started){


    Scanner scan = new Scanner(System.in);
    System.out.println("Start game? (Type 'yes' Or 'Yes' To Start)");
    String a = scan.nextLine();
    if (a.equals("yes") || a.equals("Yes")){
        started = true;
        System.out.println("Type 'how much money', 'How much money', or 'bal' to see your money");

        factory1.work();


    }

}






while(true){

    Bank bank = new Bank();
    Scanner scan = new Scanner(System.in);
String input = scan.nextLine();
    if (input.equals("how much money")||input.equals("How much money")||input.equals("bal")){


        System.out.println("You have $" + bank.getMoney());


    }else if (input.equals("Upgrade") || input.equals("upgrade")){
        boolean ActionDone = false;

        while(!ActionDone){

            System.out.println("Do You Want To Upgrade $/SECOND (type '1' to select this) Or TIME/$ (type '2' to select this)? Type 'exit' to exit");
            String input2 = scan.nextLine();
            if (input2.equals("$/second") || input2.equals("1")){
                ActionDone = true;


    if(bank.getMoney() >= factory1.getMoneyearned()*10) {


        bank.setMoney(bank.getMoney() - factory1.getMoneyearned() * 10);
        factory1.setMoneyearned(factory1.getMoneyearned() + 1);
        System.out.println("Upgraded! You now make $" + factory1.getMoneyearned() + " per second! You balance is now $" + bank.getMoney() + " from $" + (bank.getMoney() + (factory1.getMoneyearned() - 1) * 10));
    }else {

        System.out.println("You don't have enough $! You need $" + ((factory1.getMoneyearned()*10)-bank.getMoney())+" more!");

    }



            }





            else if (input2.equals("time/$") || input2.equals("2") || factory1.getPeriod() >= 0){

ActionDone = true;

                if(bank.getMoney() >= 1010 - factory1.getPeriod()) {

factory1.setPeriod(factory1.getPeriod()-50);
System.out.println("Payout period is now " + factory1.getPeriod() + " milliseconds from " + (factory1.getPeriod() +50) + " milliseconds");
bank.setMoney(bank.getMoney() - (960-factory1.getPeriod()));
System.out.println("Your balance is now " + bank.getMoney());


                }





            }else if (input2.equals("close") || input2.equals("Close")){


                ActionDone = true;





            }




        }


    }



}



    }


}

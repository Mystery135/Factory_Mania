import javax.swing.*;

public class Game_Window {

    JFrame frame = new JFrame("Factory Mania");
    JPanel panel = new JPanel();
private static JLabel balance;

    Game_Window(){

balance = new JLabel("Hello!");
balance.setBounds(100,100,0,20);
panel.add(balance);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);






    }



}

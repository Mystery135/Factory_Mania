import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LauncherActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
System.out.println("WORKING~");
new Game_Window();

    }
}

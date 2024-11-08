import java.awt.*;
import java.awt.event.*;

public class SimpleAWTFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple AWT Frame");
        Button button = new Button("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

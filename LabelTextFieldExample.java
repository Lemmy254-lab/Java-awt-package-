import java.awt.*;
import java.awt.event.*;

public class LabelTextFieldExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Label and TextField Example");
        Label label = new Label("Enter your name:");
        TextField textField = new TextField(20);
        Button button = new Button("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello, " + textField.getText() + "!");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

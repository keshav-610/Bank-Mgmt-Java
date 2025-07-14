import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {

    public static void main(String[] args) {
        // Create frame (window)
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create UI components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Greet");
        JLabel output = new JLabel();

        // Add button functionality
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                output.setText("Hello, " + name + "!");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(output);

        // Make frame visible
        frame.setVisible(true);
    }
}

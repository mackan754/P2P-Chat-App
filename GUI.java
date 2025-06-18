
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {

    public GUI(Client client, Server server) {

        JFrame frame = new JFrame("P2P Chat App");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel ipLabel = new JLabel("IP Address:");
        JTextField ipField = new JTextField(20);
        JLabel portLabel = new JLabel("Port:");
        JTextField portField = new JTextField(5); 
        JButton button = new JButton("Connect");

        button.addActionListener((ActionEvent e) -> {
            client.setIp(ipField.getText());
            client.setPort(portField.getText());
            
            /* JOptionPane.showMessageDialog(frame, "Hello, " + name + "!"); */
        });

        frame.add(ipLabel);
        frame.add(ipField);
        frame.add(portLabel);
        frame.add(portField);
        frame.add(button);

        frame.setVisible(true);
    }
}

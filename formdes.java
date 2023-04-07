import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormDesign extends JFrame {
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JButton displayButton;
    private JTextArea infoArea;

    public FormDesign() {
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        displayButton = new JButton("Display");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String info = "Name: " + name + "\nEmail: " + email;
                infoArea.setText(info);
            }
        });
        infoArea = new JTextArea(20, 30);
        infoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(infoArea);
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        formPanel.add(nameLabel, c);
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        formPanel.add(nameField, c);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_END;
        formPanel.add(emailLabel, c);
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_START;
        formPanel.add(emailField, c);
        c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.CENTER;
        formPanel.add(displayButton, c);
        JPanel infoPanel = new JPanel();
        infoPanel.add(scrollPane);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(formPanel, BorderLayout.NORTH);
        cp.add(infoPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormDesign();
    }
}



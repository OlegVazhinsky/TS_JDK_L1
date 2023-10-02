package client.example;

import javax.swing.*;
import java.awt.*;

public class ClientWindow extends JFrame{
    private static final int WIDTH = 600;
    private static final int HEIGHT = 700;

    JPanel panel;
    JButton loginButton, sendButton;
    JTextField ip, port, nickName, drowssap, textWindow, sendWindow;
    JLabel ipLabel, portLabel, nicknameLabel, drowssapLabel;

    ClientWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Chat client");
        setResizable(false);

        loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(80, 20));
        sendButton = new JButton("Send");
        sendButton.setPreferredSize(new Dimension(80, 20));

        ipLabel = new JLabel("IP adress:");
        portLabel = new JLabel("Port:");
        nicknameLabel = new JLabel("Nickname:");
        drowssapLabel = new JLabel("Password");

        ip = new JTextField("127.0.0.1");
        port = new JTextField("8189");
        nickName = new JTextField("Ivan Ivanovich");
        drowssap = new JTextField("********");
        textWindow = new JTextField();
        textWindow.setPreferredSize(new Dimension(500, 500));
        sendWindow = new JTextField("Text...");

        //------------------------------------------------------------------------------------------//
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 0.7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(ipLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(ip, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(portLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(port, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(nicknameLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(nickName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(drowssapLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(drowssap, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(loginButton, gbc);
        //------------------------------------------------------------------------------------------//



        //------------------------------------------------------------------------------------------//
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        panel.add(textWindow, gbc);
        //------------------------------------------------------------------------------------------//



        //------------------------------------------------------------------------------------------//
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(sendWindow, gbc);
        gbc.gridx = 2;
        gbc.gridy = 5;
        panel.add(sendButton, gbc);
        add(panel);
        //------------------------------------------------------------------------------------------//

        setVisible(true);

    }

}

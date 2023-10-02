package server.example;

import javax.swing.*;
import java.awt.*;

public class ServerWindow extends JFrame{
    private static final int WIDTH = 600;
    private static final int HEIGHT = 700;

    JButton startButton, stopButton;

    JTextField textLog;

    ServerWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Chat server");
        setResizable(false);

        textLog = new JTextField();
        textLog.setPreferredSize(new Dimension(500, 600));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 0.7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;

        panel.add(textLog, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(startButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(stopButton, gbc);

        add(panel);

        setVisible(true);

    }

}

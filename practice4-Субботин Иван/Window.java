package ru.mirea.practice04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0",SwingConstants.CENTER);
    JLabel scorer = new JLabel("Last Scorer: - ",SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW",SwingConstants.CENTER);
    int a = 0;
    int b = 0;
    public Window(){
        super("practice04");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add (button1, BorderLayout.WEST);
        add (button2, BorderLayout.EAST);
        add (result, BorderLayout.NORTH);
        add (scorer, BorderLayout.CENTER);
        add (winner, BorderLayout. SOUTH);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                result.setText("Result: "+ a + " X " + b);
                scorer.setText("Last scorer: AC Milan");
                if(a>b){winner.setText("Winner: AC Milan");}
                else if (a == b){winner.setText("Winner: DRAW");}
                else {winner.setText("Winner: Real Madrid");}
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b++;
                result.setText("Result: "+ a + " X " + b);
                scorer.setText("Last scorer: Real Madrid");
                if(a>b){winner.setText("Winner: AC Milan");}
                else if (a == b){winner.setText("Winner: DRAW");}
                else {winner.setText("Winner: Real Madrid");}
            }
        });
        setSize(350,350);
        setVisible(true);
    }
}

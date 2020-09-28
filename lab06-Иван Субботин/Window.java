package ru.mirea.lab06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JTextArea textArea = new JTextArea(12,30);
    Font fnt = new Font("Times new roman", Font.BOLD, 18);
    private JButton button1 = new JButton("Submit");
    private JMenu colorChoose(){
        JMenu file = new JMenu("Choose font color");

        JMenuItem colorBlue = new JMenuItem("Choose blue color");
        colorBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        JMenuItem colorRed = new JMenuItem("Choose red color");
        colorRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        JMenuItem colorBlack = new JMenuItem("Choose black color");
        colorBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        file.add(colorBlue);
        file.add(colorRed);
        file.add(colorBlack);
        return(file);
    }
    private JMenu fontChoose(){
        JMenu file = new JMenu("Choose font");

        JMenuItem TNR = new JMenuItem("Choose Times New Roman");
        TNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fnt = new Font("Times new roman", Font.BOLD, 18);
                textArea.setFont(fnt);
            }
        });

        JMenuItem MSS = new JMenuItem("Choose MS Sans Serif");
        MSS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fnt = new Font("MS Sans Serif", Font.BOLD, 18);
                textArea.setFont(fnt);
            }
        });


        JMenuItem CN = new JMenuItem("Choose Courier New");
        CN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fnt = new Font("Courier New", Font.BOLD, 18);
                textArea.setFont(fnt);
            }
        });

        file.add(TNR);
        file.add(MSS);
        file.add(CN);
        return(file);
    }

    private JMenuBar menuBar(){
        JMenuBar file = new JMenuBar();
        file.add(fontChoose());
        file.add(colorChoose());
        return(file);
    }

    Window(){
        super("MenuWindow");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(menuBar(), BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        textArea.setFont(fnt);
        add(button1, BorderLayout.SOUTH);
        setSize(500,400);
        setVisible(true);


    }
}

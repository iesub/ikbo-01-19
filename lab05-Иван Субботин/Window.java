package ru.mirea.lab05;

import javax.swing.*;

public class Window extends JFrame {
    Window(){
        super("Picture Preview");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,350);
        setVisible(true);
    }
}

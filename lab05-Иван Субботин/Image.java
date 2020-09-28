package ru.mirea.lab05;

import javax.swing.*;
import java.awt.*;

public class Image extends JPanel {
    private java.awt.Image image;
    public Image(String line)
    {
        image = new ImageIcon(line).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 3, 4, this);
    }
}

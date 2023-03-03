package com.panels;

import javax.swing.*;
import java.awt.*;

public class mainMenu extends JPanel {
    public MainCanvas myCanvas;
    public GridBagConstraints grid1;
    public GridBagConstraints grid2;
    JLabel Hola;

    public mainMenu() {
        myCanvas = new MainCanvas();
        Hola = new JLabel("Welcome to Parakeet Chat (Alpha Version)");
        add(Hola);
    }

    public class MainCanvas extends Canvas {
        public void paint (Graphics g){
            Image img = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("assets/parakeet.png"));
            g.drawImage(img, 80, 0, this);
        }
    }
}
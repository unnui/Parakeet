package com;

import javax.swing.*;
import java.awt.*;

import com.panels.mainMenu;

public class mainWindow extends JFrame {

    JMenuBar taskbar;
    JMenu settings, profile, tools, help;
    mainMenu myMainMenu;

    public mainWindow() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch(Exception e)
        {
            e.getMessage();
        }

        /* Taskbar declarations! */
        taskbar = new JMenuBar();
        settings = new JMenu("Settings");
        profile = new JMenu("Profile");
        tools = new JMenu("Tools");
        help = new JMenu("Help");
        
        taskbar.add(settings); taskbar.add(profile);
        taskbar.add(tools); taskbar.add(help);
        
        /* mainWindow declarations! */
        setJMenuBar(taskbar);
        setSize(720,480);
        setResizable(false);
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Parakeet Alpha Version");
        setVisible(true);

        /* Default initalizations! */
        myMainMenu = new mainMenu();
        add(myMainMenu);
        add(myMainMenu.myCanvas);
        
        
    }

}

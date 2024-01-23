package Main;

import javax.swing.*;

public class GameWindow {

    private JFrame jframe;
    public GameWindow(GamePanel gamePanel) {

        jframe = new JFrame();


        jframe.setVisible(true);    // makes the window visible
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // terminates program after closed
    }
}

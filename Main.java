
package BrickBreaker;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
       JFrame object = new JFrame();
       Gameplay g = new Gameplay();
       object.setBounds(10,10,700,600);
       object.setTitle("Breakout Ball");
       object.setResizable(false);
       object.setVisible(true);
       object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       object.add(g);
    }
}

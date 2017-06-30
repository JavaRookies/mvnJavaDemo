package nuist.dymvn.GUITest;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by dy on 2017/5/19.
 */
public class KeyEventDemo {
    public static void main(String args[]){
        MyFrame frame = new MyFrame();
        frame.lauchFrame();

    }
    static  class MyFrame extends Frame{
        public void lauchFrame(){
            setTitle("KeyEventDemo!!");
            setBackground(Color.yellow);
            setSize(600,400);
            setLocation(300,300);
            TextField textField = new TextField();
            textField.addKeyListener(new MyKeyMonitor());
            add(textField);
            setVisible(true);
        }
    }
    static class MyKeyMonitor extends KeyAdapter{
        public void keyPressed(KeyEvent event){
            int code = event.getKeyCode();
            if(code == KeyEvent.VK_UP)
                System.out.println("对了，就是他");
        }
    }
}

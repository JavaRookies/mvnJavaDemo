package nuist.dymvn.GUITest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dy on 2017/5/11.
 */
public class MonitorDemo {
    public static void main(String args[]){
        MyFrame f = new MyFrame(500,500,600,500, Color.blue);
        f.setTitle("My first monitorDemo！");
        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");
        Monitor monitor = new Monitor();
        button1.setActionCommand("Game start!");
        button2.setActionCommand("Game over!");
        button1.addActionListener(monitor);
        button2.addActionListener(monitor);
        f.add(button1,BorderLayout.NORTH);
        f.add(button2,BorderLayout.CENTER);
    }
    private static class Monitor implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("接下来的信息是："+e.getActionCommand());
        }
    }

}

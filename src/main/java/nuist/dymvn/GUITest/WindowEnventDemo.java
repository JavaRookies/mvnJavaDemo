package nuist.dymvn.GUITest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by dy on 2017/5/17.
 */
public class WindowEnventDemo {
    public static void main(String Args[]){
        MyFrame frame = new MyFrame();
        frame.launchFrame();
    }

    static class MyFrame extends Frame{
        TextField textField;
        Button button;
        int flag = 1;
        public void launchFrame(){
            setLayout(new BorderLayout());
            setTitle("WindowEventDemo!!");
            button = new Button("Start");
            button.addActionListener(new MyMonitor());
            textField = new TextField();
            add(button,BorderLayout.NORTH);
            add(textField,BorderLayout.CENTER);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            setVisible(true);
            pack();
        }
        class MyMonitor implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField.setText("Start"+ flag++);
            }
        }
    }
}

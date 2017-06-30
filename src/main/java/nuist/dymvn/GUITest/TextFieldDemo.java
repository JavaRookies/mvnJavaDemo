package nuist.dymvn.GUITest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dy on 2017/5/14.
 */
public class TextFieldDemo {
    public static void main(String args[]){
        TextField textField = new TextField();
        TFActionListener tfActionListener = new TFActionListener();
        textField.addActionListener(tfActionListener);
        MyFrame frame = new MyFrame(textField);
        frame.pack();

    }

    static class TFActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            TextField textField = (TextField)e.getSource();
            System.out.println(textField.getText());
            textField.setText("");
        }
    }
}


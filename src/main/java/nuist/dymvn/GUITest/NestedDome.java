
package nuist.dymvn.GUITest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dy on 2017/5/16.
 */
public class NestedDome {
    public static void main(String Args[]){
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.lanchFrame();
    }


    static class TextFieldFrame extends Frame{
        TextField textField1 ;
        TextField textField2 ;
        TextField textField3 ;
        public void lanchFrame(){
            textField1 = new TextField(10);
            textField2 = new TextField(10);
            textField3 = new TextField(10);
            Label lable = new Label("+");
            Button button = new Button("=");
            button.addActionListener(new NestdMonitor());
            setLayout(new FlowLayout());
            setTitle("nestedDemo");
            add(textField1);
            add(lable);
            add(textField2);
            add(button);
            add(textField3);
            setVisible(true);
            pack();

        }
        private class NestdMonitor implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                String num3 = textField1.getText() + textField2.getText();
                textField3.setText(num3);

            }
        }
    }
}

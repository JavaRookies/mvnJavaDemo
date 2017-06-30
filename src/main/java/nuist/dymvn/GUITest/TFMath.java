package nuist.dymvn.GUITest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dy on 2017/5/15.
 */
public class TFMath {
    public static  void main(String Args[]){
        FrameTFMath frameTFMath = new FrameTFMath();

    }
    static class FrameTFMath extends Frame {
        TextField textField1 ;
        TextField textField2 ;
        TextField textField3 ;
        public FrameTFMath(){
            textField1 = new TextField(10);
            textField2 = new TextField(10);
            textField3 = new TextField(10);
            Label lable = new Label("+");
            Button button = new Button("=");
            button.addActionListener(new TFMathMonitor(this));
            setLayout(new FlowLayout());
            add(textField1);
            add(lable);
            add(textField2);
            add(button);
            add(textField3);
            pack();
            setVisible(true);
        }
    }
    static class TFMathMonitor implements ActionListener{
        FrameTFMath frame1 ;
        public void actionPerformed(ActionEvent e) {
            int num = Integer.parseInt(frame1.textField1.getText())+Integer.parseInt(frame1.textField2.getText());
            frame1.textField3.setText(String.valueOf(num));
        }
        public TFMathMonitor(FrameTFMath frameTFMath){
            frame1 = frameTFMath;
        }
    }

}

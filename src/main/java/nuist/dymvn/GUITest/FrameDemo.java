/**
 * Created by dy on 2017/5/10.
 */
package nuist.dymvn.GUITest;

import java.awt.*;

public class FrameDemo {
    public static void main(String args[]){
        int fx =400,fy =400,fwidth = 600,fheigh = 400;
        MyFrame f1 = new MyFrame(fx,fy,fwidth,fheigh, Color.blue);
        f1.setTitle("My first frame!!!");
        Panel p = new Panel(null);
        p.setBounds(fwidth/4,fheigh/4,fwidth-fwidth/2,fheigh-fheigh/2);//p的位置是相对于容器Frame的
        p.setBackground(Color.yellow);
        p.setVisible(true);
        f1.add(p);
    }
}

     class MyFrame extends Frame {
        static int id = 0;

        public MyFrame(int x, int y, int width, int height, Color color) {
            super("MyFrame" + (++id));
            setBackground(color);
            setBounds(x, y, width, height);
            setVisible(true);
        }
        public MyFrame(TextField textField){
            setBounds(400,400,600,400);
            add(textField);
            setVisible(true);


        }
    }





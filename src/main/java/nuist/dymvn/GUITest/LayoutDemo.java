package nuist.dymvn.GUITest;

import java.awt.*;

/**
 * Created by dy on 2017/5/11.
 */
public class LayoutDemo {
    public static void main(String Args[]){
        MyFrame f = new MyFrame(500,500,600,500,Color.yellow);
        f.setTitle("LayoutDemo!!!");
        f.setLayout(new GridLayout(2,1));
        Panel panel11 = new Panel(new BorderLayout());
        Panel panel12 = new Panel();
        panel12.setLayout(new GridLayout(2,1));
        Panel panel21 = new Panel(new BorderLayout());
        Panel panel22 = new Panel();
        panel22.setLayout(new GridLayout(2,2));

        panel11.add(new Button("Button"),BorderLayout.WEST);
        panel11.add(new Button("Button"),BorderLayout.EAST);
        panel12.add(new Button("Button"));
        panel12.add(new Button("Button"));
        panel11.add(panel12,BorderLayout.CENTER);
        f.add(panel11);
        panel21.add(new Button("Button"),BorderLayout.WEST);
        panel21.add(new Button("Button"),BorderLayout.EAST);
        for(int i =0;i<4;i++)
            panel22.add(new Button("Button"));
        panel21.add(panel22);
        f.add(panel21);
     }

}

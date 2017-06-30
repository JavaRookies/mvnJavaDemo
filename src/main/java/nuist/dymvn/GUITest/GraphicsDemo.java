package nuist.dymvn.GUITest;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 * Created by dy on 2017/5/16.
 */
public class GraphicsDemo {
    public static void main(String Args[]){
        GraphicsFrame frame = new GraphicsFrame();
        frame.lanchFrame();
    }

    static class GraphicsFrame extends Frame{
        ArrayList<Point> points = new ArrayList<Point>();
        int x, y;
        public void lanchFrame(){
            setBounds(500,500,600,400);
            setBackground(Color.yellow);
            //points.add(new Point(540,600));
            addMouseListener(new MouseMonitor());
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            setVisible(true);
        }
        public void addPoint(){
            Point point = new Point(x,y);
            points.add(point);
        }
        public void paint(Graphics g){
            Color c = g.getColor();
            g.setColor(Color.blue);
            g.fillOval(50,50,100,100);
            g.setColor(c);
            if(!points.equals(null)){
                for (int i=0;i<points.size();i++){

                    Point point  = points.get(i);
                    g.setColor(Color.blue);
                    g.fillOval(point.x,point.y,20,20);
                }
            }
        }
        class MouseMonitor extends MouseAdapter {
            public void mouseClicked(MouseEvent e){
                x = e.getX();
                y = e.getY();
                addPoint();
                repaint();
            }

        }
    }


}

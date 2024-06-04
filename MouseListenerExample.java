import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

class MyAdapter extends MouseAdapter {

        JLabel label;
        public MyAdapter(JLabel label) {
           this.label = label;
        }

   public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.blue);
   }

   public void mouseExited(MouseEvent e) {
        label.setBackground(Color.red);
   }

}


public class MouseListenerExample extends JFrame {
        JLabel label = new JLabel();
   public MouseListenerExample() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        label.setSize(100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(new MyAdapter(label));
        this.add(label);
        this.setVisible(true);
    }



   public static void main(String[] args) {
        new MouseListenerExample();
   }
}

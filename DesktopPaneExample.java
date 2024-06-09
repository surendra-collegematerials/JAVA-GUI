import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class DesktopPaneExample extends JFrame {
	JDesktopPane dp;
	public DesktopPaneExample () {
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(null);

		dp = new JDesktopPane();
		add(dp,BorderLayout.CENTER);

		display(dp);
		

		
		this.setVisible(true);
	
   }

	void display(JDesktopPane dp) {
		int numFrames = 3;
		int x=30, y=30;

		for(int i = 0; i<numFrames; ++i) {
			JInternalFrame iframe = new JInternalFrame("Internal Frame" + (i+1) , true, true, true, true);
			iframe.setBounds(x,y,250,100);
			iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
			iframe.add(new JLabel("I love coding..."));
			iframe.setVisible(true);
			dp.add(iframe);
			y += 100;
      }
   }

	public static void main(String[] args) {
		new DesktopPaneExample();
	}
}

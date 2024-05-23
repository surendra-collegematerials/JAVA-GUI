import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;




public class JCheckBoxExample extends JFrame implements ActionListener {
	JButton button;
	JCheckBox checkBox;
   public JCheckBoxExample() {	
		setSize(500,500);	
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		checkBox = new JCheckBox();
		checkBox.setText("I'm not Robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font(null,Font.PLAIN,20));
		
		button = new JButton("submit");
		button.addActionListener(this);

		ImageIcon crossIcon;
		ImageIcon checkIcon;

		crossIcon = new ImageIcon("cross.png");
		checkIcon = new ImageIcon("check.png");


		checkBox.setIcon(crossIcon);
		checkBox.setSelectedIcon(checkIcon);

		add(checkBox);
		add(button);
		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
   }
}

		


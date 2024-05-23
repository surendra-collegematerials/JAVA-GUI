import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;





public class JRadioButtonExample extends JFrame implements ActionListener {

	JFrame frame = new JFrame();
	JRadioButton pizzaButton = new JRadioButton();
	JRadioButton burgerButton = new JRadioButton();
	JRadioButton hotdogButton  = new JRadioButton();

	ImageIcon pizzaIcon = new ImageIcon("pizza.png");
	ImageIcon burgerIcon = new ImageIcon("burger.png");
	ImageIcon hotdogIcon = new ImageIcon("hotdog.png");

	public JRadioButtonExample() {
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		pizzaButton.setText("Pizza");
		burgerButton.setText("Burger");
		hotdogButton.setText("Hot Dog");

		pizzaButton.setFont(new Font(null,Font.PLAIN,35));
		burgerButton.setFont(new Font(null,Font.PLAIN,35));
		hotdogButton.setFont(new Font(null,Font.PLAIN,35));

		pizzaButton.setForeground(Color.red);
		burgerButton.setForeground(Color.red);
		hotdogButton.setForeground(Color.red);

		pizzaButton.setBackground(Color.black);
		burgerButton.setBackground(Color.black);
		hotdogButton.setBackground(Color.black);


		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(burgerButton);
		group.add(hotdogButton);

		pizzaButton.addActionListener(this);
		burgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);


		pizzaButton.setIcon(pizzaIcon);
		burgerButton.setIcon(burgerIcon);
		hotdogButton.setIcon(hotdogIcon);


		add(pizzaButton);
		add(burgerButton);
		add(hotdogButton);
		pack();
		
   }


   public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzaButton) {
			System.out.println("You ordered pizza");
		}else if(e.getSource() == burgerButton) {
			System.out.println("You ordered burger");
		}else if(e.getSource() == hotdogButton) {
			System.out.println("You ordered hotdog");
		}
   }

}

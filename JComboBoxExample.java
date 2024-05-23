import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;



public class JComboBoxExample extends JFrame implements ActionListener {
	
	JComboBox<String> comboBox ;
	public JComboBoxExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		String[] animals = {"dog", "cat", "bird"};
		comboBox = new JComboBox<String>(animals);

//		comboBox.setEditable(true);
//		System.out.println(comboBox.getItemCount());
//		comboBox.addItem("horse");								// put horse at the end
//		comboBox.insertItemAt("buffalo",0);					// put buffalo at the beginning off list
//		comboBox.setSelectedIndex(0);							// put 0th item in the list by deault
//		comboBox.removeItem("cat");							// removes "cat" from the drop-down display
//		comboBox.removeItemAt(0);								// remove item at 0th location
// 	comboBox.removeAllItems();								// removes all the items in the list
		comboBox.addActionListener(this);

		add(comboBox);
		pack();
		setVisible(true);
   }

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
		
	}
}

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;


public class TableExample extends JFrame {
	public TableExample() {
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(null);

		String[][] data = {
									{"rajan", "45", "surya nepal"},
									{"govind", "55", "hotel himalaya"}

								};


		String[] columnNames = {"Name", "Age", "Company"};

		JTable table = new JTable(data, columnNames);
		table.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp, BorderLayout.CENTER);
		this.setVisible(true);
	
   }

	public static void main(String[] args) {
		new TableExample();
	}
}

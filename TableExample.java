import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class TableExample extends JFrame{
	
	public TableExample() {

		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);


		String[][] data = {

							{"Ram", "15", "Chovar"},
							{"Sita", "25", "Kirtipur"},
							{"Gopal", "17", "Taudaha"},
      };

		String[] column = {"Name", "Age", "Address"};
	  JTable table = new JTable(data, column);	

		
		//add(new table);

		add(new JScrollPane(table));
		


		setVisible(true);
	
   }

   public static void main(String[] args) {
      new TableExample();
	}
}

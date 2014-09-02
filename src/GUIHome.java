import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;


public class GUIHome implements ActionListener
{
	// Fields
	JFrame homeFrame = new JFrame("Topics Agency");
	JButton add = new JButton("Add Speaker");
	JButton book = new JButton("Book Appointment");
	JLabel mainLabel = new JLabel("Home");
	JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));	
	
	public GUIHome() throws FileNotFoundException
	{
		DataClass dc = new DataClass();
		// the main frame
		homeFrame.setSize(1000, 560);
		homeFrame.setLayout(new BorderLayout(15, 15));
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setLocationRelativeTo(null);
		
		// get the table from DataClass
		JTable table = DataClass.dataTable;
		
		//// enable columns sort
		table.setAutoCreateRowSorter(true);
		
		//// make all cells editable
		table.setEnabled(true);
		
		// add the memberlist table to a scroll pane
		JScrollPane dataGrid = new JScrollPane(table);
		
		// add everything to the main frame
		homeFrame.setLayout(new BorderLayout(5,5));
		southPanel.add(add);
		southPanel.add(book);
		homeFrame.add(mainLabel,BorderLayout.NORTH);
		homeFrame.add(dataGrid,BorderLayout.CENTER);
		homeFrame.add(southPanel,BorderLayout.SOUTH);
		homeFrame.setVisible(true);
		
		// add action listener to buttons
		add.addActionListener(this);
		book.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == add)
		{
			GUIAddSpeaker add = new GUIAddSpeaker();
		}
		if (event.getSource() == book)
		{
			//SearchMemberScreen searchMember = new SearchMemberScreen();
		}
	}
	
}

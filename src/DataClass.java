import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JTable;


public class DataClass
{
	// Fields
		public static ArrayList<Speaker> members = new ArrayList<Speaker>();
		public static Object[][] memberDetails; 
		private static String[] columnNames = {"ID", "Name", "Expertise", "Type"};
		public static JTable dataTable;
		
		// Constructor
		public DataClass() throws FileNotFoundException
		{
			refreshFromFile();
		}
		
		public static void refreshFromFile() throws FileNotFoundException
		{
			members = FileProcessing.readFromFile();
			memberDetails = Speaker.convertArrayListToObject(members);
			dataTable = new JTable(memberDetails, columnNames);
		}
}

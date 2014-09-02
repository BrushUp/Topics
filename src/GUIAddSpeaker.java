import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.color.ProfileDataException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIAddSpeaker implements ActionListener
{
	//Fields
    JFrame mainFrame = new JFrame("Speaker Profile");;
        
    //// Text labels
    JLabel name = new JLabel("   Speaker Name:" );
    JLabel expert = new JLabel("   Expertise:");
    JLabel type = new JLabel("   Speaker Type:");
    
    //// Text fields
    JTextField textName = new JTextField(50);
    JTextField textExpert = new JTextField(50);
    JTextField textType = new JTextField(50);
    
    //// Buttons
    JButton book = new JButton("Book Appointment");
    JButton saveMember = new JButton("Save Speaker");
    
    //// JPanels
    JPanel profile = new JPanel(new GridLayout(3,2));
    JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));	
    
    // Constructors
    public GUIAddSpeaker() // empty form
    {    	
    	mainFrame.setSize(400,180);
    	mainFrame.setLocationRelativeTo(null);
    	mainFrame.setLayout(new BorderLayout(15, 15));
    	
    	profile.add(name);
    	profile.add(textName);
    	profile.add(expert);
    	profile.add(textExpert);
    	profile.add(type);
    	profile.add(textType);

    	mainFrame.add(profile, BorderLayout.CENTER);
    	
    	southPanel.add(book);
    	southPanel.add(saveMember);
    	
    	mainFrame.add(southPanel, BorderLayout.SOUTH);
    	mainFrame.setVisible(true);
    	
    	// add action listener to buttons
    	saveMember.addActionListener(this);
    	book.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event)
    {
    	// Variables
    	String name = "UNFILLED";
	    String expertise = "UNFILLED";
	    String type = "UNFILLED";
        Speaker speaker = null;
          
  	    // Text fields
  	    name = textName.getText();
  	    expertise = textExpert.getText();
  	    type = textType.getText();
  	    
  	    speaker = new Speaker(name, expertise, type);
  	    
  	    if(event.getSource() == saveMember)
  	    {
  	    	FileProcessing.writeToFileSpeakers(speaker);
  	    	mainFrame.dispose();
  	    }
  	    
  	    if(event.getSource() == book)
	    {
	    	mainFrame.dispose();
	    }
  	
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class FileProcessing
{
	// Fields
		static File fileOutput = new File("SpeakerOutput.txt");
		
		public static void writeToFileSpeakers(Speaker speaker)
		{                     
		     PrintStream speakers = null;
		     try
		     {
		         speakers = new PrintStream(new FileOutputStream(fileOutput, true));
		     }
		     catch (FileNotFoundException e)
		     {
		    	 
		     } 
		     speakers.println(speaker.getSpeakerId() + "\t" + speaker.getSpeakerName() + "\t" + speaker.getFieldOfExpertise() + "\t" + speaker.getSpeakerType()); 
		     speakers.close();    
		}
		
		public static ArrayList<Speaker> readFromFile() throws FileNotFoundException
		{
			ArrayList<Speaker> speakersReadFromFile = new ArrayList<Speaker>();
			Speaker addedSpeaker = null;
			Scanner scanner = new Scanner(fileOutput);
			int speakerId = 0;
			String speakerName = "";
			String expertise = "";
			String type = "";
			while(scanner.hasNext())
			{
				speakerId = scanner.nextInt();
				speakerName = scanner.next();
				expertise = scanner.next();
				type = scanner.next();
				addedSpeaker = new Speaker(speakerName, expertise, type);
				speakersReadFromFile.add(addedSpeaker);
			}
			return speakersReadFromFile;
		}
	}
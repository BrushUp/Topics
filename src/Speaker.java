import java.util.ArrayList;

public class Speaker 
{
	public static int Id = 0;
	private int SpeakerId;;
	private String speakerName;
	private String fieldOfExpertise;
	private String type;
	
	public Speaker(String speakerName, String expertise, String type)
	{
		this.SpeakerId = Id;
		this.speakerName = speakerName;
		this.fieldOfExpertise = expertise;
		this.type = type;
		Id ++;
	}
	
	public String getSpeakerName()
	{
		return this.speakerName;
	}
	
	public String getFieldOfExpertise()
	{
		return this.fieldOfExpertise;
	}
	
	public String getSpeakerType()
	{
		return this.type;
	}
	
	public int getRate()
	{
		int rate = 0;
		if (this.type.equalsIgnoreCase("Premium"))
		{
			rate = 10000;
		}
		if (this.type.equalsIgnoreCase("Medium"))
		{
			rate = 5000;
		}
		else
		{
			rate = 3000;
		}
		return rate;
	}
	
	public int getSpeakerId()
	{
		return this.SpeakerId;
	}
	
	// Convert array list to type Object[][] memberDetails in order to use it as parameter to the constructor of GUIMemberHome
		public static Object[][] convertArrayListToObject(ArrayList<Speaker> speakers)
		{
			Object[][] memberDetails = new Object[speakers.size()][];
			for (int i = 0; i < speakers.size(); i++)
			{
				memberDetails[i] = speakers.get(i).toObjectArray();
			}
			return memberDetails;
		}
		
		// Method to convert an object to object array
		public Object[] toObjectArray() 
		{
		    return new Object[] { this.getSpeakerId(), this.getSpeakerName(), this.getFieldOfExpertise(), this.getSpeakerType()};
		}
}

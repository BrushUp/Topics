public class Speaker 
{
	private int SpeakerId = 0;
	private String speakerName;
	private FieldOfExpertise fieldOfExpertise;
	private Presentation presentationTopic;
	private SpeakerType type;
	
	public Speaker(String speakerName, FieldOfExpertise field, SpeakerType type)
	{
		this.SpeakerId ++;
		this.speakerName = speakerName;
		this.fieldOfExpertise = field;
		this.type = type;
	}
	
	public String getSpeakerName()
	{
		return this.speakerName;
	}
	
	public FieldOfExpertise getFieldOfExpertise()
	{
		return this.fieldOfExpertise;
	}
	
	public Presentation getTopic()
	{
		return this.presentationTopic;
	}
	
	public SpeakerType getSpeakerType()
	{
		return this.type;
	}
	
	public int getRate()
	{
		return this.type.rate;
	}
	
	public int getSpeakerId()
	{
		return this.SpeakerId;
	}
}

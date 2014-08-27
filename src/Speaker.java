public class Speaker 
{
	private int SpeakerId = 0;
	private String speakerName;
	private FieldOfExpertise fieldOfExpertise;
	private Appointment appointment;
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
	
	public Appointment getAppointment()
	{
		return this.appointment;
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

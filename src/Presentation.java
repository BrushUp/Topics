
public class Presentation
{
	private String topic;
	private Speaker speaker;
	
	public Presentation(String topic, Speaker speaker)
	{
		this.topic = topic;
		this.speaker = speaker;
	}
	
	public String getTopic()
	{
		return this.topic;
	}
	
	public Speaker getSpeaker()
	{
		return this.speaker;
	}
}

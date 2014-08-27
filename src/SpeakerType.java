
public enum SpeakerType
{
	Premium(10000), Medium(5000), Normal(3000);
	public int rate;
	private SpeakerType(int rate)
	{
		this.rate = rate;
	}
}

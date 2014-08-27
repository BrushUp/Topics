import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;;


public class Appointment
{
	private Speaker speaker;
	private String topic;
	private String location;
	private Calendar eventDate;
	private Time startTime;
	private double duration;
	private double commision;
	
	public Appointment(Speaker speaker, String topic, String location, Calendar eventDate, Time startTime, double duration)
	{
		this.speaker = speaker;
		this.topic = topic;
		this.location = location;
		this.eventDate = eventDate;
		this.startTime = startTime;
		this.duration = duration;
	}
	
	public Speaker getSpeaker()
	{
		return this.speaker;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	
	public Calendar getEventDate()
	{
		return this.eventDate;
	}
	
	public Time getStartTime()
	{
		return this.startTime;
	}
	
	public double getDuration()
	{
		return this.duration;
	}
	
	public double calculateCommission()
	{
		this.commision = 0;
		this.commision = this.speaker.getRate() * this.duration;
		int dayOfWeek = this.getDayOfWeek(this.eventDate);
		if(dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY)
		{
			this.commision = this.commision * 1.25;
		}
		// add transportation fee of 500 kr
		this.commision += 500;
		return this.commision;		
	}
	
	public int getDayOfWeek(Calendar date)
	{
		Calendar calendar = Calendar.getInstance();
	    int i=calendar.get(Calendar.DAY_OF_WEEK);
	    return i;
	}
	
}

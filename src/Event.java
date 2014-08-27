import java.sql.Time;
import java.util.Calendar;;


public class Event
{
	private Presentation presentation;
	private String location;
	private Calendar eventDate;
	private Time startTime;
	private double duration;
	
	public Event(Presentation presentation, String location, Calendar eventDate, Time startTime, double duration)
	{
		this.presentation = presentation;
		this.location = location;
		this.eventDate = eventDate;
		this.startTime = startTime;
		this.duration = duration;
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
	
	public int getDayOfWeek(Calendar date)
	{
		Calendar calendar = Calendar.getInstance();
	    int i=calendar.get(Calendar.DAY_OF_WEEK);
	    return i;
	}
	
}

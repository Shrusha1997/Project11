package Interface;

public class Fan implements Switch
{
public void on()
{
	System.out.println("Fan gets on");
}
public void off()
{
	System.out.println("Fan gets off");
}
}

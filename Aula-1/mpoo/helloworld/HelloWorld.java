package mpoo.helloworld;
import java.util.Calendar;

public class HelloWorld {
	private String nome;
	private int hour;
	private int minute;
	private int sec;
	Calendar time;
	String currentTime;
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return nome;
	}
	
	public void print() {
		time = Calendar.getInstance();
		hour = time.get(Calendar.HOUR_OF_DAY);
		minute = time.get(Calendar.MINUTE);
		sec = time.get(Calendar.SECOND);
		currentTime = String.format("%02d:%02d:%02d", hour, minute, sec);
		System.out.println(currentTime + " - Hello " + this.getName() +". You just finished your first Hello World in Java language. Congratulations." );
	}
	
}
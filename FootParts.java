import java.util.Random;
public class FootParts{
	private int speed;
	Random rnd = new Random();

	public FootParts(int speed){
		this.speed = speed;
	}

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int speed){
		this.speed = rnd.nextInt(10);
	}

	public String getInfo(){
		return "FootParts(speed=" + speed + ")";
	}
}


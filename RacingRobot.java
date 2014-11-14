import java.util.Random;
public class RacingRobot{
	private int id;
	private static int maxId;
	private String name;
	private int distance;
	private int energy;
	private int speed;

	public RacingRobot(int id, String name, int distance, int energy, int speed){
		this.id = id;
		maxId = id;
		this.name = name;
		this.distance = distance;
		this.energy = energy;
		this.speed = speed;
	}

	public RacingRobot(String name){
		this(++maxId, name, 0, 100,new Random().nextInt(50)+50);
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getDistance(){
		return distance;
	}

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getEnergy(){
		return energy;
	}

	public void setEnergy(int energy){
		this.energy = energy;
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}	

	
	public String getInfo(){
		return String.format("Robot(id=%d, name=%s, energy=%d, distance=%d, footparts(speed=%d))", id, name, energy, distance, speed);
	}
}

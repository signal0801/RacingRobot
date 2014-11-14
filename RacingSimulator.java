import java.util.Random;
public class RacingSimulator{

	public static void main(String[] args){
		RacingRobot[] robotArray = new RacingRobot[6];
		String[] robotNameArray = {"Daikon", "Konnyaku", "Tikuwabu", "Ganmo", "hanpen", "Shirataki"};

		for(int i=0; i<3; i++){
			robotArray[i] = new RacingRobot(i+1, robotNameArray[i] ,0,100,new Random().nextInt(50)+50);
		}

		for(int i=0; i<3; i++){
			robotArray[i+3] = new RacingRobot(robotNameArray[i+3]);
		}

		for(int i=0; i<6; i++){
			System.out.println(robotArray[i].getInfo());
		}

	}
}

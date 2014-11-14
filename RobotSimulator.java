public class RobotSimulator{

	public static void main(String[] args){
		Robot[] robotArray = new Robot[6];
		String[] robotNameArray = {"Daikon", "Konnyaku", "Tikuwabu", "Ganmo", "hanpen", "Shirataki"};

		for(int i=0; i<3; i++){
			robotArray[i] = new Robot(i+1, robotNameArray[i] ,0,100);
		}

		for(int i=0; i<3; i++){
			robotArray[i+3] = new Robot(robotNameArray[i+3]);
		}

		for(int i=0; i<6; i++){
			System.out.println(robotArray[i].getInfo());
		}

	}
}

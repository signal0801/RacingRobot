import java.util.Random;

public class RobotSimulator{
	private Robot[] robotArray;
	private String[] robotNameArray = {"Daikon","Shirataki","Ganmo", "Chikuwa", "Konnyaku", "Konbu"};

	public RobotSimulator(){

		register();

		printRobotInfo();

		System.out.println("レース開始！");
		for(int i=0; i<5; i++){
			for(int j=0; j<6; j++){
				((RacingRobot)robotArray[j]).run();
			}
			
		}
		System.out.println("レース終了");

		printRobotInfo();
	}

	public void register(){
		robotArray = new Robot[6];
		Random random = new Random();


			for(int i=0; i<6; i++){
				robotArray[i] = new RacingRobot(robotNameArray[i], random.nextInt(10)+1);
			}
		}

		public void printRobotInfo(){
			System.out.println("-----ロボット情報-----");
			for(int i=0; i<6; i++){
				System.out.println(robotArray[i].getInfo());
			}
			System.out.println("-----------------");
		}

		public static void main(String[] args){
			new RobotSimulator();
		}
}
	



		

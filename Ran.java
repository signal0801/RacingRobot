import java.util.Random;
class Ran{
	public static void main(String[] args)
	{
		Random rnd = new Random();

		int ran = rnd.nextInt(50) + 50;
		System.out.println(ran);
		}
}

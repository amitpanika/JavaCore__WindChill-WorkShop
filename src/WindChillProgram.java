import java.util.Scanner;

public class WindChillProgram {

	public static void main(String[] args) {

		try {
			double t = Double.parseDouble(args[0]);
			double v = Double.parseDouble(args[1]);
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

			System.out.println("Temprature =" + t);
			System.out.println("velocity =" + v);
			System.out.println("Wind =" + w);

		} catch (Exception e) {

			System.out.println(e);
			System.out.println("i got in range ");

		}
	}

}

import java.util.Scanner;
public class PICalculator{

  
  public static void main(String[] args) {
    PICalculator test = new PICalculator();
    System.out.println("podaj z jaką dokładnością  chciałbyś obliczyć liczbę PI");
    Scanner sc  = new Scanner(System.in);
    int ac = sc.nextInt();
    System.out.print("Liczba PI z dokładnością " + ac + " wynosi: ");
		System.out.println(test.leibnizPi(-ac));
	}
	
	public double leibnizPi(int accuracy) {
		double target_accuracy = Math.pow(10, accuracy);
		
		double acc = 1.0;
		int sub = 3;
		int sign = -1;
		
		while ( Math.abs(4.0 * acc - Math.PI) > target_accuracy ) {
			acc += sign * ( 1.0 / sub );
			sign *= -1;
			sub += 2;
		}
		
		return 4.0 * acc;
	}
}
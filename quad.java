import java.util.*;

public class Main{
	public static ArrayList<Double> quadratic(double a, double b, double c){
		ArrayList<Double> s = new ArrayList<>();
		if (b * b < 4 *a *c) return s;
		else if (b *b == 4 *a *c){
			double r = 2 * a;
			double t = 0 - b;
			double n = r / t;
			s.add(n);
			return s;
		}
		else{
			double r = 2 * a;
			double t = 0 - b;
			double n = b * b;
			double h = 4 *a * c;
			n -= h;
			n = Math.sqrt(n);
			double fi = (t + n) / r;
			double se = (t - n) / r;
			s.add(fi);
			s.add(se);
			return s;
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		if(a == 0){
			System.out.print("a cannot be equal to 0!);
			System.exit(0);
		}			 
		ArrayList<Double> x = quadratic(a, b, c);
		if (x.isEmpty()) System.out.print("IMAGINARY SOLUTIONS ARE NOT SUPPORTED!!!");
		else{
			for (int i = 0; i < x.size(); i++){
				System.out.print(x.get(i));
				if (i != x.size() - 1) System.out.print(" or ");
			}
		}
	}
}

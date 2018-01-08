package ballTypes;

import java.util.Comparator;

public class RationalDescending implements Comparator<Rational> {
	@Override
	public int compare(Rational r1, Rational r2) {
		System.out.println(r1.tFraction + "/" + r1.bFraction);
		System.out.println(r2.tFraction + "/" + r2.bFraction);
		
		int compare = (int) ((r2.tFraction * r1.bFraction) - (r1.tFraction * r2.bFraction));
		System.out.println(compare);
		return compare;
	}
}

package ballTypes;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String args[]) {
		//print out the various details of the balls
		System.out.println("**********PART ONE**********\n");
		System.out.println(Ball.BASEBALL);
		System.out.println(Ball.BASKETBALL);
		System.out.println(Ball.FOOTBALL);
		System.out.println(Ball.GOLF);
		System.out.println(Ball.POOL);
		System.out.println(Ball.SOFTBALL);
		System.out.println(Ball.TENNIS);
		System.out.println(Ball.VOLLEYBALL);
		
		//print out the circumference of a golf ball
		//print out the volume of a baseball
		System.out.println("\n**********PART TWO**********\n");
		System.out.println(Ball.GOLF.getCircumference());
		System.out.println(Ball.BASEBALL.getVolume());

		//create the four rational objects
		System.out.println("\n**********PART THREE**********\n");
		Rational r1 = new Rational(Ball.BASEBALL.getWeight(), Ball.BASKETBALL.getWeight());
		Rational r2 = new Rational(Ball.FOOTBALL.getWeight(), Ball.GOLF.getWeight());
		Rational r3 = new Rational(Ball.POOL.getDiameter(), Ball.SOFTBALL.getDiameter());
		Rational r4 = new Rational(Ball.TENNIS.getDiameter(), Ball.VOLLEYBALL.getDiameter());
		
		Rational r5 = new Rational(2,3);
		Rational r6 = new Rational(3,4);
		//pass in the values to get the desired output
		System.out.println(r1.simplify(15, 40));
		System.out.println(r1.plus(r1, r2));
		System.out.println(r1.minus(r2, r3));
		System.out.println(r1.multiply(r3, r4));
		System.out.println(r1.divide(r4, r1));
		System.out.println(r5.add(r6));
		ArrayList<Rational> list = new ArrayList<Rational>();
		list.add(r5);
		list.add(r6);
		list.add(new Rational(6,24));
		list.add(new Rational(14,20));
		System.out.println("\n\n\n\n");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n\n\n\n");
		//Collections.sort(list, new RationalDescending());
		Collections.sort(list);
		System.out.println("\n\n\n\n");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<Rational> list2 = new ArrayList<Rational>();
		list2.add(r5);
		list2.add(r6);
		list2.add(new Rational(6,24));
		list2.add(new Rational(14,20));
		System.out.println("\n\n\n\n");
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("\n\n\n\n");
		Collections.sort(list2, new RationalDescending());
		//Collections.sort(list);
		System.out.println("\n\n\n\n");
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}
}

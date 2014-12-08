package day01;

import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		test();
		System.out.println("*********");
	}

	private static void test() {
		int n=new Random().nextInt(10);
		System.out.println(n);
		int[] r=new int[n];
		for (int i = 0; i < r.length; i++) {
			r[i]=new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(r));
	}
}

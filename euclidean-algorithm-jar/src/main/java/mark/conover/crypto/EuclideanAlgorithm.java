package mark.conover.crypto;

import java.util.Scanner;

/**
 * Determines greatest common divisor (gcd) for two integers using Euclidean's
 * algorithm.
 * 
 * @author http://introcs.cs.princeton.edu/java/23recursion/Euclid.java
 * 
 *******************************************************************************
 *         Compilation: javac Euclid.java Execution: java Euclid p q
 * 
 *         Reads two command-line arguments p and q and computes the greatest
 *         common divisor of p and q using Euclid's algorithm.
 *
 *         Remarks ----------- - may return the negative of the gcd if p is
 *         negative
 *
 *******************************************************************************
 **/
public class EuclideanAlgorithm {
	
	public static void main(String[] args) {
//		int p = Integer.parseInt(args[0]);
//		int q = Integer.parseInt(args[1]);
		
		Scanner scan = new Scanner(System.in);
		
		/** Accept two integers **/
		System.out.println("Enter two integer numbers\n");
		int p = scan.nextInt();
		int q = scan.nextInt();
		
		int d = gcd(p, q);
		int d2 = gcd2(p, q);
		System.out.println("gcd(" + p + ", " + q + ") = " + d);
		System.out.println("gcd(" + p + ", " + q + ") = " + d2);
	}

	// recursive implementation
	public static int gcd(int p, int q) {
		if (q == 0) {
			return p;
		} else {
			return gcd(q, p % q);
		}
	}

	// non-recursive implementation
	public static int gcd2(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}
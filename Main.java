import java.util.Scanner;
// Recursion hurts my brain
public class Main {
	public static void towerOfHanoi(int n, int source, int inter, int dest)
    {
        if (n == 1)
        {
            System.out.println("From " + source + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, source, dest, inter);
        System.out.println("From " + source + " to " + dest);
        towerOfHanoi(n-1, inter, source, dest);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of disks: ");
		int disks = sc.nextInt();
		sc.close();
		long start = System.currentTimeMillis();
		towerOfHanoi(disks, 1, 2, 3);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		// 1 disk = 1 move, 2 disks = 3 moves, 3 disks = 7 moves... moves = 2^(disks - 1)
		// A 64-disk game will take roughly 316887 years for a program that makes 1000 moves per second
	}
}

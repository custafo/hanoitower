import java.util.*;

public class bhramastower {

    public static int[][] towers;
    public static int poles = 3;
    public static int disks;
    public static int moves = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's the number of the disks?: ");
        disks = in.nextInt();

        towers = new int[disks][poles];

        for (int disk = 0; disk < disks; disk++) {
            towers[disk][0] = (disk * 2) + 1;
        }

    }
    public static void moveDisks(int numDisks, int startPole, int endPole){
        
    }
}

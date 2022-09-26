// this is an attempt to create a tower of hanoi of three disks using java

public class hanoitower{
    public static void main(String[] args){
        int disks = 3;
        hanoi(disks, 'A', 'B', 'C');
    }
    private static void hanoi(int disks, char origin, char destiny, char helper){
        if(disks > 0){
            hanoi(disks - 1, origin, destiny, helper); // moving a disk from origin to helper
            System.out.printf("Move from %s to %s\n", origin, destiny); // moving a disk from origin to destiny
            hanoi(disks - 1, helper, origin, destiny); // moving a disk from helper to destiny
        }
    }
}
// this is another attempt to create a tower of hanoi, but this time, using stack

import java.util.Stack;

public class towerofhanoi{
    public static void main(String[] args){

        Stack<Integer> origin = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        origin.push(3);
        origin.push(2);
        origin.push(1);

        hanohano(origin.size(), origin, destination, helper);
    }

    public static void hanohano(int n, Stack<Integer> origin, Stack<Integer> destination, Stack<Integer> helper){

        if(n > 0){
            hanohano(n - 1, origin, destination, helper);
            destination.push(origin.pop());
            System.out.println("-----------------");
            System.out.println("Original: " +origin);
            System.out.println("Destation: " +destination);
            System.out.println("Helper: " +helper);
            hanohano(n - 1, helper, destination, origin);

        }
    }
}

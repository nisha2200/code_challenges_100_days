package code_challenges_100_days;
//Write a program to implement the Tower of Hanoi
public class day_38 {
//    Recursive function to solve tower of hanoi
    public static void solveHanoi(int n , char source , char auxiliary , char destination){
//        base case: only one disk
        if (n==1){
            System.out.println("move disk 1 from "+ source +" to "+destination);
            return;
        }
//        move n-1 disks from source to auxiliary
        solveHanoi(n-1 , source , destination ,auxiliary);
//        move the nth disk from source to destination
        System.out.println("move disk "+n + " from "+ source +" to "+destination);
//        move n-1 disks from auxiliary to destination
          solveHanoi(n-1, auxiliary , source , destination);
    }
    public static void main(String[] args) {
        int numberofDisks = 3;
        solveHanoi(numberofDisks , 'A','B','C');
    }
}

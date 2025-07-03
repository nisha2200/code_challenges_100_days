package code_challenges_100_days;

import java.util.Stack;

//Create a stack and perform push/pop operation
public class day_67 {
    public static void main(String[] args) {
//        create a stack
        Stack<Integer> stack = new Stack<>();
//        push element onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Stack after pushing elements: "+stack);

//        pop element from the stack
        int poppedElement  = stack.pop();
        System.out.println("Popped element: "+poppedElement);
        System.out.println("stack after popping an element: "+stack);
//        peek(to see the top element)
        int topelement = stack.peek();
        System.out.println("Top element: "+topelement);
    }
}

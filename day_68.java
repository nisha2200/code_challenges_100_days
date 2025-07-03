package code_challenges_100_days;

import java.util.Queue;

//Create a queue using linkedlist and perform basic operations
public class day_68 {
//    class node
static class Node{
      int data;
      Node next;
      public  Node(int data){
          this.data = data;
          this.next = null;
      }
  }
//  queue class using linked list
static class Queue{
      Node front , rear;
//      constructor
    public Queue(){
        this.front  =this.rear = null;
    }
//    Enqueue(add element to the error)
    void enqueue(int data){
        Node newNode = new Node(data);
//        if queue is empty
        if (rear == null){
            front = rear=newNode;
            return;
        }
//        add new node at the end
        rear.next = newNode;
        rear = newNode;
    }
//    Dequeue (remove element from the front)
    int dequeue(){
        if (front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
//        if queue becomes empty
        if (front == null){
            rear = null;
        }
        return value;
    }
//    display queue elements
    void display(){
        if (front == null){
            System.out.println("queue is empty.");
            return;
        }
        Node temp = front;
        System.out.println("queue: ");
        while (temp != null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

    public void main(String[] args) {
      Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        int removed = queue.dequeue();
        System.out.println("dequeued element: "+removed);
        queue.display();

    }
}

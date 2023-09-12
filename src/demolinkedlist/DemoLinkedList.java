package demolinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

//constructor
class Node {
    int data;
    Node next;
    
    Node(int m){
        //storage area or stock room
        data = m;
        next = null;
    }
}

public class DemoLinkedList {

    public static Node head;
    
    public Node insertNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    public void display(){
        Node node = head;
        
        while (node != null) {            
            System.out.println(node.data + ",");
            node = node.next;
        }
        
        System.out.println();
    }
    
    public void delete(){
        if (head == null) {
            System.out.println("List is empty");
        } else{
            System.out.println("Deleted =" + head.data);
            head = head.next;
        }
    }
    
    public boolean search(int target){
        Node current = head;
        
        while (current != null) {            
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public int searchPosition(int target){
        Node current = head;
        int position = 0;
        
        while (current != null) {            
            if (current.data == target) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }
    
    public static void main(String args[]) {
        DemoLinkedList listssss = new DemoLinkedList();

        listssss.insertNode(1000);
        listssss.insertNode(2000);
        listssss.insertNode(3000);
        listssss.insertNode(666);
        listssss.display();
        
        System.out.println("==============================");
        System.out.println("==============================");
       
       
        int targetVal = 2000;
        
        int pos = listssss.searchPosition(targetVal);
        
        if (pos != -1) {
            System.out.println(targetVal + " Naa sa " + pos);
        } else {
            System.out.println("Ang "+ targetVal + " kay wala diria");
        }
        
        
    }
}

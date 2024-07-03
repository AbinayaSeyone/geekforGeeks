package chooseFairy;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main( String[] args )
    {

        Solution4 test1=new Solution4();
        test1.lastFairyStanding( 5,2 );
//        linkedlist now=new linkedlist();
//        Node node1=new Node( 1 );
//        Node node2=new Node( 2 );
//        Node node3=new Node( 3 );
//        Node node4=new Node( 4);
//        Node node5=new Node( 5 );
//
//        now.add(node1);
//        now.add(node2);
//        now.add(node3);
//        now.add(node4);
//        now.add(node5);
//
//        now.delete( 2 ,node1);
//        now.delete( 2 ,node3);
//
//        ArrayList<Integer> test=new ArrayList<>();
//        test=now.print();
//
//        for (int number:test)
//        {
//            System.out.println( "Fairy : " + number );
//        }
    }
}


class Node{
    int value;
    Node next;

    public Node(int value){
        this.value=value;
        this.next=null;
    }
}
class linkedlist{
    Node front;
    Node rear;
    ArrayList<Integer> numbers = new ArrayList<>();
    public void add(Node node){
        if(front==null){
            this.front=node;
            this.rear=node;
        }
        else{
            this.rear.next=node;
            this.rear=node;
            this.rear.next=this.front;
        }

    }
    public  ArrayList<Integer> print(){
        Node printNode=front;


        while(printNode.next!=front){
            System.out.println(printNode.value);
            numbers.add( printNode.value);
            printNode=printNode.next;

        }
        System.out.println(printNode.value);
        numbers.add( printNode.value );
        return numbers;
    }
    public void delete(int k,Node node){
        Node firstNode=node;
        Node nodeBeforeDelete=firstNode;
        for(int i=1;i<k-1;i++){
            nodeBeforeDelete=nodeBeforeDelete.next;
        }

        // for(int i=1;i<k;i++){
        //     nodeToBeDelete=nodeToBeDelete.next;
        // }

        nodeBeforeDelete.next=nodeBeforeDelete.next.next;
        nodeBeforeDelete=nodeBeforeDelete.next;

    }
}

class Solution4{
    public int lastFairyStanding(int n, int k) {
        // code here

        linkedlist newList=new linkedlist();
        int i;
        for(i=1;i<=n;i++){
            Node nodei=new Node(i);
            newList.add(nodei);
        }
        Node firstNode=newList.front;
        Node nodeBeforeDelete=firstNode;
        for(int j=1;j<=n-1;j++){

            for(int l=1;l<k-1;l++){
                nodeBeforeDelete=nodeBeforeDelete.next;
            }

            if(nodeBeforeDelete==newList.rear){
                newList.front=nodeBeforeDelete.next.next;
            }
            nodeBeforeDelete.next=nodeBeforeDelete.next.next;
            nodeBeforeDelete=nodeBeforeDelete.next;
        }

        ArrayList<Integer> fairies=new ArrayList<>();
        fairies=newList.print();

        for (int number : fairies)
        {
            System.out.println( "Fairy : " + number );
        }

//        System.out.println(fairies.size());

        return fairies.get( 0 );
    }


    }






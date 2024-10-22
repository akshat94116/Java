package com.thealgorithms.datastructures.lists;

public class alloperationsinlinkedlist
{
public static class Node
{
    int data;
    Node next;

}
public static class LinkedList
{
    int size;
    Node head,tail;

void addLast(int val)
{
    Node node = new Node();
    node.data=val;
    if(this.size==0)
    {
        this.head=this.tail=node;

    }
    else
    {
        this.tail.next=node;
        this.tail=node;
    }
    this.size++;
}
void display()
{
    Node temp=this.head;
    while(temp!=null)
    {
        System.out.println(temp.data+" - > ");
        temp=temp.next;
    }
}
public void removeFirst()
{
    if(this.size==0)
    {
        System.out.println("EMpty Linked list");
        return;
    }
    else if(this.size==1)
    {
        this.head=this.tail=null;
    }
    else{
        
    
    Node nbr=this.head.next;
    this.head.next=null;
    this.head=nbr;
    }
    this.size--;
}

public int getfirst()
{
    if(this.size==0)
    {
        System.out.println("Empty List");
        return -1;
    }
    return this.head.data;
}
public int getLast()
{
    if(this.size==0)
    {
        System.out.println("Empty List");
        return -1;
    }
    return this.tail.data;
}
public int getAt(int idx)
{
    if(this.size==0)
    {
        System.out.println("Empty List");
        return -1;
    }
    if(idx<0 || idx>=this.size)
    {
        System.out.println("Invalid");
        return -1;
    }
    Node temp=head;
    while(idx>0)
    {
        temp=temp.next;
        idx--;
    }
    return temp.data;
}
}
public static void main(String as[])
{
    LinkedList l1=new LinkedList();
    l1.addLast(10);
    l1.addLast(20);
    l1.addLast(30);
    l1.addLast(40);
    l1.addLast(50);
    l1.addLast(60);
    l1.addLast(70);
    l1.display();  
    l1.removeFirst();
    l1.display(); 
    System.out.println(l1.getfirst());
    System.out.println(l1.getLast());
    System.out.println(l1.getAt(4));
}
}

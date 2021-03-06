package com.uccases;

public class MyLinkedList<K> {
    public  INode head;
    public  INode tail;

    public MyLinkedList() {
        this.head = null ;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(tail==null)
            tail=newNode;
        if(head==null)
            head=newNode;
        else{
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode myNode){
       if(this.head == null)
        this.tail = myNode;
       if(this.tail == null)
           this.tail = myNode;
       else{
           this.tail.setNext(myNode);
           this.tail = myNode;
       }

    }
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode =head;
        while(tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void insert(INode myNode,INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
     public INode pop(){
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
     }

    public INode poplast() {
        INode tempNode = head;
        while(!tempNode.getNext().equals((tail))){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public INode search(K key){
        INode tempNode = this.head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    public <K> INode delete(K key) {
        INode<K> tempNode = this.head;
        while (tempNode.getNext().getKey()!= key ){
            tempNode = tempNode.getNext();
        }
        INode deleteNode = tempNode.getNext();
        tempNode.setNext(tempNode.getNext().getNext());
        return deleteNode;
    }
}

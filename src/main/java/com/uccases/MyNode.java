package com.uccases;

public class MyNode<K> implements INode<K>{
    private INode next;
    private K key;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}

package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3Number_WhenLinkedShouldPassed_LinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> mythirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(mythirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                myFirstNode.getNext().getNext().equals(mythirdNode);
        Assert.assertTrue(result);
    }
}

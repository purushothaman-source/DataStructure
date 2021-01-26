package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3Number_WhenAddedToLinkedList_ShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> mythirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(mythirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mythirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode);
                         myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}

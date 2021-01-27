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

    @Test
    public void given3NumberWhenAppendedShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> mythirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(mythirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(mythirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> mythirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mythirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(mythirdNode);
        Assert.assertTrue(result);

    }

    @Test
    public void given3numberWhenDeletedShouldPassLinkedListResults() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> mythirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(mythirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.tail.equals(mythirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numberWhenlastDeletedShouldPassLinkedListResults() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> mythirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(mythirdNode);
        myLinkedList.poplast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3number_SearchNode_ShouldPassLinkedListResults() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> mythirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(mythirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.search(56);
        Assert.assertTrue(result);
    }
}

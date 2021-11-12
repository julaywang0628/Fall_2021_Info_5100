package com.Northeastern.Zhilei;

import java.util.LinkedList;


public class ThreadSafeLinkedList<T>{
    public LinkedList<T> list;
    public static Object obj;
    public ThreadSafeLinkedList(){
        list = new LinkedList<>();
        obj = new Object();
    }

    public void addAtPosition(int index, T element){
        synchronized (obj) {
            if(index > list.size()) {
                return;
            }
            list.add(index, element);
        }
    }

    public void removeAtPosition(int index){
        synchronized (obj) {
            if(index < 0 || index >= list.size()) {
                return;
            }
            list.remove(index);
        }

    }
    public T getFirst() {
        synchronized (obj) {
            return list.getFirst();
        }

    }

    public T getLast() {
        synchronized (obj) {
            return list.getLast();
        }
    }

    public int size(){
        synchronized (obj) {
            return list.size();
        }
    }

}


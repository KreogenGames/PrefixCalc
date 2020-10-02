package PrefCalc;

import java.util.ArrayList;

public class Queue {

    private Double[] queue;
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public Queue() {
        queue = new Double[100];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void insert(Double elem) {
        if (rear == queue.length - 1) {  // циклический перенос
            rear = -1;
        }

        queue[++rear] = elem;//увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди
    }

    public Double remove() {
        Double temp = queue[front++]; // получаем первый элемент из очереди

        if (front == queue.length) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;

    }

    public Double getFront() {
        return queue[front];
    }

    public Double getRear() {
        return queue[rear];
    }

    public boolean isFull() {
        return (nElem == queue.length - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }
}

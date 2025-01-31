package Model.DataStructures.Classes;

import Exceptions.DataStructureException;
import Exceptions.MyException;
import Model.DataStructures.Interfaces.MyIQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> implements MyIQueue<T> {
    private Queue<T> queue;
    public MyQueue(){
        this.queue=new LinkedList<>(){
        };
    }


    @Override
    public void add(T value) {
        queue.add(value);
    }

    @Override
    public T remove() throws MyException {
        if(isEmpty()){
            throw DataStructureException.data_structure_empty("Queue is empty");
        }
        return queue.remove();
    }

    @Override
    public T top() throws MyException {
        if (isEmpty()) {
            throw DataStructureException.data_structure_empty("Queue is empty");
        }
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (T item : queue) {
            result.append(item).append(" ");
        }
        return result.toString();

    }

//    public Queue<T> deepCopy(){
//        MyQueue<T> copy =new MyQueue<>();
//        for(T item : this.queue){
//            copy.add(item.deepcopy());
//        }
//    }
}

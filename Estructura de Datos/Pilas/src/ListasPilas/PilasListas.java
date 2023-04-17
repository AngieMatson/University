package ListasPilas;

import ArrayPilas.InterfacePilas;

import java.util.LinkedList;

public class PilasListas implements InterfacePilas {

    private final LinkedList<Object> list;
    private int size;

    public PilasListas() {
        list = new LinkedList<>();
    }

    @Override
    public void clear() {
        size = 0;
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return list.getLast();
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object object = list.getFirst();
        list.removeFirst();
        size--;
        return object;
    }

    @Override
    public boolean push(Object object) {
        list.addFirst(object);
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        boolean found = list.contains(object);
        System.out.println(found);
        return found;
    }

    @Override
    public void reverse() {
        LinkedList<Object> reversedList = new LinkedList<>();
        while (!isEmpty()) {
            reversedList.addLast(pop());
        }
        list.addAll(reversedList);
    }

    @Override
    public void sort() {
        PilasListas sortedStack = new PilasListas();
        while (!isEmpty()) {
            Object current = pop();
            while (!sortedStack.isEmpty() && ((Comparable) sortedStack.peek()).compareTo(current) > 0) {
                push(sortedStack.pop());
            }
            sortedStack.push(current);
        }
        list.clear();
        list.addAll(sortedStack.list);
    }

    @Override
    public String toString() {
        return "PilasListas{" +
                "size=" + size +
                ", list=" + list +
                '}';
    }
}

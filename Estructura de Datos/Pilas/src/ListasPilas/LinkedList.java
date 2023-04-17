package ListasPilas;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList<T> implements List<T> {

    private LinkedListNode head;
    private LinkedListNode tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public LinkedList(T object) {
        this.head = tail = new LinkedListNode(object);
    }

    @Override
    public boolean add(T object) {
        if (object == null) {
            return false;
        }
        if (isEmpty()) {
            head = new LinkedListNode(object);
            tail = head;
        } else {
            tail.next = new LinkedListNode(object);
            tail = tail.next;
        }
        return true;
    }

    @Override
    public boolean add(Node node, T object) {
        if (object == null || node == null) {
            return false;
        }
        LinkedListNode current = (LinkedListNode) node;
        LinkedListNode newNode = new LinkedListNode(object);
        if (current.next == null) {
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
        return true;
    }

    @Override
    public boolean add(Node node, Node next) {
        if (node == null || next == null) {
            return false;
        }
        LinkedListNode current = (LinkedListNode) node;
        LinkedListNode nextNode = (LinkedListNode) next;
        if (current.next == null) {
            current.next = nextNode;
            tail = nextNode;
        } else {
            nextNode.next = current.next;
            current.next = nextNode;
        }
        return true;
    }

    @Override
    public boolean add(T[] objects) {
        if (objects == null) {
            return false;
        }
        for (T object : objects) {
            if (object == null) {
                return false;
            }
            if (isEmpty()) {
                head = new LinkedListNode(object);
                tail = head;
            } else {
                tail.next = new LinkedListNode(object);
                tail = tail.next;
            }
        }
        return true;
    }

    @Override
    public boolean add(Node node, T[] objects) {
        if (node == null || objects == null) {
            return false;
        }
        LinkedListNode current = (LinkedListNode) node;
        for (T object : objects) {
            if (object == null) {
                return false;
            }
            LinkedListNode newNode = new LinkedListNode(object);
            if (current.next != null) {
                newNode.next = current.next;
                current.next = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                tail = newNode;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T get() {
        return null;
    }

    @Override
    public T get(Node node) {
        return null;
    }

    @Override
    public T getPrevious(Node node) {
        return null;
    }

    @Override
    public T getNext(Node node) {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T[] getFirst(int n) {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T[] getLast(int n) {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public boolean remove(T object) {
        return false;
    }

    @Override
    public boolean remove(Node node) {
        return false;
    }

    @Override
    public boolean removeAll(T[] objects) {
        return false;
    }

    @Override
    public boolean retainAll(T[] objects) {
        return false;
    }

    @Override
    public boolean set(Node node, T object) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List subList(Node from, Node to) {
        return null;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public boolean orderBy(char c) {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public Iterator<Node> iterator() {
        return null;
    }

    @Override
    public boolean addFirst(T object) {
        try {
            LinkedListNode<T> newNode = new LinkedListNode<>(object);
            newNode.setNext(head);
            head = newNode;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addFirst(T[] objects) {
        try {
            for (T object : objects) {
                LinkedListNode<T> newNode = new LinkedListNode<>(object);
                newNode.setNext(head);
                head = newNode;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addLast(T object) {
        try {
            LinkedListNode<T> newNode = new LinkedListNode<>(object);
            if (isEmpty()) {
                head = newNode;
            } else {
                tail.setNext(newNode);
            }
            tail = newNode;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addLast(T[] objects) {
        try {
            for (T object : objects) {
                LinkedListNode<T> newNode = new LinkedListNode<>(object);
                if (isEmpty()) {
                    head = newNode;
                } else {
                    tail.setNext(newNode);
                }
                tail = newNode;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean clear() {
        try {
            head = tail = null;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public linkedList<T> clone() {
        linkedList<T> clonedList = new linkedList<>();
        for (T object : this) {
            clonedList.addLast(object);
        }
        return clonedList;
    }

    @Override
    public boolean contains(T object) {
        try {
            Iterator<T> iterator = (Iterator<T>) iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(object)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean contains(T[] objects) {
        try {
            for (T object : objects) {
                if (!contains(object)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Node nodeOf(T object) {
        return null;
    }

    public class linkedList<T> implements List<T> {
        private LinkedListNode<T> head;
        private LinkedListNode<T> tail;

        public linkedList() {
            head = null;
            tail = null;
        }

        @Override
        public Node<T> nodeOf(T object) {
            LinkedListNode<T> currentNode = head;
            while (currentNode != null) {
                if (currentNode.getObject().equals(object)) {
                    return currentNode;
                }
                currentNode = currentNode.getNext();
            }
            return null;
        }

        @Override
        public boolean isEmpty() {
            return head == null;
        }

        @Override
        public T get() {
            if (tail != null) {
                return tail.getObject();
            }
            return null;
        }

        @Override
        public T get(Node node) {
            if (node != null) {
                return (T) node.getObject();
            }
            return null;
        }

        @Override
        public T getPrevious(Node node) {
            if (node != null && node.getPrevious() != null) {
                return (T) node.getPrevious().getObject();
            }
            return null;
        }

        @Override
        public T getNext(Node node) {
            if (node != null && node.getNext() != null) {
                return (T) node.getNext().getObject();
            }
            return null;
        }

        @Override
        public T getFirst() {
            if (head != null) {
                return head.getObject();
            }
            return null;
        }

        @Override
        public T[] getFirst(int n) {
            ArrayList<T> resultList = new ArrayList<>();
            LinkedListNode<T> currentNode = head;
            while (currentNode != null && resultList.size() < n) {
                resultList.add(currentNode.getObject());
                currentNode = currentNode.getNext();
            }
            T[] resultArray = (T[]) new Object[resultList.size()];
            resultList.toArray(resultArray);
            return resultArray;
        }

        @Override
        public T getLast() {
            if (tail != null) {
                return tail.getObject();
            }
            return null;
        }

        @Override
        public T[] getLast(int n) {
            ArrayList<T> resultList = new ArrayList<>();
            LinkedListNode<T> currentNode = tail;
            while (currentNode != null && resultList.size() < n) {
                resultList.add(0, currentNode.getObject());
                currentNode = currentNode.getPrevious();
            }
            T[] resultArray = (T[]) new Object[resultList.size()];
            resultList.toArray(resultArray);
            return resultArray;
        }

        @Override
        public T pop() {
            if (tail != null) {
                T poppedObject = tail.getObject();
                tail = tail.getPrevious();
                if (tail != null) {
                    tail.setNext(null);
                } else {
                    head = null;
                }
                return poppedObject;
            }
            return null;
        }

        @Override
        public boolean remove(T object) {
            LinkedListNode<T> currentNode = head;
            while (currentNode != null) {
                if (currentNode.getObject().equals(object)) {
                    if (currentNode == head) {
                        head = currentNode.getNext();
                        if (head != null) {
                            head.setPrevious(null);
                        } else {
                            tail = null;
                        }
                    } else if (currentNode == tail) {
                        tail = currentNode.getPrevious();
                        if (tail != null) {
                            tail.setNext(null);
                        } else {
                            head = null;
                        }
                    } else {
                        currentNode.getPrevious().setNext(currentNode.getNext());
                        currentNode.getNext().setPrevious(currentNode.getPrevious());
                    }
                    return true;
                }

            }
        }
    }
}


package ListasDoblesEnlazadas;

import ListasEnlazadas.Interfaces.LinkedListNode;

import java.util.Iterator;

public abstract class LinkedListDoble<T> implements List<T>{

    public LinkedListNodeDoble head;
    public LinkedListNodeDoble tail;
    private LinkedListNode<Object> previous;


    public LinkedListDoble(){
        this.head = null;
        this.tail = null;
    }

    public LinkedListDoble(T object){
        this.head = tail = new LinkedListNodeDoble(object);
    }

    @Override
    public boolean add(T object) {
        boolean bool = false;
        try {
            if (object != null) {
                if (isEmpty()) {
                    head = tail = new LinkedListNodeDoble(object);
                } else {
                    tail.next = new LinkedListNodeDoble(object);
                    tail.next.prev = tail;
                    tail = tail.next;
                }
                bool = true;
            }
            return bool;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean add(Node node, T object) {
        boolean bool= false;
        try {
            LinkedListNodeDoble<T> nodo = (LinkedListNodeDoble<T>) node;
            LinkedListNodeDoble<T> nodoNuevo = new LinkedListNodeDoble<>(object);
            if (nodo.next == null) {
                nodo.next = nodoNuevo;
                nodoNuevo.prev = nodo;
                tail = nodoNuevo;
            } else {
                nodoNuevo.next = nodo.next;
                nodoNuevo.prev = nodo;
                nodo.next.prev = nodoNuevo;
                nodo.next = nodoNuevo;
            }
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return bool;
    }

    @Override
    public boolean add(Node node, Node next) {
        boolean bool     = false;
        try {
            LinkedListNodeDoble<T> nodo = (LinkedListNodeDoble<T>) node;
            LinkedListNodeDoble<T> nodoNuevo = (LinkedListNodeDoble<T>) next;
            if (nodo.next == null) {
                nodo.next = nodoNuevo;
                nodoNuevo.prev = nodo;
                tail = nodoNuevo;
            } else {
                nodoNuevo.next = nodo.next;
                nodoNuevo.prev = nodo;
                nodo.next.prev = nodoNuevo;
                nodo.next = nodoNuevo;
            }
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return bool;
    }

    @Override
    public boolean add(T[] objects) {
        boolean bool = false;
        try {
            for (T object : objects) {
                if (isEmpty()) {
                    head = tail = new LinkedListNodeDoble(object);
                } else {
                    tail.next = new LinkedListNodeDoble(object);
                    tail.next.prev = tail;
                    tail = tail.next;
                }
            }
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return bool;
    }

    @Override
    public boolean add(Node node, T[] objects) {
        boolean bool = false;
        try {
            LinkedListNodeDoble<T> nodo = (LinkedListNodeDoble<T>) node;
            if (nodo.next != null) {
                for (T object : objects) {
                    LinkedListNodeDoble<T> nodoNuevo = new LinkedListNodeDoble<>(object);
                    nodoNuevo.next = nodo.next;
                    nodoNuevo.prev = nodo;
                    nodo.next.prev = nodoNuevo;
                    nodo.next = nodoNuevo;
                }
                bool = true;
            }
        } catch (ClassCastException e) {
            System.err.println("Error: el nodo no es compatible con la lista enlazada.");
        }
        return bool;
    }

    @Override
    public boolean addFirst(T object) {
        boolean bool = false;
        try{
            LinkedListNodeDoble nodoNuevo = new LinkedListNodeDoble(object);
            if (head == null) {
                head = nodoNuevo;
                tail = nodoNuevo;
            } else {
                nodoNuevo.next = head;
                head.prev = nodoNuevo;
                head = nodoNuevo;
            }
            bool = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return bool;
        }
    }
    @Override
    public boolean addFirst(T[] objects) {
        boolean bool = false;
        try{
            for (T object : objects) {
                LinkedListNodeDoble nodoNuevo = new LinkedListNodeDoble(object);
                if (head == null) {
                    head = nodoNuevo;
                    tail = nodoNuevo;
                } else {
                    nodoNuevo.next = head;
                    head.prev = nodoNuevo;
                    head = nodoNuevo;
                }
            }
            bool = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return bool;
        }
    }

    @Override
    public boolean addLast(T object) {
        boolean bool = false;
        try{
            LinkedListNodeDoble nodoNuevo = new LinkedListNodeDoble(object);
            if (tail == null) {
                head = nodoNuevo;
                tail = nodoNuevo;
            } else {
                tail.next = nodoNuevo;
                nodoNuevo.prev = tail;
                tail = nodoNuevo;
            }
            bool = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return bool;
        }
    }

    @Override
    public boolean addLast(T[] objects) {
        boolean bool = false;
        try{
            for (T object : objects) {
                LinkedListNodeDoble nodoNuevo = new LinkedListNodeDoble(object);
                if (tail == null) {
                    head = nodoNuevo;
                    tail = nodoNuevo;
                } else {
                    tail.next = nodoNuevo;
                    nodoNuevo.prev = tail;
                    tail = nodoNuevo;
                }
            }
            bool = true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return bool;
        }
    }

    @Override
    public boolean clear() {
        boolean bool = false;
        try{
            head = tail = null;
            bool = true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public List clone() {
        Iterator<Node> iterator = iterator();
        LinkedListNodeDoble clone = new LinkedListNodeDoble<>();
        while(iterator.hasNext()){
            LinkedListNodeDoble nodoTemp = (LinkedListNodeDoble) iterator.next();
            clone.wait(nodoTemp.getObject());
        }
        return clone();
    }

    @Override
    public boolean contains(T object) {
        boolean bool = false;
        try{
            Iterator iterator = iterator();
            while(iterator.hasNext()){
                LinkedListNodeDoble nodo = (LinkedListNodeDoble) iterator.next();
                if(nodo.getObject().equals(object)){
                    bool = true;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean contains(T[] objects) {
        boolean bool = true;
        try{
            int i = 0;
            Iterator iterator = iterator();
            for (T object : objects) {
                while(iterator.hasNext()){
                    LinkedListNodeDoble nodo = (LinkedListNodeDoble) iterator.next();
                    if(!(nodo.getObject().equals(object))){
                        bool = false;
                        break;
                    }
                }
                if(!bool){break;}
                i++;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        } finally {
            return bool;
        }

    }

    @Override
    public Node nodeOf(T object) {
        LinkedListNodeDoble nodoR = null;
        Iterator iterator = iterator();

        while(iterator.hasNext()){
            LinkedListNodeDoble nodo = (LinkedListNodeDoble) iterator.next();
            if(nodo.getObject().equals(object)){
                nodoR = nodo;
                break;
            }
        }
        return nodoR;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T get() {
        return (T) tail.getObject();
    }

    @Override
    public T get(Node node) {
        return (T) node.getObject();
    }


    @Override
    public T getPrevious(LinkedListDoble node) {
        if (node == null || node == head) {
            return null;
        }
        return (T) node.previous.getObject();
    }

    @Override
    public T getNext(LinkedListNodeDoble node) {
        if (node == null || node.next == null) {
            return null;
        }
        return (T) node.next.getObject();
    }
    @Override
    public T getFirst() {
        return (T) head.getObject();
    }

    @Override
    public T[] getFirst(int n) {
        @SuppressWarnings("unchecked")
        T[] elements = (T[]) new Object[n];
        int i = 0;
        Iterator iterator = iterator();
        while (iterator.hasNext() && i < n) {
            LinkedListNodeDoble<T> node = (LinkedListNodeDoble<T>) iterator.next();
            elements[i++] = node.getObject();
        }
        return elements;
    }

    @Override
    public T getLast() {
        return (T) tail.getObject();
    }

    @Override
    public T[] getLast(int n) {
        @SuppressWarnings("unchecked")
        T[] elements = (T[]) new Object[n];
        int i = n - 1;
        LinkedListNodeDoble<T> node = tail;
        while (node != null && i >= 0) {
            elements[i--] = node.getObject();
            node = node.prev;
        }
        return elements;
    }

    @Override
    public T pop() {
        LinkedListNodeDoble nodoPop = tail;
        LinkedListNodeDoble nodoPrev = (LinkedListNodeDoble) nodeOf(getPrevious(tail));
        nodoPrev.next = null;
        tail = nodoPrev;
        return (T) nodoPop.getObject();
    }

    @Override
    public boolean remove(T object) {
        try {
            LinkedListNodeDoble<T> eliminar = (LinkedListNodeDoble<T>) nodeOf(object);
            LinkedListNodeDoble<T> prev = (LinkedListNodeDoble<T>) nodeOf(getPrevious(eliminar));
            if (prev == null) {
                // El nodo a eliminar es el primer nodo de la lista
                head = eliminar.next;
            } else {
                prev.next = eliminar.next;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(Node node) {
        try {
            LinkedListNodeDoble<T> eliminar = (LinkedListNodeDoble<T>) node;
            LinkedListNodeDoble<T> prev = (LinkedListNodeDoble<T>) nodeOf(getPrevious(eliminar));
            if (prev == null) {
                head = eliminar.next;
            } else {
                prev.next = eliminar.next;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeAll(T[] objects) {
        boolean bool = false;
        try{
            for (T object : objects) {remove(object);}
            bool = true;
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean retainAll(T[] objects) {
        boolean bool = false;
        try{
            Iterator iterator = iterator();
            LinkedListDoble list = new LinkedListDoble() {
                @Override
                public Object getPrevious(LinkedListNodeDoble node) {
                    return null;
                }
            };
            for (T object : objects) {
                while( iterator.hasNext() ){
                    LinkedListDoble nodo = (LinkedListDoble) iterator.next();
                    if(nodo.getObject().equals(object)){
                        list.wait(nodo.getObject());
                    }
                }
            }
            head = list.head;
            tail = list.tail;
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            return bool;
        }
    }

    @Override
    public boolean set(Node node, T object) {
        boolean ack = false;
        try{
            node.setObject(object);
            ack = true;
        }catch( Exception e ){
            e.getStackTrace();
        }finally{
            return ack;
        }
    }

    @Override
    public int size() {
        Iterator iterator = iterator();
        int tm = 0;
        while(iterator.hasNext()){
            iterator.next();
            tm++;
        }
        return tm;
    }

    @Override
    public List subList(Node from, Node to) {
        LinkedListNodeDoble<T> list = new LinkedListNodeDoble<T>();
        List.head = (LinkedListNodeDoble<T>) from;
        List.tail = (LinkedListNodeDoble<T>) to;
        LinkedListDoble<T> listR = (LinkedListNodeDoble<T>) List.clone();
        listR.tail.next = null;
        return listR;
    }

    @Override
    public T[] toArray() {
        Object[] arr = new Object[size()];
        int i = 0;
        Iterator iterator = iterator();
        while(iterator.hasNext()){
            LinkedListNodeDoble next = (LinkedListNodeDoble) iterator.next();
            arr[i++] = next.getObject();
        }
        return (T[]) arr;
    }

    @Override
    public boolean orderBy(char c) {
        boolean bool = false;
        try {
            if (size() <= 1) {
                return false;
            }

            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                LinkedListNodeDoble<T> current = head;
                while (current.next != null) {
                    if (current.getObject().toString().compareTo(current.next.getObject().toString()) > 0) {
                        T temp = current.getObject();
                        current.setObject((T) current.next.getObject());
                        current.next.setObject(temp);
                        sorted = false;
                    }
                    current = current.next;
                }
            }

            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return bool;
        }
    }

    @Override
    public String toString() {
        String stringR = "";
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            LinkedListNodeDoble next = (LinkedListNodeDoble) iterator.next();
            stringR += next.toString();
            if (next.next != null) {
                stringR += " next=";
            }
        }
        return stringR;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public Iterator<Node> iterator() {
        Iterator<Node> iterator = new Iterator<>() {
            LinkedListNodeDoble nodoActual = head;
            LinkedListNodeDoble nodoTemp = null;

            int iteration = 0;
            @Override
            public boolean hasNext() {
                boolean bool = false;
                try{
                    if( nodoActual.next != null ){
                        bool = true;
                    }
                }catch(Exception e){
                    System.err.println(e.getStackTrace());
                }finally{
                    return bool;
                }
            }
            @Override
            public Node next() {
                try{
                    if(iteration != 0){nodoActual = nodoActual.next;}
                    iteration++;
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    return nodoActual;
                }
            }
        };
        return iterator;
    }

}

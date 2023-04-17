
package ListasCirculares;
import java.util.ArrayList;
import java.util.Iterator;

public class LinkedListCircular<T> implements List<T>{

    public LinkedListNodeC head;
    public LinkedListNodeC tail;

    public void LinkedListCircular(){
        head = new LinkedListNodeC(null);
        head.next = head;
        tail = head;
    }

    public void LinkedListCircular(T object){
        this.head = tail = new LinkedListNodeC(object);
    }

    @Override
    public boolean add(T object) {
        boolean bool = false;
        try {
            if (object != null) {
                if (isEmpty()) {
                    head = new LinkedListNodeC(object);
                    tail = head;
                    tail.next = head;
                } else {
                    tail.next = new LinkedListNodeC(object);
                    tail = tail.next;
                    tail.next = head;
                }
                bool = true;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean add(Node node, T object) {
        boolean bool = false;
        try {
            LinkedListNodeC nodo = (LinkedListNodeC) node;
            LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
            if (nodo.next == null || nodo.next == head) {
                nodo.next = nodoNuevo;
                tail = nodoNuevo;
                tail.next = head;
            } else {
                nodoNuevo.next = nodo.next;
                nodo.next = nodoNuevo;
            }
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean add(Node node, Node next) {
        boolean bool = false;
        try{
            LinkedListNodeC nodo = (LinkedListNodeC) node;
            LinkedListNodeC nodoNuevo = (LinkedListNodeC) next;
            if(nodo.next == null){
                nodo.next = nodoNuevo;
                tail = nodoNuevo;
            }else{
                nodoNuevo.next = nodo.next;
                nodo.next = nodoNuevo;
            }
            bool = true;
        } catch (Exception e){
            e.printStboolTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean add(T[] objects) {
        boolean bool = false;
        try{
            for (T object : objects) {
                LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
                tail.next = nodoNuevo;
                tail = nodoNuevo;
            }
            bool = true;
        } catch (Exception e){
            e.printStboolTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean add(Node node, T[] objects) {
        boolean bool = false;
        try{
            LinkedListNodeC nodo = (LinkedListNodeC) node;
            if(nodo.next != null){
                for (T object : objects) {
                    LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
                    nodoNuevo.next = nodo.next;
                    nodo.next = nodoNuevo;
                    nodo = nodoNuevo;
                }
            }else{
                for (T object : objects) {
                    LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
                    tail.next = nodoNuevo;
                    tail = nodoNuevo;
                }
            }
            bool = true;
        } catch (Exception e){
            e.printStboolTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean addFirst(T object) {
        boolean bool = false;
        try {
            LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
            nodoNuevo.next = head;
            head = nodoNuevo;
            if (tail == null) {
                tail = head;
                tail.next = head;
            }
            bool = true;
        } catch (Exception e) {
            e.printStboolTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean addFirst(T[] objects) {
        boolean bool = false;
        try{
            for (T object : objects) {
                LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
                nodoNuevo.next = head;
                head = nodoNuevo;
            }
            bool = true;
        } catch (Exception e){
            e.printStboolTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean addLast(T object) {
        boolean bool = false;
        try{
            LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
            tail.next = nodoNuevo;
            tail = nodoNuevo;
            bool = true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        } finally {
            return bool;
        }
    }

    @Override
    public boolean addLast(T[] objects) {
        boolean bool = false;
        try{
            for (T object : objects) {
                LinkedListNodeC nodoNuevo = new LinkedListNodeC(object);
                tail.next = nodoNuevo;
                tail = nodoNuevo;
                bool = true;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
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
        Iterator iterator = iterator();
        CircularLinkedList clon = new CircularLinkedList();
        while(iterator.hasNext()){
            LinkedListNodeC nodoTemp = (LinkedListNodeC) iterator.next();
            clon.add(nodoTemp.getObject());
        }
        return clon;
    }

    @Override
    public boolean contains(T object) {
        boolean bool = false;
        try{
            Iterator iterator = iterator();
            while(iterator.hasNext()){
                LinkedListNodeC nodo = (LinkedListNodeC) iterator.next();
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
                    LinkedListNodeC nodo = (LinkedListNodeC) iterator.next();
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
        LinkedListNodeC nodoR = null;
        Iterator iterator = iterator();

        while(iterator.hasNext()){
            LinkedListNodeC nodo = (LinkedListNodeC) iterator.next();
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
    public T getPrevious(Node node) {
        T object = null;
        Iterator iterator = iterator();

        while(iterator.hasNext()){
            LinkedListNodeC nodo = (LinkedListNodeC) iterator.next();
            if(nodo.next.isEquals(node)){
                object = (T) nodo.getObject();
            }
        }
        return object;
    }

    @Override
    public T getNext(Node node) {
        LinkedListNodeC nodo = (LinkedListNodeC) node;
        return (T) nodo.next.getObject();
    }

    @Override
    public T getFirst() {
        return (T) head.getObject();
    }

    @Override
    public T[] getFirst(int n) {
        T[] a = null;
        ArrayList<T> arrR = new ArrayList<>();
        Iterator iterator = iterator();

        while(iterator.hasNext()){
            LinkedListNodeC nodo = (LinkedListNodeC) iterator.next();
            arrR.add((T) nodo.getObject());
        }
        return arrR.toArray(a);
    }

    @Override
    public T getLast() {
        return (T) tail.getObject();
    }

    @Override
    public T[] getLast(int n) {
        Object[] elements = new Object[n];
        int i = 0;
        int j = 0;
        for (LinkedListNodeC<T> x = head; x != null; x = x.next) {
            if( j  >= size() - n ) {
                elements[i++] = x.getObject();
            }
            j++;
        }
        return (T[]) elements;
    }

    @Override
    public T pop() {
        LinkedListNodeC nodoPop = tail;
        LinkedListNodeC nodoPrev = (LinkedListNodeC) nodeOf(getPrevious(tail));
        nodoPrev.next = null;
        tail = nodoPrev;
        return (T) nodoPop.getObject();
    }

    @Override
    public boolean remove(T object) {
        boolean bool = false;
        try {
            LinkedListNodeC<T> eliminar = (LinkedListNodeC<T>) nodeOf(object);
            LinkedListNodeC<T> prev = (LinkedListNodeC<T>) nodeOf(getPrevious(eliminar));
            prev.next = eliminar.next;
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return bool;
        }
    }

    @Override
    public boolean remove(Node node) {
        boolean bool = false;
        try {
            LinkedListNodeC<T> eliminar = (LinkedListNodeC<T>) node;
            LinkedListNodeC<T> prev = (LinkedListNodeC<T>) nodeOf(getPrevious(eliminar));
            prev.next = eliminar.next;
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return bool;
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
            CircularLinkedList list = new CircularLinkedList();
            for (T object : objects) {
                while( iterator.hasNext() ){
                    LinkedListNodeC nodo = (LinkedListNodeC) iterator.next();
                    if(nodo.getObject().equals(object)){
                        list.add(nodo.getObject());
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
        boolean bool = false;
        try{
            node.setObject(object);
            bool = true;
        }catch( Exception e ){
            e.getStackTrace();
        }finally{
            return bool;
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
        CircularLinkedList<T> list = new CircularLinkedList<T>();
        list.head = (LinkedListNodeC<T>) from;
        list.tail = (LinkedListNodeC<T>) to;
        CircularLinkedList<T> listR = (CircularLinkedList<T>) list.clone();
        listR.tail.next = null;
        return listR;
    }

    @Override
    public T[] toArray() {
        Object[] arr = new Object[size()];
        int i = 0;
        Iterator iterator = iterator();
        while(iterator.hasNext()){
            LinkedListNodeC next = (LinkedListNodeC) iterator.next();
            arr[i++] = next.getObject();
        }
        return (T[]) arr;
    }

    @Override
    public boolean orderBy(char c) {
        boolean bool=false;
        try{
            CircularLinkedList list = new CircularLinkedList();
            if (list.size() <= 1) {
                return false;
            }
            boolean flag = true;
            while (flag) {
                flag = false;
                LinkedListNodeC<T> current = list.head;
                while (current.next != null) {
                    if (current.getObject().toString().compareTo(current.next.getObject().toString()) > 0) {
                        T temp = current.getObject();
                        current.setObject((T) current.next.getObject());
                        current.next.setObject(temp);
                        flag = true;
                    }
                    current = current.next;
                }
            }
            bool = true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            return bool;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedListNodeC current = head;
        sb.append("[");
        if (current != null) {
            sb.append(current.getObject().toString());
            current = current.next;
        }
        while (current != head) {
            sb.append(", ");
            sb.append(current.getObject().toString());
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public Iterator<Node> iterator() {
        Iterator<Node> iterator = new Iterator<>() {
            LinkedListNodeC nodoActual = head;
            LinkedListNodeC nodoTemp = null;

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

    void removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

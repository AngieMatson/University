
package ListasDoblesEnlazadas;


public class LinkedListNodeDoble<T> implements Node<T> {

    private T object;

    public LinkedListNodeDoble next;
    public LinkedListNodeDoble prev;

    public LinkedListNodeDoble() {
        this.object = null;
        this.prev = null;
        this.next = null;
    }

    public LinkedListNodeDoble(T object) {
        this.object = object;
    }

    @Override
    public boolean setObject(T object) {
        this.object = object;
        return true;
    }

    @Override
    public T getObject() {
        return this.object;
    }

    @Override
    public boolean isEquals(T object) {
        return this.object.toString().equals(object.toString());
    }

    @Override
    public String toString() {
        return "[ "+object.toString()+" ]";
    }



}

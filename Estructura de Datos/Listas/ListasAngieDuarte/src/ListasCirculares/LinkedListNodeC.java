
package ListasCirculares;

public class LinkedListNodeC<T> implements Node<T> {

    private T object;

    public LinkedListNodeC next;

    public LinkedListNodeC() {
        this.object = null;
    }

    public LinkedListNodeC(T object) {
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

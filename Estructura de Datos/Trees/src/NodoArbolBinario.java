public class NodoArbolBinario<T extends Comparable<T>> {

    private T element;
    public NodoArbolBinario<T> left;
    public NodoArbolBinario<T> right;

    public NodoArbolBinario(T element, NodoArbolBinario<T> left, NodoArbolBinario<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public NodoArbolBinario(NodoArbolBinario<T> left, NodoArbolBinario<T> right) {
        this.left = null;
        this.right = null;
    }

    public NodoArbolBinario(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodoArbolBinario<T> getLeft() {
        return left;
    }

    public void setLeft(NodoArbolBinario<T> left) {
        this.left = left;
    }

    public NodoArbolBinario<T> getRight() {
        return right;
    }

    public void setRight(NodoArbolBinario<T> right) {
        this.right = right;
    }

    public boolean getObject() {
        return false;
    }
}

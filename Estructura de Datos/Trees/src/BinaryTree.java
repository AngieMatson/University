import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {
    private NodoArbolBinario<T> raiz;
    public boolean isEmpty(){
        return raiz == null;
    }
    public NodoArbolBinario<T> getRaiz(){
        return raiz;
    }
    public boolean isRoot(NodoArbolBinario<T> nodo){
        return raiz == nodo;
    }

    public boolean isLeaf(NodoArbolBinario<T> nodo){
        return nodo.getLeft() == null && nodo.getRight() == null;
    }

    public boolean isInternal(NodoArbolBinario<T> nodo) {
        return !isLeaf(nodo);
    }

    public void preorder(NodoArbolBinario<T> nodo){

        System.out.println(nodo.getElement().toString());

        if(nodo.getLeft()!= null){
            preorder(nodo.getLeft());
        }
        if(nodo.getRight()!= null){
            preorder((nodo.getRight()));
        }
    }

    public void inorder(NodoArbolBinario<T> nodo){

        if(nodo.getLeft()!= null){
            inorder(nodo.getLeft());
        }

        System.out.println(nodo.getElement().toString());

        if(nodo.getRight()!= null){
            inorder((nodo.getRight()));
        }

    }

    public void postorder(NodoArbolBinario<T> nodo){

        if(nodo.getLeft()!= null){
            postorder(nodo.getLeft());
        }
        if(nodo.getRight()!= null){
            postorder((nodo.getRight()));
        }

        System.out.println(nodo.getElement().toString());
    }

    public void widthOrder(NodoArbolBinario<T> nodo) {
        if (nodo == null) {
            return;
        }
        Queue<NodoArbolBinario<T>> queue = new LinkedList<>();
        queue.add(nodo);
        while (!queue.isEmpty()) {
            NodoArbolBinario<T> node = queue.remove();
            System.out.println(node.getObject());
            NodoArbolBinario<T> left = node.getLeft();
                if (left != null) {
                    queue.add(left);
                }
                NodoArbolBinario<T> right = node.getRight();
                if (right != null) {
                    queue.add(right);
            }
        }
    }

    public boolean insert(T objeto) {
        if (objeto == null) {
            return false;

        } else {
            Queue<NodoArbolBinario<T>> queue = new LinkedList<>();
            queue.add(raiz);

            while (!queue.isEmpty()) {
                NodoArbolBinario<T> node = queue.remove();
                System.out.println(node.getObject());

                NodoArbolBinario<T> left = node.getLeft();
                if (left != null) {
                    queue.add(left);
                } else {
                    node.left = new NodoArbolBinario<>(objeto);
                    return true;
                }

                NodoArbolBinario<T> right = node.getRight();
                if (right != null) {
                    queue.add(right);
                } else {
                }
            }
            return true;
        }

    }

    public void insertarProfundidad(T objeto) {
        NodoArbolBinario<T> nodo = new NodoArbolBinario<>(objeto);

        if (raiz == null) {
            raiz = nodo;
        } else {
            Queue<NodoArbolBinario<T>> cola = new LinkedList<>();
            cola.add(raiz);

            while (!cola.isEmpty()) {
                NodoArbolBinario<T> temp = cola.poll();

                if (temp.getLeft() == null) {
                    temp.setLeft(nodo);
                    break;
                } else if (temp.getRight() == null) {
                    temp.setRight(nodo);
                    break;
                } else {
                    cola.add(temp.getLeft());
                    cola.add(temp.getRight());
                }
            }
        }
    }

    public int height(NodoArbolBinario<T> nodo) {
        if (nodo == null) {
            return -1;
        } else {
            int leftHeight = height(nodo.getLeft());
            int rightHeight = height(nodo.getRight());
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

    public boolean isComplete(NodoArbolBinario<T> nodo) {
        if (nodo == null) {
            return true;
        }
        Queue<NodoArbolBinario<T>> queue = new LinkedList<>();
        queue.add(nodo);
        boolean bool = false;
        while (!queue.isEmpty()) {
            NodoArbolBinario<T> node = queue.remove();
            if (node.getLeft() != null) {
                if (bool) {
                    return false;
                }
                queue.add(node.getLeft());
            } else {
                bool = true;
            }
            if (node.getRight() != null) {
                if (bool) {
                    return false;
                }
                queue.add(node.getRight());
            } else {
                bool = true;
            }
        }
        return true;
    }

    public int countNodes(NodoArbolBinario<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        int leftCount = countNodes(nodo.getLeft());
        int rightCount = countNodes(nodo.getRight());
        return 1 + leftCount + rightCount;
    }




}

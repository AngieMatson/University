package BST;
import javax.swing.tree.TreeNode;
import java.util.*;

public class BST {

    // nodo árbol

    public class Nodo<T> {
        private Nodo T;
        private Nodo izquierdo;
        private Nodo derecho;

        public <T> Nodo(T valor) {
            this.T = (Nodo) valor;
        }

        public T getValor() {
            return (T) T.getValor();
        }

        public static TreeNode<T> getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(Nodo izquierdo) {
            this.izquierdo = izquierdo;
        }

        public static TreeNode<T> getDerecho() {
            return derecho;
        }

        public void setDerecho(Nodo derecho) {
            this.derecho = derecho;
        }
    }

    public boolean isEmpty() {
        boolean root = false;

        return root = Boolean.parseBoolean(null);
    }


    public boolean isComplete(Nodo root) {
        if (root == null) {
            return true;
        }

        Queue<Nodo> queue = new LinkedList<>();
        queue.offer(root);

        boolean end = false;
        while (!queue.isEmpty()) {
            Nodo node = queue.poll();
            if (node.getIzquierdo() != null) {
                if (end) {
                    return false;
                }
                queue.offer(node.getIzquierdo());
            } else {
                end = true;
            }

            if (node.getDerecho() != null) {
                if (end) {
                    return false;
                }
                queue.offer(node.getDerecho());
            } else {
                end = true;
            }
        }

        return true;
    }

    public int getNumberOfNodes() {
        TreeNode root = null;
        return countNodes(root);
    }

    private <T> int countNodes(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(Nodo.getIzquierdo()) + countNodes(Nodo.getDerecho());
        }
    }


}



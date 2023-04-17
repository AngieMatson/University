package BST;
import java.util.*;

public class BST {

// Clase producto con los atributos
    public class Producto {
        public String nombre;
        public double precio;
        public int ID;


    public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

    }

    // Creación de la lista doble
    public void main(String[] args) {
        LinkedList<Producto> productos = new LinkedList<>();
        productos.add(new Producto("Producto 1", 10.0));
        productos.add(new Producto("Producto 2", 5.0));
        productos.add(new Producto("Producto 3", 15.0));

        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                if (p1.getPrecio() > p2.getPrecio()) {
                    return 1;
                } else if (p1.getPrecio() < p2.getPrecio()) {
                    return -1;
                }
                return 0;
            }
        });

        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - " + p.getPrecio());
        }
    }

    // nodo árbol

    public class Nodo {
        private Producto valor;
        private Nodo izquierdo;
        private Nodo derecho;

        public Nodo(Producto valor) {
            this.valor = valor;
        }

        public Producto getValor() {
            return valor;
        }

        public Nodo getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(Nodo izquierdo) {
            this.izquierdo = izquierdo;
        }

        public Nodo getDerecho() {
            return derecho;
        }

        public void setDerecho(Nodo derecho) {
            this.derecho = derecho;
        }
    }

    public Nodo listaToArbol(LinkedList<Producto> productos, int inicio, int fin) {
        if (inicio > fin) {
            return null;
        }

        int medio = (inicio + fin) / 2;
        Nodo nodo = new Nodo(productos.get(medio));

        nodo.setIzquierdo(listaToArbol(productos, inicio, medio - 1));
        nodo.setDerecho(listaToArbol(productos, medio + 1, fin));

        return nodo;
    }

    private LinkedList<BST.BST.Producto> productos;
    Nodo raiz = listaToArbol(productos, 0, productos.size() - 1);

}



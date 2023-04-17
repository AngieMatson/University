package mainpackage;
import interfa.LinkedList;
import interfa.LinkedListNode;
import java.util.Iterator;

/**
 *
 * @author USER
 */
public class Lista implements LinkedList {
    Nodo cabeza=null;
    Nodo cola=null; 
    int contador;

    @Override
    public boolean add(Object object) 
    {
        Nodo nuevo = new Nodo(object);// se crea  el nodo
        if (cabeza==null) //si la cabeza es nullentonces la cola va a ser igual al nuevo elemento que ingresemos
        {
            cola = nuevo;
            contador+=1; // el tipico contador para saber cuantos nodos tenemos
            return true;//nos va aretornar verdadero si esto se pudo realizar
        }
        else if (cola==null)// en el caso de que la cabeza no sea null entonces vamos agregar el elemento en la cola
        {
            cola=nuevo; // decimos que la cola va a ser igual al nuevo elemento
            cabeza.setnext(cola); // apuntamos la cabeza al siguiente elemento de la cola
            cola.setprev(cabeza);// despues apuntamos de la cola a la cabeza
            contador+=1;// el tipico contador
            return true;// si esto se realiza nos retorna true
        }
        else if (cola!=null) // en elcaso de que la cola sea diferente a null entonces
        {
            cola.setnext(nuevo);//apuntamos la cola al siguiente elemento en este caso al nevo
            nuevo.setprev(cola);//despues apuntamos del nuevo elemento a la cola
            cola=nuevo;// la cola va a tomar el valor del nuevo elemento ahora, por tanto sr van agregar elementos al final de la lista
            contador+=1;// el tipico contador
            return true;// si esto se realiza nos retorna true
        }
        else
            return false;// si no pasasobre las condiciones anteriores nos va arrojar falso
    }

     @Override
    public boolean add(LinkedListNode node, Object object) 
    {
        Nodo nuevo = cabeza;
        for (int i = contador; i>=1; i--) { // hacemos un blucle para recorrer la lista y en contrar el node
            if (nuevo==null)
            {
                return false;
            }
            if(nuevo==node)
            {
                Nodo nuevo1 = new Nodo(object);
                nuevo1.setnext(nuevo.getnext());
                nuevo.getnext().setprev(nuevo1);
                nuevo.setnext(nuevo1);
                nuevo1.setprev(nuevo);
                contador+=1;
                return true;
            }
            else{
                nuevo=nuevo.getnext();
            }
        }
        return false;
        
    }
    @Override
    public boolean addAll(Object[] objects) 
    {
        try 
        {
            for (Object o : objects){ // agregar todos los elementos al final de la lista pendiente comentar
            Nodo n = new Nodo(o);
            if (cabeza==null)
            {
                cabeza=n;
            }
            else if(cola==null)
            {
                cabeza.setnext(n);
                n.setprev(cabeza);
            }
            else
            {
                cola.setnext(n);
                n.setprev(cola);
                cola=n;
            }
            contador+=1;
            }
            return true;
        } catch (Exception e) 
            {
                return false;
            }
    }

    @Override
    public boolean addAll(LinkedListNode node, Object[] objects) 
    {
        Nodo nuevo = cabeza;
        for (int i = contador; i>=1; i--) 
        {
            if (nuevo==null)//pendiente comentar anotaciones en el word despues pasar
            {
                return false;
            }
            if(nuevo==node)
            {
                try {
                    for (Object o : objects){  /// buscar la posicion del nodo para luego agregar todos los elementos ahi
                        Nodo nuevo1 = new Nodo(o);
                        if(nuevo.getnext()!=null){
                            nuevo1.setnext(nuevo.getnext());
                            nuevo.getnext().setprev(nuevo1);
                            nuevo.setnext(nuevo1);
                            nuevo1.setprev(nuevo);
                        }
                        if(nuevo.getnext()==null){
                            nuevo.setnext(nuevo1);
                            nuevo1.setprev(nuevo);
                        }
                        nuevo=nuevo1;
                        contador+=1;
                    }
                    return true;
                } catch (Exception e) 
                {
                    return false;
                }
            }
            else
            {
                nuevo=nuevo.getnext();
            }
        }
        return false;
        
    }

    @Override
    public boolean addFirst(Object object) 
    {
        Nodo nuevo = new Nodo(object); ///insertar un elemento especificado al principio de la lista
        if (cabeza==null)  /// pendiente pasar cmentarios de word
        {
            cabeza=nuevo;
            contador+=1;
            return true;
        }
        else if (cabeza!=null)
        {
            nuevo.setnext(cabeza);
            cabeza.setprev(nuevo);
            cabeza=nuevo;
            contador+=1;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean addLast(Object object) 
    {
        Nodo nuevo = new Nodo(object);// insertar un elemento especificado al final de la lista pendiente word punto numero 5
        if(cabeza==null)
        {
            cabeza=nuevo;
            contador+=1;
            return true;
        }
        else if (cola==null)
        {
            cola=nuevo;
            cabeza.setnext(cola);
            cola.setprev(cabeza);
            contador+=1;
            return true;
        }
        else if (cola!=null)
        {
            cola.setnext(nuevo);
            nuevo.setprev(cola);
            cola=nuevo;
            contador +=1;
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void clear() // eliminar todos los elementos de la lista
    {
        cabeza=null; // simplemente pasamos que la cabeza y la cola son nulospara especficar que no tenmos elementos ademas decimos que el contador es 0 por tanto hay 0 
        cola=null;
        contador=0;
        System.out.println("eliminado con exito, gracias.");
    }

    @Override
    public LinkedList clone() // hay dudas preguntar en clase..... sacado de internet... referencia perdida
    {
        return this;
    }

    @Override
    public boolean contains(Object object) // buscar si un elemento que buscamos esta en la lista para eso utilizamos un for para buscarlo si esta retorna verdadero si no falso
    {
        Nodo nuevo = cabeza;
        for (int i = contador; i>=1; i--) 
        {
            if(nuevo.getvalor()==object) /// comparamos si el valor optenido es igual al objeto
            {
                return true;
            }
            nuevo=nuevo.getnext();
            
        }
        return false;
    }

    @Override
    public boolean containsAll(Object[] objects)  // buscar todos que todos los elementos esten en la ista, se hace muy similar al anterior es confuso, ver explicacion en word
    {   
        boolean probar = false;
        for (Object dato : objects) 
        {
            Nodo nuevo = cabeza;
            for (int i = contador; i>=1; i--) //utilizamos el mismo for 
            {
                if(nuevo.getvalor()==dato) // obternemos el valor de cada elemento y miramos si es ==al elemento ingresado(internet pendiente referenciar word explicacion grafica
                {
                    probar=true;
                }
            }
        }
        return probar; /// dependiendo de como da el resultado nos rebota faslo o verdadero
    }

    @Override
    public LinkedListNode nodeOf(Object object) 
    {
        Nodo n = cabeza;
        for (int i = contador; i>=1; i--) 
        {
            if(n.getvalor()==object)
            {
                return n;
            }
            else{n=n.getnext();}
        }
        return null;
    }

    @Override
    public boolean isEquals(Object object) {
        return this==object;
    }

    @Override
    public boolean isEmpty() 
    {
        return cabeza == null & cola == null;
    }

    @Override
    public Object get() 
    {
        return cabeza.getvalor();
    }

    @Override
    public Object get(LinkedListNode node) 
    {
        Nodo nuevo = cabeza;
        for (int i = contador; i>=1; i--) 
        {
            if (nuevo==node)
            {
                return nuevo.getvalor();
            }
            nuevo=nuevo.getnext();
        
        }
        return null;
    }

    @Override
    public Object getPrevious(LinkedListNode node) 
    {
        Nodo nuevo = cola;
        for (int i = contador; i>=1; i--) 
        {
            if (nuevo==node)
            {
                return nuevo.getprev();
            }
            nuevo=nuevo.getprev();
        
        }
        return null;
    }

    @Override
    public Object getNext(LinkedListNode node) {

    }

    @Override
    public Object getFirst() 
    {
        return cabeza.getvalor();
    }

    @Override
    public Object getLast() 
    {
        return cola.getvalor();
    }

    @Override
    public boolean remove(Object object) { //wwwwwwwwaaaaaaeeeeeeeeeeeee
        return false;
    }

    @Override
    public boolean remove(LinkedListNode node) {
        return false;
    }

    @Override
    public boolean removeAll(Object[] objects) {
        return false;
    }

    @Override
    public boolean retainAll(Object[] objects) {
      return true;
    }
    @Override
    public boolean set(LinkedListNode node, Object object) {
        Nodo nuevo = cabeza;
        for (int i = contador; i>=1; i--) {
            if (nuevo==node){nuevo.setvalor(object);return true;}
        }
        return false;
    }

    @Override
    public int size() {
        return contador;
    }

    @Override
    public LinkedList subList(Nodo from, Nodo to) {
        Lista lista = new Lista();
        lista.cabeza=from;
        lista.cola=to;
        return lista;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.// internet estudiar sobre el tema
    }

    @Override
    public LinkedList sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.// internet estudiar sobre el tema
    }
    
}
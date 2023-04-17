/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpackage;

import interfa.LinkedListNode;

/**
 *
 * @author USER
 */
public class Nodo implements LinkedListNode {
    
    private Object valor;
    private Nodo siguiente=null;
    private Nodo anterior=null;
    
    public Nodo(Object valor)
    {
        this.valor=valor;
    }
    public Object getvalor()
    {
        return valor;
    }
        public Nodo getnext()
    {
        return siguiente;
    }
    public void setvalor(Object valor)
    {
        this.valor=valor;
    }
        public Nodo getprev()
    {
        return anterior;
    }
        public void setprev(Nodo nodo){
        this.anterior=nodo;
    }
    public void setnext(Nodo nodo){
        this.siguiente=nodo;
    }

}
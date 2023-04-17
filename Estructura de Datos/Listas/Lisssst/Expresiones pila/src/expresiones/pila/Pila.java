/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresiones.pila;

/**
 *
 * @author Tecnologia&Sistemas
 */
public class Pila {
    int n;
    int contador;
    Object pila[];// la pila va hacert un arreglo

    public Pila(int n) {
        this.n = n;
        this.contador = 0;
        this.pila = new Object[n]; //instanciamos el arreglo de objectos, le damos el valor de object para que podamos apilar cualquier tipo de cosas
    }
    
    public boolean estaVacia(){
        return contador==0;
    }
    
    public boolean estaLlena(){
        return contador==n;
    }
    public boolean apilar(Object dato){
        if(estaLlena())// si esta llena no puede apilar
        {
            return false;
        }
        pila[contador]=dato; // vamos a apilar
        contador++;
        return true;
    }
    public Object desapilar(){
        if (estaVacia()){
            return "error";
        }
        contador--;
        return pila[contador];//que nos retornen los objectos que hay a medida que vamos decrementando el contador
    }
    public Object getelementofinal(){
        return pila[contador-1];// obtengom el elemento de la cima, le damos menos 1 porque la pila esta dada primer elemnto es =0 en el contador
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresiones.pila;

/**
 *
 * @author Tecnologia&Sistemas
 */
public class Evaluador {
    public double evaluar(String infija){//lo pongo estatico para no tener que instanmciar un objeto de esa clase,se recibe la expresion infija como cadena de caracteres y me devuelve un numero
        String posfija=convertir(infija);
        System.out.println("la expresion en posfija es: "+ posfija);
        return evaluarPosfija(posfija);
    }
    //para poder evaluar la funcion tenemos que pasar de infija a posfija

    private  String convertir(String infija) {
        String posfija="";//comienza vacia
        Pila pila = new Pila(100); //apila 100 operadores
        //tenemos que recorrer el string valor por valor
        for (int i = 0; i< infija.length();i++){//aqui vamos a recorrer el string, legth nos devuelver el tamaño del string
        //tenemos que preguntar si el caracter ingresado es un numero o operador, si es un numero toca enviarlo a la operacion posfija pero si es un operador tenemos que hacer otras cosas
            char letra=infija.charAt(i);//en la prefija van los operadores
            if(esOperador(letra)){//con char me decuelve el caracter de cierta posicion
               if (pila.estaVacia()){ // si es un operador lo apilamos// si la pila esta vacia simplemente apilamos 
                   pila.apilar(letra);// apilamps el operador 
               }
               else{//despues de apilar el primer elmento pasamos a verificar las prioridades para asi poder colocarlos de manera correcta
                   if (prioridad_fuera_pila(letra)>prioridad_dentro_pila((char)pila.getelementofinal())){// miramos si el operador de afuera es mayor al operador de adentro entonces apilamos la letra
                        pila.apilar(letra);
                    }
                   else{// como la prioridad es diferente entonces vamos a desapilar y la vamos agregando a la posfija
                       posfija+=pila.desapilar();
                       pila.apilar(letra);// entonces metemos a la pila el nuevo elemento
                   }
               }
            }else{// si no es un operador entonces lo llevamos a posfija
                posfija+=letra;  ///aqui va acomulando las operaciones es lo qeu nos va a mostrar
            }
        }
        while(!pila.estaVacia()){// si no esta vacia y ya termino lo otro entonces los elementos que quedaron en la pila la agregamos a posfija 
          posfija+=pila.desapilar();  
        }
        return posfija;
    }

    public int prioridad_fuera_pila(char operador){
        if(operador=='^'){
            return 4;
        } 
        if(operador=='*'||operador=='/'){
            return 2;
        } 
        if(operador=='+'||operador=='-'){
            return 1;
        }
        if(operador=='('){
            return 5;
        }
        return 0;
    }
    
        public int prioridad_dentro_pila(char operador){
        if(operador=='^'){
            return 3;
        } 
        if(operador=='*'||operador=='/'){
            return 2;
        } 
        if(operador=='+'||operador=='-'){
            return 1;
        }
        if(operador=='('){
            return 0;
        }
        return -1;
    }
    private  double evaluarPosfija(String posfija) {
       Pila pila=new Pila(100);
        for (int i = 0; i< posfija.length();i++){ // recorremos el string
            char letra=posfija.charAt(i);// hacemos casi lo mismo que en la prefija//entonces vamps a preguntar si el primer valor es un operador, si no es entonces lo apilamos como numero de una, ya que estaba en caracter
            if(!esOperador(letra)){
                double numero= Double.parseDouble(String.valueOf(letra));
                pila.apilar(numero);
            }
            else{// si es un operador entonces comenzamos a desapilar guardamos el primer dato qeu sacamos en el numero 2 y el segundo en el numero 1
                double numero2=(double)pila.desapilar();
                double numero1=(double)pila.desapilar();
                double numero3=operaciones(letra,numero1,numero2);// por ultimo llamamos al metodo operaciones para que nos haga las operaciones de los dos numeros que desapilamos junto al operador correspondiente y lo guardamos en la variable numero3
                pila.apilar(numero3);// despues lo apilamos y el resultado se guarda al final de la pila
            }
        }
        return (double)pila.getelementofinal();//obtenemos el elemento que en este casi va hacer el resultado que obtuvimos anteriormente
    }

    private  boolean esOperador(char letra) {
       if(letra=='*' || letra=='/'||letra=='+'||
               letra=='-'||letra=='('||letra==')'||letra=='^'){
           return true;
       } 
       return false;
    }

    private double operaciones(char letra, double numero1, double numero2) {
        if(letra=='-'){
            return numero1-numero2;
        }
        if(letra=='*'){
            return numero1*numero2;
        }
        if(letra=='/'){
            return numero1/numero2;
        }
        if(letra=='^'){
            return Math.pow(numero1, numero2);
        }
        if(letra=='+'){
            return numero1+numero2;
        }
        if(letra=='('){
            return 1 ;
        }
    return 0;
    }
    
    
    //falta por modificar que es en teoria lo mismo con metodos push y pop tambien verifivcar parentesis 
    
            
}

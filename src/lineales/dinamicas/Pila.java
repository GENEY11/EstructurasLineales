/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineales.dinamicas;

/**
 *
 * @author gustavoN
 */
public class Pila {
    private Nodo tope;
    
    public Pila(){    
        this.tope = null;
    }
    
    //Apilar
    public boolean apilar (Object nuevoElem){
    
        Nodo nuevo = new Nodo (nuevoElem, this.tope);
        
        this.tope = nuevo;
        
        return true;
    }
    //Desapilar
    public boolean desapilar(){
        boolean verif;
        
        if(this.tope==null){
            verif=false;
        }else{
        
            this.tope=this.tope.getEnlace();
            verif=true;
        }
        return verif;
    }
    //Obtener tope
    public Object obtenerTope(){
        Object variable;
        
        if(this.tope==null){
            variable = null;
        }else{
            variable=this.tope.getElem();
        }        
        return variable;
    
    }
    //esVacia(): boolean
    public boolean esVacia(){
        boolean verif;
        
        if(this.tope==null){
            verif=true;
        }else{
            verif=false;
        }
        return verif;
    }
    //vaciar(): void
    public void vaciar(){
        this.tope=null;
    }
    //clone (): Pila
    public Pila clone(){
        Pila clon = new Pila ();
        clon.tope = new Nodo (this.tope.getElem(),null);
        
        Nodo nodoOriginal= this.tope.getEnlace();
        Nodo nodoClon = clon.tope;
        
        while (nodoOriginal != null){
            Nodo nodoNuevo = new Nodo (nodoOriginal.getElem(),null);
            nodoClon.setEnlace(nodoOriginal.getEnlace());
            nodoClon = nodoNuevo;
            nodoOriginal = nodoOriginal.getEnlace();          
            
        }
        return clon;
    }
    //toString(): String
    @Override
    public String toString(){
        String s = "";
        
        if(this.tope==null){
            s = "Pila Vacia";
        }
        else{
            //Declaro una varible que apunta a this.tope
            Nodo aux = this.tope;
            s = "[";
            
            while (aux != null){
                s = s + aux.getElem().toString();
                //Me muevo al siguiente nodo
                aux = aux.getEnlace();
                if(aux!=null){
                    s = s + ",";
                }
            }
            s = s + "]";
        }
        return s;
    }
    
}

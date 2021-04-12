/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineales.estaticas;

/**
 *
 * @author gustavoN
 */
public class Pila {
    //Atributos
    private Object[] arreglo;
    private int tope;
    private static final int TAMANIO = 20;
    
    //COnstructor vacio
    public Pila (){
        this.arreglo = new Object[TAMANIO];
        this.tope = -1;
    }
    
    //Operaciones
    //Apilar
    public boolean apilar (Object nuevoElem){
    
        boolean exito;
        
        if(this.tope+1>= this.TAMANIO){
            exito = false;}
        else{
            this.tope++;
            this.arreglo[tope] = nuevoElem;
            exito = true;
        }
                       
        return exito;
    }
    
    //desapilar():boolean
    public boolean desapilar(){
        
    boolean verif;
    
    if(this.tope==-1){
    verif=false;
    }else{
        this.arreglo[tope] = null;
        this.tope--;
        verif=true;
    }
    
    return verif;
    }
    //obtenerTope(): TipoElemento
    public Object obtenerTope (){
        Object elem;
        
        if(this.tope != -1){
        elem=this.arreglo[tope];}
        else{
        elem=null;
        }
    
        
    return elem;
    }
    //esVacia(): boolean
    public boolean esVacia(){
    
    boolean vacia;
    
    if(this.tope!=-1){
    vacia=false;
    }else{
    vacia=true;
    }
    
    return vacia;
    }
    //vaciar()
    public void vaciar(){
    
    int i;
    
    for(i=0;i<=this.tope;i++){
        this.arreglo[i]=null;
    }
    }
    //clone():Pila
    public Pila clone(){
    
    int i;
    Pila clon = new Pila();
    
    for(i=0;i<this.tope;i++){
        clon.arreglo[i]=this.arreglo[i];
    }
    clon.tope=this.tope;
    return clon;
    }
    
    //toString(): String
    @Override
    public String toString(){
    
    int i;
    String s="";
    for(i=0;i==this.tope;i++){
        s=s+this.arreglo[i];
    }
    return s;
    }
    
}

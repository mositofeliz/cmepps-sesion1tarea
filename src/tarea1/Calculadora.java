package tarea1;

/**
 *
 * @author adri
 */
public class Calculadora {
    
    private int a, b;
    
    public Calculadora(){
        
    }
    
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int suma(){
        System.out.println("Vamos a sumar dos numeros");
        int suma = this.a + this.b;
        return suma;
    }
}

package tarea1;

/**
 *
 * @author adri
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Empezamos!");
        
        Calculadora c = new Calculadora(5, 2);
        int suma = c.suma();
        System.out.println("La suma es " + suma);
        
        Calculadora c2 = new Calculadora(10, 4);
        int suma2 = c2.suma();
        System.out.println("La suma es " + suma);
        
        int resta2 = c2.resta();
        System.out.println("La resta es " + suma);
    }
    
}

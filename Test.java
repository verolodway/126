
/**
 * Write a description of class Test here.
 * 
 * @author Vero 
 * @version (a version number or a date)
 */
public class Test
{
    
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
       
    }

    public static String tiempoEnSegundos(){
        int contador = 1;
        long tiempo = System.currentTimeMillis();
        while(contador < 1000000){
            System.out.println(contador);
            contador++;
        }
        long tiempo1 = System.currentTimeMillis();
        long total = (tiempo1 - tiempo)/1000;
        long minutos = total/60;
        
        return "Tiempo total empleado: " + minutos + " minutos y " + total + " segundos";
    }
}

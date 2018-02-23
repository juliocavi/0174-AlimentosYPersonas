
/**
 * Crea objetos de la clase Persona, simula una persona real.
 *
 * @author (Julio Cachón Villadangos)
 * @version (23/02/2018)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean hombre = true;
    private int peso = 0;
    private int altura = 0;
    private int edad = 0;
    private int calorias = 0;
    private double metabolismoBasal = 0;

    /**
     * Constructor para objetos de la clase Persona
     * @param nombre es el nombre de la persona.
     * @param dice si la persona es un hombre.
     * @param peso es el peso en kilogramos de la persona.
     * @param altura es la altura en centimetros de la persona.
     * @param edad es la edad de la persona.
     */
    public Persona(String nombre, boolean hombre, int peso, int altura, int edad)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.hombre = hombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        if(hombre){
            metabolismoBasal = (10*peso) + (6*altura) + (5*edad) + 5; 
        }
        else{
            metabolismoBasal = (10*peso) + (6*altura) + (5*edad) - 161;
        }
    }

    /**
     * Recrea como una persona come una comida, y las calorias que ingiere.
     * Suma el numero de calorias de la comida ingerida a las calorias ingeridas por la persona.
     * Devuelve el numero de calorias ingerida en esa comida.
     *
     * @param  comida introduce una comida creada
     * @return    devuelve el numero de calorias de la comida ingerida en ese momento
     */
    public int comer(Comida comida)
    {
        int caloriasDeLaComida = 0;
        if(hombre && calorias>metabolismoBasal || !hombre && calorias>metabolismoBasal){
            caloriasDeLaComida = -1;
        }
        else{
            calorias += comida.getCalorias();
            caloriasDeLaComida = comida.getCalorias();
        }
        return caloriasDeLaComida;
    }

    /**
     * Devuelve el numero de calorias totales ingeridas hasta el momento.
     * @return devuelve el numero de calorias totales ingeridas hasta el momento.
     */
    public int getCaloriasIngeridas()
    {
        return calorias;
    }

}

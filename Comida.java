
/**
 * Crea objetos de la clase comida, simula una comida real con sus calorias.
 *
 * @author (Julio Cachón Villadangos)
 * @version (23/02/2018)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String comida;
    private int calorias = 0;

    /**
     * Constructor for objects of class Comida.
     * @param comida es el nombre de la comida.
     * @param calorias son las calorias asociadas a dicha comida.
     */
    public Comida(String comida, int calorias)
    {
        // initialise instance variables
        this.comida = comida;
        this.calorias = calorias;
    }

    /**
     * Devuelve el número de calorias de una comida.
     *
     * @param  y  a sample parameter for a method
     * @return    el numero de calorias de la comida.
     */
    public int getCalorias()
    {
        return calorias;
    }
    
    /**
     * Devuelve el nombre de la comida
     * @return el nombre de la comida
     */
    public String getNombre()
    {
        return comida;
    }
}

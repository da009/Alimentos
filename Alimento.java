
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    private String nombre;
    private String CompMay;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;
    
    /**
     * Costructor para alimentos.
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas)
    {
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        calorias = (proteinas*4) + (carbohidratos*4) + (grasas*9);
    }
    
    /**
     * Muestra los datos del alimento.
     */
    public void mostrarDatos()
    {
        if (proteinas > carbohidratos && proteinas > grasas)
        {
            CompMay = "Proteinas";
        }
        else if (carbohidratos > proteinas && carbohidratos > grasas)
        {
            CompMay = "Carbohidratos";
        }
        else if (grasas > proteinas && grasas > carbohidratos)
        {
            CompMay = "Grasas";
        }
        else if (proteinas == carbohidratos && proteinas > grasas)
        {
            CompMay = "Proteinas" + " y " + "carbohidratos";
        }
        else if (proteinas == grasas && proteinas > carbohidratos)
        {
            CompMay = "Proteinas" + " y " + "grasas";
        }
        else if (carbohidratos == grasas && carbohidratos > proteinas)
        {
            CompMay = "Carbohidratos" + " y " + "grasas";
        }
        else if (carbohidratos == grasas && carbohidratos == proteinas)
        {
            CompMay =  "Proteinas" + ", " + "carbohidratos" + " y " + "grasas";
        }
        System.out.println("Nombre: "                               + nombre);
        System.out.println("Proteinas por cada 100 gramos: "        + proteinas);
        System.out.println("Carbohidratos  por cada 100 gramos: "   + carbohidratos);
        System.out.println("Grasas  por cada 100 gramos: "          + grasas);
        System.out.println("Calorias: "                             + calorias);
        System.out.println("Componente/s mayoritario/s: "           + CompMay);
    }
    
    /**
     * Devuelve el valor de las proteínas.
     */
    public float getProt()
    {
        return proteinas;
    }
    
    /**
     * Devuelve el valor de las carb.
     */
    public float getCarb()
    {
        return carbohidratos;
    }
    
    /**
     * Devuelve el valor de las grasas.
     */
    public float getGras()
    {
        return grasas;
    }
    
    /**
     * Devuelve el valor de las calorías.
     */
    public float getCal()
    {
        return calorias;
    }
}

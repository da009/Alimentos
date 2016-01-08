
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // Nombre del usuario.
    private String nombre;
    // Objeto de la clase alimento.
    private Alimento comida;
    // Gramos del alimento.
    private float gramos;
    // Proteínas del alimento.
    private float totalProteinas;
    // Carbohidratos del alimento.
    private float totalCarbohidratos;
    // Grasas del alimento.
    private float totalGrasas;
    // Calorias del alimento.
    private float totalCalorias;
    
    /**
     * Nombre del usuario.
     */
    public Usuario(String nombre)
    {
       this.nombre = nombre;
       this.gramos = 0;
    }
    
    /**
     * Constructor para el método "comer".
     */
    public void comer(Alimento comida, float gramos)
    {
        // Inicializa las variables a "0".
        this.totalProteinas = 0;
        this.totalCarbohidratos = 0;
        this.totalGrasas = 0;
        this.totalCalorias = 0;
        
        totalProteinas = totalProteinas + (comida.getProt()*(gramos/100));
        totalCarbohidratos = totalCarbohidratos + (comida.getCarb()*(gramos/100));
        totalGrasas = totalGrasas + (comida.getGras()*(gramos/100));
        totalCalorias = totalCalorias + (comida.getCal()*(gramos/100));
    }
    
    /**
     * Muestra los datos del usuario por pantalla.
     */
    public void mostrarDatos()
    {
        System.out.println("Nombre: "                                       + nombre);
        System.out.println("Gramos totales de proteinas ingeridos: "        + totalProteinas);
        System.out.println("Gramos totales de proteinas ingeridos: "        + totalCarbohidratos);
        System.out.println("Gramos totales de proteinas ingeridos: "        + totalGrasas);
        System.out.println("Calorias totales ingeridas:: "                  + totalCalorias);
    }
    
}

import java.util.ArrayList;

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
    // Calorías máximas.
    private float maxCal;
    // Nombre de la comida con más calorías
    private String nomMaxCal;
    // Calorías de la comida que acaba de ingerir.
    private float nuevaCom;
    // Arraylist para los alimentos consumidos.
    private ArrayList <Alimento>Cons;
    
    /**
     * Nombre del usuario.
     */
    public Usuario(String nombre)
    {
       this.nombre = nombre;
       this.gramos = 0;
       this.totalProteinas = 0;
       this.totalCarbohidratos = 0;
       this.totalGrasas = 0;
       this.totalCalorias = 0;
       this.maxCal = 0;
       Cons = new ArrayList<Alimento>();
    }
    
    /**
     * Constructor para el método "comer".
     */
    public void comer(Alimento comida, float gramos)
    {
        nuevaCom = comida.getCal()*(gramos/100);
        if (maxCal*(gramos/100) < nuevaCom)
        {
            maxCal = comida.getCal();
            nomMaxCal = comida.getNom();
        }
        totalProteinas = totalProteinas + (comida.getProt()*(gramos/100));
        totalCarbohidratos = totalCarbohidratos + (comida.getCarb()*(gramos/100));
        totalGrasas = totalGrasas + (comida.getGras()*(gramos/100));
        totalCalorias = totalCalorias + (comida.getCal()*(gramos/100));
        Cons.add(comida);
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
    
    /**
     * Método getter de calorías.
     */
    public float getCal()
    {
        return totalCalorias;
    }
    
    /**
     * Método getter para el nombre.
     */
    public String getNom()
    {
        return nombre;
    }
    
    /**
     * Método para comparar las calorías ingeridas por dos usuarios.
     */
    public void comparacion(Usuario user2)
    {
        String nombreComp = user2.getNom();
        float caloriasComp = user2.getCal();
        
        if (totalCalorias > caloriasComp)
        {
            System.out.println(nombre + " ha consumido más calorias que " + nombreComp + "(" + 
            totalCalorias + " frente a " + caloriasComp + ").");
        }
        else if (totalCalorias < caloriasComp)
        {
            System.out.println(nombreComp + " ha consumido más calorias que " + nombre + "(" + 
            caloriasComp + " frente a " + totalCalorias + ").");
        }
        else if (totalCalorias == caloriasComp)
        {
            System.out.println(nombre + " ha consumido las mismas calorias que " + nombreComp + "(" + 
            "ambos han consumido " + totalCalorias + ").");
        }
    }
    
    /**
     * Método que muestra el alimento con más calorias por cada 100 gramos.
     */
    public void MasCal()
    {
        System.out.println("Alimento más calórico ingerido por este usuario hasta el momento: " +
        nomMaxCal + " (" + maxCal + " calorias por cada 100 gramos)");
        if (maxCal == 0)
        {
            System.out.println("No se han consumido calorías");
        }
    }
    
    /**
     * Muestra los datos de un alimento consumido por el usuario y almacenados en un ArrayList.
     */
    public void DatAli(int PosNum)
    {
        if (PosNum > 0 && PosNum <= Cons.size())
        {
            Alimento Com;
            Com = Cons.get(PosNum-1);
            Com.mostrarDatos();
        }
        else 
        {
            System.out.println("No se ha introducido una posición válida");
        }
    }
}

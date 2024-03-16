package zooAnimales;

public class Pez extends Animal
{
    private Pez[] listado;
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    Pez() 
    {
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas)
    {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public int cantidadPeces() 
    {
        return salmones + bacalaos;
    }
    
    @Override
    public String movimiento() 
    {
        return "nadar";
    }

    public void crearSalmon() 
    {
        salmones++;
        Pez p1 = Pez(colorEscamas = "rojo", cantidadAletas = 6, habitat = "oceano");
    }

    public void crearBacalao() 
    {
        bacalaos++;
        Pez p2 = Pez(colorEscamas = "gris", cantidadAletas = 6, habitat = "oceano");
    }

    public void setColorEscamas(String colorEscamas)
    {
        this.colorEscamas = colorEscamas;
    }

    public void setCantidadAletas(String cantidadAletas)
    {
        this.cantidadAletas = cantidadAletas;
    }

    public String getColorEscamas()
    {
        return this.colorEscamas;
    }

    public String getCantidadAletas()
    {
        return this.cantidadAletas;
    }
}
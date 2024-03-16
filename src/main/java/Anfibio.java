package zooAnimales;

public class Anfibio extends Animal 
{
    private Anfibio[] listado;
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    Anfibio() 
    {
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) 
    {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;

    }

    public int cantidadAnfibios() 
    {
        return ranas + salamandras;
    }

    @Override
    public void movimiento() 
    {
        return "saltar"
    }

    public void crearRana() 
    {
        ranas++;
        Anfibio An1 = Anfibio (colorPiel = "rojo", venenoso = true, habitat = "selva")
    }

    public void crearSalamandra() 
    {
        salamandras++;
        Anfibio An2 = Anfibio (colorPiel = "negro y amarillo", venenoso = false, habitat = "selva")
    }

    public void setColorPiel(String colorPiel)
    {
        this.colorPiel = colorPiel;
    }

    public void setVenenoso(String venenoso)
    {
        this.venenoso = venenoso;
    }

    public String getColorPiel()
    {
        return this.colorPiel;
    }

    public String getVenenoso()
    {
        return this.venenoso;
    }
}
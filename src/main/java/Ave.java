package zooAnimales;

public class Ave extends Animal 
{
    private Ave[] listado;
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas; 

    Ave() 
    {
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) 
    {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public int cantidadAves()
    {
        return halcones + aguilas
    }
    
    @Override
    public String movimiento()
    {
        return "volar"
    }

    public void crearHalcon()
    {
        halcones++;
        Ave A1 = Ave(colorPlumas = "cafe glorioso", habitat = "montanas" )
    }

    public void crearAguila()
    {
        aguilas++;
                Ave A1 = Ave(colorPlumas = "blanco y amarillo", habitat = "montanas" )
    }

    public void setColorPlumas(String colorPlumas)
    {
        this.colorPlumas = colorPlumas;
    }

    public String getColorPlumas()
    {
        return this.colorPlumas;
    }
}
package gestion;

public class Zoologico
{
    private String nombre;
    private String ubicacion;
    private Zona[] zonas;

    Zoologico()
    {
    }

    public Zoologico (String nombre, String ubicacion)
    {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona[] zonas)
    {
        this.zonas = zonas;
    }
    public int cantidadTotalAnimales() 
    {
        return this.zonas.getAnimales;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion)
    {
        this.ubicacion = ubicacion;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getUbicacion()
    {
        return this.ubicacion;
    }
}

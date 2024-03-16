package gestion;

public class Zona
{
    private String nombre;
    private Zoologico[] zoo;
    private Animal[] animales;

    Zona() 
    {
    }

    public Zona (String nombre, Zoologico[1] zoo)
    {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal[] animales) 
    {
        animales.append(this.animales);
    }

    public int cantidadAnimales()
    {
        return this.animales
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setZoo(String zoo)
    {
        this.zoo = zoo;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getZoo()
    {
        return this.zoo;
    }

    public int getAnimales()
    {
        return this.animales;
    }
}
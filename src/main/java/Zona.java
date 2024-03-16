package gestion;
import zooAnimales.Animal;

public class Zona
{
    private String nombre;
    private Zoologico[] zoo;
    private Animal[] animales;

    Zona() 
    {
    }

    public Zona (String nombre, Zoologico[] zoo)
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
        return animales.size();
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getZoo()
    {
        return this.zoo;
    }

    public Zoologico[] getAnimales()
    {
        return this.animales;
    }
}
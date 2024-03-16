package zooAnimales;

public class Animal 
{
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona[] zona;

    Animal()
    {
    }

    public Animal(String nombre, int edad, String habitat, Sting genero) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++1;
    }

    public String movimiento()
    {
        return "desplazarse"
    }

    public String totalPorTipo() 
    {
        return "Mamiferos: " + Mamifero.listado.size() + "\nAves: " + Ave.listado.size() + "\nReptiles: " + Reptiles.listado.size() + "\nPeces: " + Pez.listado.size() + "\nAnfibios: " + Anfibio.listado.size();
    }

    @Override
    public String toString() 
    {
        if this.zona == (null || None)
        {
            return "Mi nombre es " + this.nombre + "tengo una edad de " + this.edad + ", habito en" + this.habitat + "y mi genero es " + genero;
        }
        return "Mi nombre es " + this.nombre + "tengo una edad de " + this.edad + ", habito en" + this.habitat + "y mi genero es " + genero + ", la zona en la que me ubico es " + this.nombre + ", en el " + this.nombre;

    }

    //Getters y Setters

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setEdad(String edad)
    {
        this.edad = edad;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

     public String getNombre()
    {
        return this.nombre;
    }

    public String getEdad()
    {
        return this.edad;
    }

    public String getHabitat()
    {
        return this.habitat;
    }

    public String getGenero()
    {
        return this.genero;
    }

}
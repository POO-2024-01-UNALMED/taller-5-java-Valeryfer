package zooAnimales;

public class Mamifero extends Animal
{
    private Mamifero[] listado;
    public static int caballos = 0;
    public static int leones = 0;
    private boolean pelaje;
    private int patas;

    Mamifero()
    {
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) 
    {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        this.listado = "Mamifero";
    }

    public int cantidadMamiferos()
    {
        return caballos + leones;
    }

    public void crearCaballo()
    {
        Mamifero m1 = Mamifero(pelaje = true, patas = 4, habitat = "pradera");
        caballos++;
    }

    public void crearLeon()
    {
        Mamifero m2 = Mamifero(pelaje = true, patas = 4, habitat = "selva");
        leones++;
    }

    public void setPelaje(String pelaje)
    {
        this.pelaje = pelaje;
    }

    public void setPatas(String patas)
    {
        this.patas = patas;
    }

    public String getPelaje()
    {
        return this.pelaje;
    }

    public String getPatas()
    {
        return this.patas;
    }

    public Mamifero[] getListado()
    {
        return this.listado;
    }
}

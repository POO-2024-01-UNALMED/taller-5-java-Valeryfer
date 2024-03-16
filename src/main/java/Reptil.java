package zooAnimales;

public class Reptil extends Animal
{
    private Reptil[] listado;
    public int static int iguanas = 0;
    public static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;

    Reptil()
    {
    }

    public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola)
    {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola
    }

    public int cantidadReptiles() 
    {
        return iguanas + serpientes;
    }   

    @Override
    public String movimiento() 
    {
        return "reptar"
    }

    public void crearIguana() 
    {
        Reptil R1 = Reptil(colorEscamas = "verde", largoCola = 3, habitat = "humedal" )
        iguanas++;
    }

    public void crearSerpiente() 
    {
        serpientes++;
        Reptil R2 = Reptil(colorEscamas = "blanco", largoCola = 1, habitat = "jungla" )

    }

    public void setColorEscamas(String colorEscamas)
    {
        this.colorEscamas = colorEscamas;
    }

    public void setLargoCola(String largoCola)
    {
        this.largoCola = largoCola;
    }

    public String getColorEscamas()
    {
        return this.colorEscamas;
    }

    public String getLargoCola()
    {
        return this.largoCola;
    }
}
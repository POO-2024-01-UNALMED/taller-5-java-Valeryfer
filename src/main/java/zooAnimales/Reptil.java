package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas = 0;
    public static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        this(null, 0, null, null, null, 0);
    }

    public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
		Reptil.listado.add(this);
    }

    public int cantidadReptiles() {
		return Reptil.listado.size();
    }   

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil Reptil = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return Reptil;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil Reptil = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return Reptil;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public static ArrayList<Reptil> getListado() {
		return listado;
	}

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }
}
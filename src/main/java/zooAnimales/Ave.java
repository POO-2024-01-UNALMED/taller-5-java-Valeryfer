package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas; 

   public Ave() {
        this(null, 0, null, null, null);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
    }

    public int cantidadAves() {
		return Ave.listado.size();
    }
    
    @Override
    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave Ave = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return Ave;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave Ave = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return Ave;
    }

    public static void setListado(ArrayList<Ave> listado) {
		Ave.listado=listado;
	}

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static ArrayList<Ave> getListado() {
		return listado;
	}

    public String getColorPlumas() {
        return this.colorPlumas;
    }
}
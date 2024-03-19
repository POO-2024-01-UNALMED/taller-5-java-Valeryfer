package zooAnimales;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        this(null, 0, null, null, null, false);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
		Anfibio.listado.add(this);
    }

    public int cantidadAnfibios() {
        return Anfibio.listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio Anfibio = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return Anfibio;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio Anfibio = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return Anfibio;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static ArrayList<Anfibio> getListado() {
		return listado;
	}

    public String getColorPiel() {
        return colorPiel;
    }

    public boolean getVenenoso() {
        return venenoso;
    }
}
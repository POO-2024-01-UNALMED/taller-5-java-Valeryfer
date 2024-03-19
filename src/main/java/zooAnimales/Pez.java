package zooAnimales;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        this(null, 0, null, null, null, 0);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
    }

    public int cantidadPeces() {
        return Pez.listado.size();
    }
    
    @Override
    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez Pez = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return Pez;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez Pez = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return Pez;
    }

    public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }
}
package gestion;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico() {
        this(null, null);
    }

    public Zoologico (String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }
    public int cantidadTotalAnimales()  {
        int totalAnimales = 0;
		for (Zona zonas : zonas) {
			totalAnimales += zonas.cantidadAnimales();
				
		}
		return totalAnimales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }
}
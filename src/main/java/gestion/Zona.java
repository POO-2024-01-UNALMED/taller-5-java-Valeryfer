package gestion;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico[] zoo;
    private ArrayList<Animal>animales= new ArrayList<>();
    
    public Zona() {
        this(null,null);
    }

    public Zona (String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        int cantAnimales = animales.size();
        return cantAnimales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }


    public String getNombre() {
        return nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }
}
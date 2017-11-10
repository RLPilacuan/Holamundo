package ec.edu.espe.arreglos.modelo;

public class Animal {
    private String name;
    private String eyes;
    private int id;

    public String getName() {
        return name;
    }

    public String getEyes() {
        return eyes;
    }

    public int getId() {
        return id;
    }

    public Animal(String name, String eyes, int id) {
        this.name = name;
        this.eyes = eyes;
        this.id = id;
    }
    
    
}

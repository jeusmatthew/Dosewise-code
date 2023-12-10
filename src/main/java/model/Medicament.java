package model;

public class Medicament {
    private int id;
    private String name;
    private String description;
    private String compound;

    public Medicament() {

    }

    public Medicament(int id, String name, String description, String compound) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.compound = compound;
    }

    public Medicament(String name, String description, String compound) {
        this.name = name;
        this.description = description;
        this.compound = compound;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

}

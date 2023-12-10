package model;

public class Medicament {
    private String name;
    private String description;
    private String compound;

    public Medicament(String name, String description, String compound) {
        this.name = name;
        this.description = description;
        this.compound = compound;
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

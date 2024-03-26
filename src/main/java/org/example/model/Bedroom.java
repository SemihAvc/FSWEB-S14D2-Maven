package org.example.model;

public class Bedroom extends Room {

    private String name;
    private  Bed bed;
private  Wardrobe wardrobe;

    public Bedroom(Wall walls1, Wall walls2, Wall walls3, Wall walls4, Ceiling ceiling, Lamp lamp, Carpet carpet, String name, Bed bed, Wardrobe wardrobe) {
        super(walls1, walls2, walls3, walls4, ceiling, lamp, carpet);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                '}';
    }
}

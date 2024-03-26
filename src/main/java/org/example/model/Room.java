package org.example.model;

import java.util.Arrays;

public class Room {

    private  Wall[] walls;
    private  Wall walls1;
    private  Wall walls2;
    private  Wall walls3;
    private  Wall walls4;
    private  Ceiling ceiling;
    private  Lamp lamp;
    private  Carpet carpet;


    public Room(Wall walls1, Wall walls2, Wall walls3, Wall walls4, Ceiling ceiling, Lamp lamp, Carpet carpet) {
        this.walls1 = walls1;
        this.walls2 = walls2;
        this.walls3 = walls3;
        this.walls4 = walls4;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.carpet = carpet;
    }

    public Wall getWalls1() {
        return walls1;
    }

    public Wall getWalls2() {
        return walls2;
    }

    public Wall getWalls3() {
        return walls3;
    }

    public Wall getWalls4() {
        return walls4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + Arrays.toString(walls) +
                ", walls1=" + walls1 +
                ", walls2=" + walls2 +
                ", walls3=" + walls3 +
                ", walls4=" + walls4 +
                ", ceiling=" + ceiling +
                ", lamp=" + lamp +
                ", carpet=" + carpet +
                '}';
    }
}

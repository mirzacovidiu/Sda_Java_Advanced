package com.sda.lectia2.ex1_planetarium;

public enum Planet {

    MERCURY("huge planet", " Mercury", 50000L),
    VENUS("love  planet", " Venus", 2000000L),
    EARTH("life planet", " Earth", 0L),
    JUPITER("gas planet", " Jupiter", 7000000L),
    URANUS("metan planet", " Uranus", 10000000L ),
    PLUTO("small planet", " Pluto", 20000000L),
    URANUS2("metan planet", " Uranus", 10000000L );


    private final String size;
    private final String name;
    private final Long distanceFromEarth;

    Planet(String size, String name, Long distanceFromEarth){
        this.size = size;
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;

    }

    @Override
    public String toString() {
        return name + size;
    }

    public Long getDistanceFromEarth() {
        return distanceFromEarth;
    }
}

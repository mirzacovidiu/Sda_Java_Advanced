package com.sda.lectia2.ex1_planetarium;

public class Main {

    public static void main(String[] args){

        for(Planet planet:Planet.values()){

            System.out.println(planet);
            System.out.println(planet.name());
            System.out.println(planet.getDistanceFromEarth());
        }

        Planet planetX = Planet.valueOf("URANUS2");
        switch (planetX){
            case EARTH :
                System.out.println("This is Earth");
                break;
            case JUPITER:
            case PLUTO:
            case VENUS:
            case URANUS:
            case MERCURY:
                System.out.println("This is another planet. Go back home or try to live.");

                break;
            default:
                System.out.println("This is not handled");
        }




    }

}

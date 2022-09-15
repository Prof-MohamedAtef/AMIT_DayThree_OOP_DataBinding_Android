package mo.atef.amit.daythree.daythree.oop.engines;

public class Engine extends Shaping implements listener {
    public String EngineType;
    public int NumOfCylinders;
    int Gears;
    float CylinderVolume;
    int MaximumEnginePower;


    /*
    Polymorphism : overriding/overloading
     */

    public static int startEngine(int x, int y, String m, String z){
        return 1;
    }

    private int startEngine(String z, int x, int y, String m){
        return 0;
    }

    private int stopEngine(){
        return -1;
    }


    @Override
    public int square(int width) {
        return 0;
    }

    @Override
    public int calculate() {
        return 0;
    }
}
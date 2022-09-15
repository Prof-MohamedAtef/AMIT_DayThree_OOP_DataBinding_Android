package mo.atef.amit.daythree.daythree.oop.engines;

public class Electricity extends Engine {


    int startEngine(String z, int x, int y, String m){
        return 2;
    }


    public boolean apply(int finalResult){
        returnResult(startEngine(3,4,"ss","rr"));
        return true;
    }

    public int returnResult(int startResult){
        int result=startResult*8;
        return result;
    }
}

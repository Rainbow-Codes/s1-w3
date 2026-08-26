public class CandyJar{
    private int amtFull;

    public CandyJar(){
    amtFull = 10;
    }

    public CandyJar(int amt){
        amtFull = amt;
    }

    public void eat(int amt){
        amtFull -= amt;
    }

    public void refill(int amt){
        amtFull += amt;
    }

    public int count(){
        return amtFull;
    }
}
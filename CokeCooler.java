public class CokeCooler {
    private int numCokes;

    public CokeCooler(){
        numCokes = 100;
    }

    public CokeCooler(int amt){
        numCokes = amt;
    }

    public void drink(int amt){
        numCokes -= amt;
    }

    public void refill(int amt){
        numCokes += amt;
    }

    public int cokeCount(){
        return numCokes;
    }

}

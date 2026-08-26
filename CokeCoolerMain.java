public class CokeCoolerMain {
    public static void main(String[] args){
        CokeCooler c1 = new CokeCooler();
        CokeCooler c2 = new CokeCooler(1000);


        c1.refill(27);
        c2.drink(200);

        System.out.println("Num Cokes in c1: "+c1.cokeCount());
        System.out.println("Num Cokes in c2: "+c2.cokeCount());
    }
}

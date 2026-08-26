public class CandyJarMain {
    public static void main(String[] args){
        CandyJar jar1 = new CandyJar();
        CandyJar jar2 = new CandyJar(23);

        System.out.println("Jar 1 ammount: "+jar1.count());
        System.out.println("Jar 2 ammount: "+jar2.count());

        jar1.eat(10);
        jar2.refill(2006);

        System.out.println("Jar 1 ammount: "+jar1.count());
        System.out.println("Jar 2 ammount: "+jar2.count());

    }

}

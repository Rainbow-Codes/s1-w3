public class ScoreMain {
    public static void main(String[] args) {
        Score s = new Score();
        Score s2 = new Score(68);

        s.increase(40);
        s2.decrease(12);

        System.out.println("s curScore: "+s.curScore());
        System.out.println("s2 curScore: "+s2.curScore());
    }
}

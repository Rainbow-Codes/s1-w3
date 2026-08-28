public class Score {
    private int score;
    
    public Score(){
        score = 50;
    }

    public Score(int currentScore){
        score = currentScore;
    }

    public void increase(int amt){
        score += amt;
    }
    public void decrease(int amt){
        score -= amt;
    }

    public int curScore(){
        return score;
    }

}

package NCR.jbcz.L410;

/**
 * Created by dell on 2018/2/19.
 */
public class ReturnStatement {
    String evaluate(int score) {
        String s;
        if (score >= 90) {
            s = "成绩优异";
        } else if (score >= 80) {
            s = "成绩优良";
        } else if (score >= 70) {
            s = "成绩中等";
        } else if (score >= 60) {
            s = "成绩合格";
        } else {
            s = "成绩不合格";
        }
        return s;
    }

    public static void main(String[] args) {
        int score = (int) (Math.random() * 100);
        System.out.println(score);
        ReturnStatement returnStatement = new ReturnStatement();
        System.out.println(returnStatement.evaluate(score));
    }
}

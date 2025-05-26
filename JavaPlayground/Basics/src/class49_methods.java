public class class49_methods {
    public static void main(String[] args) {
        String name[] = {"Kevin", "Jasleen", "Qi", "Toan", "Habibi"};
        int    score[] = {300, 500, 600, 1100, 150};

        for (int i=0; i<name.length; i++)
        {
            displayHighScorePosition(name[i], calculateHighScorePosition(score[i]));
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position+ " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int result = 4;

        if (score >= 1000) {
            result = 1;
        }
        else if (score >= 500) {
            result = 2;
        }
        else if (score >= 100) {
            result = 3;
        }

        return result;
    }
}

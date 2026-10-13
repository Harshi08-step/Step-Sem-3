
import java.util.Arrays;

public class FantasyTeamScoreMultiplier {

    static void applyMultipliers(double[] playerScores,
                                 int captainIndex,
                                 int viceCaptainIndex) {

        // Captain receives 2x points
        playerScores[captainIndex] *= 2.0;

        // Vice-captain receives 1.5x points
        playerScores[viceCaptainIndex] *= 1.5;
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};

        applyMultipliers(scores, 1, 3);

        System.out.println(Arrays.toString(scores));
    }
}


import java.util.Scanner;

public class MatchDayGridAnalyzer {

    private static double rowAverage(int[] row) {
        int sum = 0;

        for (int runs : row) {
            sum += runs;
        }

        return (double) sum / row.length;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < runsPerOver.length; i++) {
            // Calculate the average once for each match
            double average = rowAverage(runsPerOver[i]);

            if (i > 0) {
                result.append(" | ");
            }

            result.append("Match ").append(i).append(": ");

            if (average >= threshold) {
                result.append("Power Surge");
            } else {
                result.append("Normal");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of matches: ");
        int matches = sc.nextInt();

        System.out.print("Enter number of overs per match: ");
        int overs = sc.nextInt();

        int[][] runsPerOver = new int[matches][overs];

        for (int i = 0; i < matches; i++) {
            System.out.println("Enter runs for Match " + i + ":");

            for (int j = 0; j < overs; j++) {
                runsPerOver[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        System.out.println(classifyMatches(runsPerOver, threshold));

        sc.close();
    }
}


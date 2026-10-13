
import java.util.Arrays;

class Player implements Comparable<Player> {
    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public Player(String name, int matchesPlayed,
                  double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Rule 1: Established players qualify through experience
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 15;
    }

    // Rule 2: Other players need experience and fitness
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(Player other) {
        // Sort by batting average in descending order
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    public String getName() {
        return name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public boolean isInjured() {
        return injured;
    }

    static String draftAndRank(Player[] players) {
        Player[] draftable = new Player[players.length];
        int count = 0;

        for (Player player : players) {
            if (isDraftable(player.getMatchesPlayed()) ||
                isDraftable(player.getMatchesPlayed(), player.isInjured())) {
                draftable[count] = player;
                count++;
            }
        }

        // Sort only the draftable players
        draftable = Arrays.copyOf(draftable, count);
        Arrays.sort(draftable);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) {
                result.append(" | ");
            }

            result.append(i + 1)
                  .append(". ")
                  .append(draftable[i].getName());
        }

        return result.toString();
    }
}

public class FantasyLeagueAutoDraftRankingEngine {
    public static void main(String[] args) {
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };

        System.out.println(Player.draftAndRank(players));
    }
}

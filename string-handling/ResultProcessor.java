import java.util.TreeMap;

class ResultProcessor {
    private double average;
    private TreeMap<String, Integer> result;
    private String highestScorer;
    private static final String formatString = "%-10s | %d\n";

    ResultProcessor(String input) {
        int maxScore = Integer.MIN_VALUE;
        result = new TreeMap<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            String[] entry = part.split(":");
            String name = entry[0].trim();
            int score = Integer.parseInt(entry[1].trim());
            average += score;
            result.put(name, score);
            if (score > maxScore) {
                maxScore = score;
                highestScorer = name;
            }
        }
        average /= result.size();
    }

    public String getAverage() {
        return String.format("%.2f", average);
    }

    public String getHighestScorer() {
        return highestScorer + " with a score of " + result.get(highestScorer);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Average Score: ").append(getAverage()).append("\n");
        sb.append("Highest Scorer: ").append(getHighestScorer()).append("\n");
        sb.append("Scores:\n");
        sb.append(String.format("%-10s | %s\n", "Name", "Score"));
        sb.append("-------------------\n");
        for (String name : result.keySet()) {
            sb.append(String.format(formatString, name, result.get(name)));
        }
        return sb.toString();
    }

}
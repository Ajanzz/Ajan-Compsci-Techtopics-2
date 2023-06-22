import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<QuizSection> sections;

    public Quiz() {
        sections = new ArrayList<>();
    }

    public void addSection(QuizSection section) {
        sections.add(section);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        for (QuizSection section : sections) {
            section.displaySection();
            section.displayInformation();
            totalScore += section.takeQuiz(scanner);
        }

        System.out.println("=== SCORE ===");
        System.out.println("Total Score: " + totalScore + " out of " + (sections.size() * 3));

        scanner.close();
    }
}

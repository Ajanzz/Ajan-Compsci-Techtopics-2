import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizSection {
    private String title;
    private String information;
    private List<String> questions;
    private List<List<String>> choices;
    private List<Integer> answers;

    public QuizSection(String title) {
        this.title = title;
        questions = new ArrayList<>();
        choices = new ArrayList<>();
        answers = new ArrayList<>();
    }

    public void addInformation(String information) {
        this.information = information;
    }

    public void addQuestion(String question) {
        questions.add(question);
        choices.add(new ArrayList<>());
    }

    public void addChoice(String choice) {
        choices.get(choices.size() - 1).add(choice);
    }

    public void setAnswer(int answer) {
        answers.add(answer);
    }

    public void displaySection() {
        System.out.println(title);
        System.out.println("---------------------");
    }

    public void displayInformation() {
        System.out.println(information);
        System.out.println();
    }

    public int takeQuiz(Scanner scanner) {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i));

            List<String> choiceList = choices.get(i);
            for (int j = 0; j < choiceList.size(); j++) {
                System.out.println((char) ('A' + j) + ") " + choiceList.get(j));
            }

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.length() > 0) {
                int answerIndex = userAnswer.charAt(0) - 'A';

                if (answerIndex >= 0 && answerIndex < choiceList.size()) {
                    if (answerIndex == answers.get(i)) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Incorrect!");
                    }
                    System.out.println();
                }
            }
        }

        return score;
    }
}

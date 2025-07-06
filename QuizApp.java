import java.util.*;

public class QuizApp {

    static class Question {
        String questionText;
        String[] options;
        int correctOption;

        Question(String questionText, String[] options, int correctOption) {
            this.questionText = questionText;
            this.options = options;
            this.correctOption = correctOption;
        }

        boolean isCorrect(int userAnswer) {
            return userAnswer == correctOption;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();

        // Anime Questions
        questions.add(new Question(
            "Who is the main protagonist in Naruto?",
            new String[]{"1. Sasuke Uchiha", "2. Naruto Uzumaki", "3. Kakashi Hatake", "4. Itachi Uchiha"},
            2
        ));

        questions.add(new Question(
            "What is the name of the pirate crew led by Luffy in One Piece?",
            new String[]{"1. Blackbeard Pirates", "2. Marine Fleet", "3. Straw Hat Pirates", "4. Red Hair Pirates"},
            3
        ));

        questions.add(new Question(
            "Which anime features a notebook that can kill people?",
            new String[]{"1. Death Note", "2. Bleach", "3. Tokyo Ghoul", "4. Attack on Titan"},
            1
        ));

        // India Questions
        questions.add(new Question(
            "Who was the first Prime Minister of India?",
            new String[]{"1. Sardar Patel", "2. Mahatma Gandhi", "3. Jawaharlal Nehru", "4. B. R. Ambedkar"},
            3
        ));

        questions.add(new Question(
            "Which is the national animal of India?",
            new String[]{"1. Elephant", "2. Lion", "3. Tiger", "4. Leopard"},
            3
        ));

        questions.add(new Question(
            "Which city is known as the 'Pink City' of India?",
            new String[]{"1. Jaipur", "2. Delhi", "3. Mumbai", "4. Udaipur"},
            1
        ));

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            if (q.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: Option " + q.correctOption);
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.size());

        scanner.close();
    }
}

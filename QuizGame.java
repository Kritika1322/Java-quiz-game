// QUIZ GAME!! 
import java.util.Scanner;

public class QuizGame{

    static String getGrade(int score) {
        if (score == 10) {
            return "A+";
        } else if (score >= 8) {
            return "A";
        } else if (score >= 6) {
            return "B";
        } else if (score >= 4) {
            return "C";
        } else {
            return "F";
        }
    }
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Welcome to the Ultimate Quiz Game!");
        System.out.println("========================================"); 

        System.out.println("Enter your name: ");
        String playername=scanner.nextLine();
        System.out.println("Hello, " + playername +"! Let's get started!");

        String [] questions = {
            "What is the capital of France?",
            "What is 8x7?",
            "What is the largest planet in our solar system?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for water?", 
            "What is the tallest mountain in the world?",
            "Who painted the Mona Lisa?",
            "What is the smallest prime number?",
            "What is the currency of Japan?",
            "Who is the current president of the United States?"
        };

        String [] options = {
            "A) Paris  B) London  C) Berlin  D) Madrid",
            "A) 54  B) 56  C) 64  D) 72",
            "A) Earth  B) Jupiter  C) Saturn  D) Mars",
            "A) William Shakespeare  B) Charles Dickens  C) Mark Twain  D) Jane Austen",
            "A) H2O  B) CO2  C) O2  D) NaCl",
            "A) Mount Everest  B) K2  C) Kangchenjunga  D) Lhotse",
            "A) Leonardo da Vinci  B) Vincent van Gogh  C) Pablo Picasso  D) Michelangelo",
            "A) 0  B) 1  C) 2  D) 3",
            "A) Yen  B) Dollar  C) Euro  D) Pound",
            "A) Joe Biden  B) Donald Trump  C) Barack Obama  D) George Bush"
        };

        String[] answers = {"A", "B", "B", "A", "A", "A", "A", "C", "A", "B"};

        int score = 0;
        
        for (int i=0; i<questions.length; i++){
            System.out.println("Question " + (i+1) + " of " + questions.length + ": ");
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(answers[i])){
                System.out.println("Correct! Well done, " + playername + "!");
                score++;
            } 
            else {
                System.out.println("Wrong! The correct answer is: " + answers[i]);
            }
        }
        
        System.out.println("========================================");
        System.out.println("Quiz Over! Your final score is: " + score + " out of " + questions.length);
        System.out.println("Grade: " + getGrade(score));
        System.out.println("========================================"); 

        if (score == questions.length) {
            System.out.println("Congratulations, " + playername + "! You aced the quiz with a perfect score!");
        } 
        else if (score >= 7) {
            System.out.println("Great job, " + playername + "! You did really well!");
        } 
        else if (score >= 5) {
            System.out.println("Good effort, " + playername + "! Keep practicing to improve your score.");
        } 
        else {
            System.out.println("Don't worry, " + playername + "! Keep learning and you'll do better next time.");
        }
        scanner.close();
    }
}

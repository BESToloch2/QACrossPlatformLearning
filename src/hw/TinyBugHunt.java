package hw;

public class TinyBugHunt {
    public static void main(String[] args) {
                int score = 85;

                // Определяем оценку
                if (score == 100) {                 // ①
                    System.out.println("Perfect!");
                } else if (score >= 90) {         // ②
                    System.out.println("A");
                } else if (score >= 80) {
                    System.out.println("B");
                } else if (score >= 70 ) {
                    System.out.println("C");
                } else {
                    System.out.println("Needs improvement");
                }
            }
        }

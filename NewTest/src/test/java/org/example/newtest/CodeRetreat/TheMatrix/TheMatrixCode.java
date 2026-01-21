package org.example.newtest.CodeRetreat.TheMatrix;

public class TheMatrixCode {
    public static void main(String[] args) {
        TheMatrix matrix = TheMatrix.getInstance();

        Human neo = new Human("Нео");
        Human morpheus = new Human("Морфеус");
        Human trinity = new Human("Тринити");

        matrix.connect(neo);
        matrix.connect(morpheus);
        matrix.connect(trinity);

        printMatrixHeader();

        try {
            morpheus.takePill("red");
            trinity.takePill("red");
            Thread.sleep(1000);

            neo.takePill("red");
            System.out.println("\nПодключённые в системе: " + matrix.getConnected());
            System.out.println("\nНео учится гнуть ложки...");
            for (int i = 0; i < 5; i++) {
                System.out.println("There is no spoon");
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println("\nНео: <<Я заню кунг-фу.>>");
        } catch (SystemCrashException e) {
            System.err.println(e.getMessage());
        } catch (AgentSmithException e) {
            System.err.println(e.getMessage());
        } catch (InterruptedException ignored) {
        }
        matrix.crash();
        System.out.println("\n[SYSTEM] Матрица перезагружается...");
        System.out.println("[SUCCESS] Ты - Избранный.");
    }

    private static void printMatrixHeader() {
        System.out.println("""
                ██████████████████████████████████████
                █ THE MATRIX HAS YOU...              █
                █ Follow the white rabbit.           █
                █ Knock knock, Neo.                  █
                ██████████████████████████████████████
                """);
    }
}
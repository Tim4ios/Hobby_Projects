import java.util.Random;
public class Door_Generator {
    Boolean A,B,C;
    public Door_Generator() {
        Random rand = new Random();
        //creates a random number between 0-2
        int random = rand.nextInt(3);
        A = false;
        B = false;
        C = false;
        switch (random) {
            case 0 -> A = true;
            case 1 -> B = true;
            case 2 -> C = true;
            default -> System.out.println("Something went wrong when generating the doors");
        }
        }
    }

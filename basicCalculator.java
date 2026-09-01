import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args){
        //Define scanner object using "new".
        Scanner in = new Scanner(System.in);
        boolean running = true;
        String answer;
        while (running) {
            System.out.println("E - exit");
            System.out.println("+ - addition");
            answer = in.nextLine();
            if (answer.equals("E")){
                running = false;
            }
            else if (answer.equals("+")) {
                System.out.println(in.nextFloat()+in.nextFloat());
            }
        }
    }
}

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args){
        //Define scanner object using "new".
        Scanner in = new Scanner(System.in);

        String answer;
        float total;

        outerLoop: while (true) {
            System.out.println("E - exit");
            System.out.println("+ - addition");
            System.out.println("* - multiplication");
            answer = in.nextLine();
            switch (answer) {
                case "E":
                    break outerLoop; //Stop while statement.
                case "+":
                    total = 0; //Define total variable.
                    answer = "0"; //Put answer in 0 to be able to turn into float.
                    while (!answer.equals("S")) {
                        total += Float.parseFloat(answer); //Puts answer to total. At the start it is always 0+0.
                        System.out.print("Insert number or S to stop:  ");
                        answer = in.nextLine();
                    }
                    System.out.println(total); //Print final answer.
                    System.out.println("Click enter to continue");
                    in.nextLine();
                    break;
                case "*":
                    total = 1; //Define total variable.
                    answer = "1"; //Put answer in 0 to be able to turn into float.
                    while (!answer.equals("S")) {
                        total *= Float.parseFloat(answer); //Puts answer to total. At the start it is always 0+0.
                        System.out.print("Insert number or S to stop:  ");
                        answer = in.nextLine();
                    }
                    System.out.println(total); //Print final answer.
                    System.out.println("Click enter to continue");
                    in.nextLine();
                    break;
            }
        }
    }
}
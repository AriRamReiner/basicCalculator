import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args){
        //Define scanner object using "new".
        Scanner in = new Scanner(System.in);
        String answer;
        while (true) {
            System.out.println("E - exit");
            System.out.println("+ - addition");
            answer = in.nextLine();
            if (answer.equals("E")){
                break; //Stop while statement.
            }
            else if (answer.equals("+")) {
                float total = 0; //Define total variable.
                answer = "0"; //Put answer in 0 to be able to turn into float.
                while (!answer.equals("S")) {
                    total += Float.parseFloat(answer); //Puts answer to total. At the start it is always 0+0.
                    System.out.print("Insert number or S to stop:  ");
                    answer = in.nextLine();
                }
                System.out.println(total); //Print final answer.
            }
        }
    }
}

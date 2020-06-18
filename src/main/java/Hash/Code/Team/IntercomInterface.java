package Hash.Code.Team;

import java.util.Scanner;

public class IntercomInterface {

    private Intercom intercom;
    private Scanner scanner;

    public IntercomInterface(Intercom intercom) {
        this.intercom = intercom;
        scanner = new Scanner(System.in);
    }

    public void startInterface() {
        boolean inLoop = true;

        while (inLoop) {
            System.out.println("Please");


        }
    }

    private int scanInt(String instruction) {
        int input = 0;
        boolean inLoop = true;

        while (inLoop) {
            try {
                System.out.println(instruction);
                input = scanner.nextInt();
                scanner.nextLine();
            }
            catch (Exception e) {
                System.out.println("Wrong input!\n");
                scanner.nextLine();
            }
        }
        return input;
    }
}

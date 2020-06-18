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
            inLoop = operateNumberTyping();
        }
    }

    private int scanInt(String instruction) {
        int input = 0;
        boolean inLoop = true;

        while (inLoop) {
            try {
                System.out.println("\n" + instruction);
                input = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            catch (Exception e) {
                System.out.println("\nWrong input!");
                scanner.nextLine();
            }
        }
        return input;
    }

    private boolean operateNumberTyping() {
        int flatNumber = scanInt("Please type flat number:");
        boolean isNumberValid = isNumberValid(flatNumber);

        if (flatNumber == 9999) {
            System.out.println("\nIntercom turned off...");
            return false;
        } else if (isNumberValid) {
            int pinCode = scanInt("Please type PIN code or type '0' to connect with the flat:");

            if (pinCode == 0) {
                System.out.println("\nIntercom is connecting with flat " + flatNumber + "...");
                wait(2000);
                System.out.println("\n" + intercomResponse(intercom.open(flatNumber)));
            } else {
                wait(1000);
                System.out.println("\n" + intercomResponse(intercom.open(flatNumber, pinCode)));
            }
            return true;
        } else {
            System.out.println("\nFlat " + flatNumber + " not found...");
            return true;
        }
    }

    private boolean isNumberValid(int flatNumber) {
        for (Inhabitant inhabitant : intercom.getInhabitants()) {
            if (inhabitant.getFlatNumber() == flatNumber) {
                return true;
            }
        }
        return false;
    }

    private String intercomResponse(boolean isOpen) {
        if (isOpen) {
            return "Door has been opened.";
        }
        return "Nothing happened...";
    }

    private void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

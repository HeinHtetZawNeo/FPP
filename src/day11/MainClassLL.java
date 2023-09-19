package day11;

import java.util.*;

public class MainClassLL {
    LinkedList<Character> list; // Creating reference.
    LinkedList<Character> A1;
    LinkedList<Character> B1;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new MainClassLL();
    }

    MainClassLL(){
System.out.println("I am here too");

        while(true) {
            mainMenu();
            String commandSelection = sc.nextLine().toUpperCase();
            switch (commandSelection) {
                case "R" -> {
                       readString();
                }
                case "C" -> {
                       // concatenateString();  to be implemented.
                }
                case "W" -> {
                      System.out.println(writeString());
                }
                case "Q" -> System.exit(1);
                default -> {
                    return;
                }
            }
        }


    } // End of main


    // Reads in string A from the terminal
    public void readString() {
    	System.out.println("I am here");
        boolean flag2 = true;
        while (flag2) {
            inputSelection();
            String selection2 = sc.next().toUpperCase();
            switch (selection2) {
                case "A" -> {
                    System.out.print("Enter text of A: ");
                    String A = sc.next();
                    A1 = processString(A);
                }

                case "B" -> {
                    System.out.print("Enter text of B: ");
                    String B = sc.next();
                    B1 = processString(B);
                }
                //case "M" -> new MainClassLL();
                case "Q" -> System.exit(1);

                // default -> mainMenu();

            }

        } // End of While Loop
    }// End of read String() method


    // Process and add characters from input String to LinkedList
    public LinkedList<Character> processString(String s){
        list = new LinkedList<Character>();
        for (int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            list.addLast(c);
        }
        return list;
    }

    private String concatenateString(LinkedList<String> s1, LinkedList<String> s2) {
        return ""; // To be implemented later.
    }


    // Iterating through the list and write to the terminal.
    public String writeString(){
        String next2 = null;
        Iterator<Character> iterator1 = list.iterator();
        while(iterator1.hasNext()){
            next2 = String.valueOf(iterator1.next());
            // System.out.print(next2);
        }
        return next2;
    }

    public void mainMenu(){
        System.out.println("\n");
        System.out.println("-".repeat(33));
        System.out.println("Developer: Geoffrey Duncan Opiyo");
        System.out.println("Maharishi International University.");
        System.out.println("-".repeat(33));

        String textBlock = """
                AVAILABLE ACTIONS:
                ==================
               
                R - Enter command->R (* read in string *)
                C - Enter command->C (* concatenate b to a *)
                W - Enter command->W (* write out string a *)
                Q - Enter command->Q (* Quits program *)
                
                Make a selection (R/Q):""";

        System.out.println(textBlock + " ");
    }

    public void inputSelection(){
        System.out.println("\n");

        String textBlock = """
                AVAILABLE OPTIONS:
                ==================
               
                A - Enter string name ->A
                B - Enter string name ->B
                Q - Enter command->Q (* Quits program *)
                Make a selection (A/B/Q):""";

        System.out.println(textBlock + " ");
    }


} // End of class.

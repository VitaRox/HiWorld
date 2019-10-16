import java.io.*;


/* A simple class designed to take in user input via the console until
 * user is finished, at which point they enter 'done' and the program
 * prints out a string of the entire input the user typed.
 * @author VitaRox
 * @version 1.0
 */
public class HiWorld {

    // This is the operative method that does the work of the program.
    public static void takeUserInput() {
        String userIn = "";
        String userOut = "";

        while (!userIn.equals("done")) {

            try {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Please enter some shit: ");
                userIn = br.readLine();

                if (userIn.equals("done")) {
                    System.out.println("Here is the probably-vulgar nonsense you typed: ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    System.out.printf("%-10s",userOut);
                } else {
                    userOut += userIn + "/\n";
                }

            } catch (IOException ioe) {
                System.err.println("Whoops!");
            }
        }
    }

    // This calls the above method;
    // They were written separately in this version for modularity's sake.
    public static void main(String[] args) {
        takeUserInput();
    }
}






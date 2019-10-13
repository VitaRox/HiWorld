import java.io.*;


/* A simple class designed to take in user input via the console until
 * user is finished, at which point they enter 'done' and the program
 * prints out a string of the entire input the user typed.
 * @author VitaRox
 * @version 1.0
 */
public class HiWorld {

    public static void takeUserInput() {
        String userIn = " ";
        String userOut = " ";

        while (!userIn.equals("done")) {

            try {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Please enter some shit: ");
                userIn = br.readLine();

                if (userIn.equals("done")) {
                    System.out.println(userOut);
                } else {
                    userOut = userOut.concat(userIn);
                }

            } catch (IOException ioe) {
                System.err.println("Whoops!");
            }
        }
    }

    public static void main(String[] args) {
        //takeUserInput();
    }
}
}





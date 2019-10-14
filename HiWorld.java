import java.io.*;



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
        takeUserInput();
    }
}
}





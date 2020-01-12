import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    private static String getInput(String value) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(value);
        System.err.flush();

        try{
            return buffer.readLine();
        } catch (Exception e) {
            return "Error";
        }
    }

    public static int getInt(String value){
        String in = getInput(value);
        return Integer.parseInt(in);
    }
}

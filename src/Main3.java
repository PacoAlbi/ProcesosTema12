import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) {

        String [] comando = new String[];

        comando =

        ProcessBuilder pb = new ProcessBuilder(args);
        File directorio = new File("C:\\Users\\falbinana\\IdeaProjects\\ProcesosTema1\\src\\Ejercicios");
        pb.directory(directorio);
        pb.inheritIO();


        try {
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
    public static void main(String[] x) {

        if (x.length !=1) {
            System.out.println("Se debe especificar un unico valor que represente" +
                    "el numero del puerto");
            System.exit(1);
        }
         int puerto = Integer.parseInt(x[0]);
            try {
                ServerSocket server = new ServerSocket(puerto);

                while(true) {

                    Socket client =server.accept();
                    new Hilo(client).start();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

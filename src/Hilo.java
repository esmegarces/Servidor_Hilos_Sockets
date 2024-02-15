import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Hilo extends Thread{

    private Socket socket;

    public Hilo(Socket socket){
        this.socket = socket;
    }

    public void run(){

        // Aqui va a ir todo el codigo para leerr y escribrir a través de los flujos de entrada y salida
try {


        BufferedReader entrada = new BufferedReader(
          new InputStreamReader(socket.getInputStream())
        );
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
        String lectura;

        while (true){
            lectura = entrada.readLine();
            System.out.println(lectura);
            salida.println("Soy el servidor");
        }


    }catch (Exception e){

}
    }
}

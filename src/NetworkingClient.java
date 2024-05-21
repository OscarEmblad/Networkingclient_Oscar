import java.io.*;
import java.net.ServerSocket;

public class NetworkingClient {
    public static void main(String [] args) {
        ServerSocket server = null;
        Socket client;

        //Default port number we going to use
        int portnumber = 1234;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);

        }
    //Create Server side socket
        try {
            server = new ServerSocket(portnumber);

        } catch (IOException ie) {
            System.out.println("Cannot open socket.");
            System.exit(1);
        }
        System.out.println("ServerSocket is created." + server);

        //Wait for the data from the client and reply
        while (true) {
            System.out.println("Waiting for connect request...");
            client = server.accept();

            System.out.println("Connect request is accepted");
            String clientHost = client.getOnetAdress().getHostAdress;
            int clientPort = client.getPort();
            System.out.println("Client host = " + clientHost + "Client port = " + clientPort);

            //Read data from the client
            InputStream clientIn = client.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
            String msgFromClient = br.readLine();
            System.out.println("Message recieved from client = " + msgFromClient);

            //Send respons to the client
            if (msgFromClient) != null && ! msgFromClient.equalsIgnoreCase("Bye")) {
                OutputStream clientOut = client.getOutputStream();


            }

        }
    }

}

package org.choongang;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("172.0.0.1",  9999);
        Scanner sc = new Scanner(System.in);

        while (true){
            try(DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
                System.out.print("메세지: ");
                String message = sc.nextLine();
                dos.writeUTF(message);
            }//try

        }//while
    }
}

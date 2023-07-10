package Messenger.main;
import Messenger.controller.*;
public class ServerRun {

    public static void main(String[] args) {
        ServerControl controller = new ServerControl(1234, 5, "serverRMI", 1099);
        controller.listening();
    }
}

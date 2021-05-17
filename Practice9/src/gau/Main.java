package gau;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cleint cleint = new Cleint();
        Server server = new Server();
        cleint.start();
        server.start();
    }
}

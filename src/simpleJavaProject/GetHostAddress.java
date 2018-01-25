package simpleJavaProject;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHostAddress {
public static void main(String[] args) throws UnknownHostException {
	InetAddress iAdd = InetAddress.getByName("");
	System.out.println("Address is : "+iAdd.getLocalHost());
}
}

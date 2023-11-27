import java.net.*;
import java.rmi.*;
public class BeachReservationServer {
  public static void main(String args[]) {
    try {
      BeachReservationImpl beachReservationImpl = new BeachReservationImpl();
      Naming.rebind("BeachReservationServer", beachReservationImpl);
    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}
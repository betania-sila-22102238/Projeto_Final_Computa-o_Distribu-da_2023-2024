import java.rmi.*;
import java.util.List;

public interface BeachReservationIntf extends Remote {
  boolean reserveUmbrella(String beachName, String date, String time, int numberOfPeople, String userId) throws RemoteException;
  boolean cancelReservation(String reservationId, String userId) throws RemoteException;
  List<Umbrella> listAvailableUmbrellas(String beachName, String date, String time, String userId) throws RemoteException;
  boolean registerUser(String email, String password) throws RemoteException;
}


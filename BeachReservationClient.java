import java.rmi.*;
public class BeachReservationClient {
  public static void main(String args[]) {
    try {
      String beachServerURL = "rmi://" + args[0] + "/BeachReservationServer";
      BeachReservationIntf beachReservationIntf =
                    (BeachReservationIntf)Naming.lookup(beachServerURL);
    
    
     // Exemplo de registo do utilizador
      beachServer.registerUser("user@example.com", "password");

      // Exemplo de reserva de sombrinha
      boolean reservationSuccess = beachServer.reserveUmbrella("BeachA", "2023-01-01", "10:00", 2, "user@example.com");
      if (reservationSuccess) {
          System.out.println("Reserva efetuada com sucesso!");
      } else {
          System.out.println("Falha na reserva. Tente novamente.");
      }

      // Exemplo de cancelamento de reserva
      boolean cancelSuccess = beachServer.cancelReservation("reservationId123", "user@example.com");
      if (cancelSuccess) {
          System.out.println("Cancelamento efetuado com sucesso!");
      } else {
          System.out.println("Falha no cancelamento. Tente novamente.");
      }

      // Exemplo de listagem de sombrinhas disponíveis
      List<BeachReservationServer.Umbrella> availableUmbrellas = beachServer.listAvailableUmbrellas("BeachA", "2023-01-01", "12:00", "user@example.com");
      System.out.println("Sombrinhas disponíveis:");
      for (BeachReservationServer.Umbrella umbrella : availableUmbrellas) {
          System.out.println("ID: " + umbrella.getId() + ", Capacidade: " + umbrella.getCapacity());
      }


    }
    catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }
}

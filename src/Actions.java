import Interfaces.TicketStructure;
import CustomSystem.SystemGetInfo;

public class Actions {

  public void printTicket(TicketStructure ticket) {
    System.out.println("Ticket information");
    System.out.println("Ticket code: " + ticket.getCode());
    System.out.println("Ticket name: " + ticket.getName());
    System.out.println("Ticket id: " + ticket.getId());
    System.out.println("Ticket date: " + ticket.getDate());
  }

  public void DisplayAllTickets(LinkedList list) {
    list.display();
  }

  public void AddNewTicket(LinkedList list) {
    final GetTicket getTicket = new GetTicket();
    final TicketStructure ticket = getTicket.getTicket();
    list.add(ticket);

    System.out.println('\n');
    System.out.println('\n');
    printTicket(ticket);
  }

  public void FindTicket(LinkedList list) {
    final SystemGetInfo systemProgram = new SystemGetInfo("Enter the ticket code to find");
    final int getCodeToFind = Integer.parseInt(systemProgram.getResponse());

    TicketStructure ticket = list.find(getCodeToFind);
    if (ticket == null) {
      System.out.println("this ticket don`t exist " + ticket);
        return;
    }

    printTicket(ticket);
  }

  public void DeleteTicket(LinkedList list) {
      final SystemGetInfo systemProgram = new SystemGetInfo("Enter the ticket code to delete");
      final int getCodeToDelete = Integer.parseInt(systemProgram.getResponse());

      boolean deleted = list.delete(getCodeToDelete);
      if (!deleted) {
        System.out.println("this ticket don`t exist");
      }
  }
}

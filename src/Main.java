import CustomSystem.SystemProgram;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    final Actions actions = new Actions();

    executeAction(new SystemProgram(), list, actions);
  }

  public static void executeAction(SystemProgram systemProgram, LinkedList list, Actions actions) {
    final int actionNumber = systemProgram.Run();

    System.out.println('\n');
    System.out.println('\n');

    if (actionNumber == 8) {
      System.out.println("Goodbye");
      return;
    }

    switch (actionNumber) {
      case 1:
        System.out.println("Display all Tickets");
        actions.DisplayAllTickets(list);
        break;
      case 2:
        System.out.println("Add new Ticket");
        actions.AddNewTicket(list);
        break;
      case 3:
        System.out.println("Find a ticket");
        actions.FindTicket(list);
        break;
      case 4:
        System.out.println("Delete a ticket");
        actions.DeleteTicket(list);
        break;
      case 5:
        System.out.println("Exit");
        return;
      default:
        System.out.println("Invalid action");
        break;
    }

    System.out.println('\n');
    System.out.println('\n');
    System.gc(); // Garbage collector to free up memory
    executeAction(systemProgram, list, actions);
  }
}

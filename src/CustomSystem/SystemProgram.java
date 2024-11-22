package CustomSystem;

public class SystemProgram {
  public SystemProgram() {
    System.out.println("welcome to the ticket system");
  }

  public int Run(){
    System.out.println("What do you want to do?");
    System.out.println("1. Display all Tickets");
    System.out.println("2. Add new Ticket");
    System.out.println("3. Find a ticket");
    System.out.println("4. Delete a ticket");
    System.out.println("5. Exit");

    final SystemGetInfo systemGetInfo = new SystemGetInfo("Enter the number of the action you want to perform");
    final String action = systemGetInfo.getResponse();
    final int actionNumber = Integer.parseInt(action);

    return actionNumber;
  }
}

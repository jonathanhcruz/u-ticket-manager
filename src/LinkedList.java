import Interfaces.TicketStructure;


public class LinkedList {
    private Node head;
    private int size = 1;

    public LinkedList() {
      this.head = null;
    }

    public void add(TicketStructure turn) {
      turn.setCode(size);
      Node newNode = new Node(turn);
      if (head == null) {
          head = newNode;
      } else {
        Node current = head;
        while (current.next != null) {
          current = current.next;
        }
        current.next = newNode;
      }
      size++;
    }

    public TicketStructure find(int code) {
      Node current = head;
      while (current != null) {
        if (current.turn.getCode() == code) {
          return current.turn;
        }
        current = current.next;
      }
      return null;
    }

    public boolean delete(int code) {
      if (head == null) {
        return false;
      }
      if (head.turn.getCode() == code) {
        head = head.next;
        return true;
      }
      Node current = head;
      while (current.next != null) {
        if (current.next.turn.getCode() == code) {
          current.next = current.next.next;
          return true;
        }
        current = current.next;
      }
      return false;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("Ticket code: " + current.turn.getCode());
            System.out.println("Ticket name: " + current.turn.getName());
            System.out.println("Ticket id: " + current.turn.getId());
            System.out.println("Ticket date: " + current.turn.getDate());
            current = current.next;
        }
    }
}

import Interfaces.TicketStructure;

class Node {
  TicketStructure turn;
  Node next;

  public Node(TicketStructure turn) {
    this.turn = turn;
    this.next = null;
  }
}
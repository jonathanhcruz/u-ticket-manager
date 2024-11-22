import CustomSystem.SystemGetInfo;
import Interfaces.TicketStructure;

import java.util.Date;

public class GetTicket {
    private TicketStructure ticketStructureData;

    public GetTicket() {
      this.structureData();
    }

    private String getName() {
      final SystemGetInfo titleOfBook = new SystemGetInfo("What is the name of user ?");
      return titleOfBook.getResponse();
    }

    private String getId() {
      final SystemGetInfo author = new SystemGetInfo("Who is the ID of user ?");
      return author.getResponse();
    }

    private Date getDate() {
      return new Date();
    }

    private void structureData() {
      ticketStructureData = new TicketStructure(
        getName(),
        getId(),
        getDate()
      );
    }

    public TicketStructure getTicket() {
      return ticketStructureData;
    }
}

package Interfaces;

import java.util.Date;

public class TicketStructure {
  final String id;
  final String name;
  final Date date;
  int code;

  public TicketStructure(String name, String id, Date date) {
      this.id = id;
      this.name = name;
      this.date = date;
      this.code = 0;
  }

  public String getId() {
      return id;
  }

  public String getName() {
      return name;
  }

  public Date getDate() {
      return date;
  }

  public int getCode() {
      return code;
  }

  public void setCode(int code) {
      this.code = code;
  }
}

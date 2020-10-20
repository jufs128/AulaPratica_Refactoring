import java.util.Enumeration;

public class HtmlStatement extends Statement {   
   public String valueHead(Customer aCustomer){
      return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
   }

   public String valueRental(Rental each){
      return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
   }

   public String valueFoot(Customer aCustomer){
      String foot = "<P>You owe <EM>" +
         String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      foot += "On this rental you earned <EM>" + 
         String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
      return foot;
   }
   
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = valueHead(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += valueRental(each);
      }
      //add footer lines
      result += valueFoot(aCustomer);
      return result;
   }
}

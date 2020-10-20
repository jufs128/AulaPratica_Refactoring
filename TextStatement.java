import java.util.Enumeration;

public class TextStatement extends Statement {   
   public String valueHead(Customer aCustomer){
      return "Rental Record for " + aCustomer.getName() +
      "\n";
   }

   public String valueRental(Rental each){
      return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
   }

   public String valueFoot(Customer aCustomer){
      String foot = "Amount owed is " +
         String.valueOf(aCustomer.getTotalCharge()) + "\n";
      foot += "You earned " +
         String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
         " frequent renter points";
      return foot;
   }
}

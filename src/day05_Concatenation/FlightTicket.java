package day05_Concatenation;

public class FlightTicket {

   /*   2.create a class named FlightTicket, and declare the following variables:
            1. from
                2. to
                3. ticketPrice

    use concatenation to display the full info of the ticket

    ex:
    From Las Vegas to McLean is $425.5
            (edited)
            */
   public static void main(String[] args) {
       String cityName1 = " Las Vegas ";
       String cityName2 = "McLean";
       String ticketPrice = "$425.5";
       String flightTicket = ("From" + cityName1 + "to" + " " + cityName2 + " " + "is" + " " + ticketPrice);

       System.out.println(flightTicket);
   }

}

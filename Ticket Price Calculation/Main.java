import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);


        System.out.println("Enter no of bookings:");
        int bookings = sr.nextInt();


        System.out.println("Enter the available tickets:");
        int availableTickets = sr.nextInt();


       Ticket ticket = new Ticket();
       ticket.setAvailableTickets(availableTickets);


       for (int i = 0; i < bookings; ++i) {
           System.out.println("Enter the ticketid:");
           int ticketId = sr.nextInt();


           System.out.println("Enter the price:");
           int price = sr.nextInt();


           System.out.println("Enter the no of tickets:");
           int tickets = sr.nextInt();


           ticket.setTicketid(ticketId);
           ticket.setPrice(price);


           System.out.println("Available tickets: " + ticket.getAvailableTickets());


           int cost = ticket.calculateTicketCost(tickets);
           System.out.println("Total amount:" + cost);
           System.out.println("Available ticket after booking:" + ticket.getAvailableTickets());
       }
    }
}

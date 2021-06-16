import java.util.Scanner;

public class TestMain {
    public static BusTicket getTicketDetails()
    {
        Scanner sc = new Scanner(System.in);
        BusTicket b = new BusTicket();
        System.out.println("Enter the ticket no:");
        b.setTicketNo(sc.nextInt());
        System.out.println("Enter the ticket price");
        b.setTicketPrice(sc.nextFloat());
        return b;
    }

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		Person p = new Person();
		BusTicket b;
		System.out.println("Enter Passenger Name:");
		p.setName(sc.nextLine());
		System.out.println("Enter the gender(M or F/ m or f):");
		p.setGender(sc.next().charAt(0));
		System.out.println("Enter the age");
		p.setAge(sc.nextInt());
		b=getTicketDetails();
		System.out.println("Ticket no:"+b.getTicketNo());
		System.out.println("Passenger Name"+p.getName());
		System.out.println("Price of a ticket : "+b.getTicketPrice());
		b.calculateTotal();
		System.out.println("Total amount : "+b.getTotalAmount());
		
	}
}

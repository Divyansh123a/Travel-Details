public class BusTicket {
    
    	// Fill the code here
    	private int ticketNo;
    	private float ticketPrice;
    	private float totalAmount;
    	private Person person;
    	public void setPerson(Person person)
    	{
    	    this.person = person;
    	}
    	public void setTicketNo(int ticketNo)
    	{
    	    this.ticketNo = ticketNo;
    	}
    	public void setTicketPrice(float ticketPrice)
    	{
    	    this.ticketPrice = ticketPrice;
    	}
    	public void setTotalAmount(float totalAmount)
    	{
    	    this.totalAmount = totalAmount;
    	}
    	public void calculateTotal()
    	{
    	    if(person.getAge()<16)
    	    {
    	        totalAmount = ticketPrice/2;
    	        setTotalAmount(totalAmount);
    	    }
    	    else if (person.getAge() >= 60)
    	    {
    	        totalAmount = 3*(ticketPrice/4);
    	        setTotalAmount(totalAmount);
    	    }
    	    else if (person.getGender()=='f' || person.getGender()=='F')
    	    {
    	        totalAmount = 9*(ticketPrice/10);
    	        setTotalAmount(totalAmount);
    	    }
    	    else
    	    {
    	        setTotalAmount(ticketPrice);
    	    }
    	}
    	public int getTicketNo()
    	{
    	    return this.ticketNo;
    	}
    	public float getTicketPrice()
    	{
    	    return this.ticketPrice;
    	}
    	public float getTotalAmount()
    	{
    	    return this.totalAmount;
    	}
    	public Person getPerson()
    	{
    	    return person;
    	}
	}

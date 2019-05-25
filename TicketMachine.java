/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private int status;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    
    public TicketMachine()
    {
        price = 500;
    }
    

    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    
    //added
    public int getTotal()
    {
        return total;
    }
    
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money");
    }
    
    
    public void showPrice()
    {
        System.out.println("The price of a ticket is " + price + " cents.");
    }
    
    
    public void removeMoney()
    {
        total = 0;
    }
    
    public void setPrice(int newTicketCost)
    {
        price = newTicketCost;
    }
    
    
    public int emptyMachine() {
        int tempTotal = total;
        total = 0;
        return tempTotal;
        
    }
    
    
    //end added
    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount >= 0) {
            balance = balance + amount;
        } else {
            System.out.println("Use a positive amount: " + amount);
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        
        int amountLeftToPay = price - balance;

        
        
        if (amountLeftToPay <= 0) {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + price;
        // Clear the balance.
        balance = balance - price;
    }   else {
        System.out.println("You must insert at least: " + (amountLeftToPay) + " cents.");
    }
}
    
    public int refundBalance() {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}





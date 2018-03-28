import java.util.ArrayList;
import java.util.Arrays;

public class BuyingShowTickets {

	public int waitingTime(int[] tickets, int p) throws Exception{
		int[] ticketstakecount = tickets.clone();
		int timeTakeninsec = 0;
		
		if(p>=tickets.length || p<0) {
			System.out.println("Exception about to happened "+p + " tickets "+tickets.length);
			throw new Exception("Provided position not within the bounds");
		}
		
		for(int n=0;n<tickets.length;n++) {
			if(ticketstakecount[p]==0)
				break;
			for(int i=0;i<ticketstakecount.length;i++) {
				if(ticketstakecount[i] == 0) {
						continue;
				}else {
					ticketstakecount[i] = ticketstakecount[i]-1;
					timeTakeninsec++;
					if(i==p && ticketstakecount[i]==0)
						break;					
				}			
			}
			
		}
		
		return timeTakeninsec;
	}
	
	public static void main(String[] args) throws Exception{
		try {
			if(args == null || args.length<3)
				throw new Exception("Input values are not valid or insufficient");
			if(Integer.parseInt(args[0]) >= args.length-1)
				throw new Exception("Insufficient input.Please validate.");
			String[] sTickets =  Arrays.copyOfRange(args, 1,Integer.parseInt(args[0])+1);
			int[] tickets = new int[sTickets.length];
			int countTicket =0;
			for(String ticket:sTickets) {
				System.out.println("debug "+ticket);
				tickets[countTicket] = Integer.parseInt(ticket);
				countTicket++;
			}
			BuyingShowTickets buyingShowTickets = new BuyingShowTickets();
			int ticketsbookingtime = buyingShowTickets.waitingTime(tickets,Integer.parseInt(args[args.length-1]));
			System.out.println("ticketsbookingtime "+ticketsbookingtime);
			
			
		}catch (NumberFormatException e) {
			throw new Exception("One or more input values contain an invalid nummber");
		}	
		
	}

}

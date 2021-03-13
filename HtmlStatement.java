public class HtmlStatement extends Statement {
	public String getHeader(Customer aCustomer) {
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}
	
	public String getRentalFigures(Rental aRental) {
		return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + 
				"<BR>\n";
	}
	
	private String getFooter(Customer aCustomer) {
		return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + 
				"</EM><P>\nOn this rental you earned <EM>" + 
				String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + 
				"</EM> frequent renter points<P>";
	}
}
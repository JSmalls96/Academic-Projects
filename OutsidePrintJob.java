package printer;

public class OutsidePrintJob extends PrintJob<Object> {

	double totalCost;
	
	public OutsidePrintJob(String name, int userPrior, int pages) {
		super(name, userPrior, pages);
	}
	
	public void printJob() {
		System.out.println("User Priority: "+this.user_priority +"\tName: "+this.userName+"\tNumber of Pages: "+this.numPages+"\tJob Priority ="+this.getJobPriority()+ "\tCost: $"+this.getCost()+"0");
	}
	
	public double getCost() {
		return numPages*.10;
	}


}

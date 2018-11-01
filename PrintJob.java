package printer;

public class PrintJob<AnyType> implements Comparable<AnyType> {
	
	protected String userName;
	protected int user_priority;
	protected int numPages;

	@Override
	public int compareTo(AnyType x) {
		@SuppressWarnings("unchecked")
		PrintJob<AnyType> job=(PrintJob<AnyType>)x;
		if(getJobPriority()==job.getJobPriority()) {
			return 0;
		}else if (getJobPriority()>job.getJobPriority()) {
			return 1;
		}else
			return -1;
	}
	
	public PrintJob(String name, int userPrior,int pages) {
		setNumPages(pages);
		setUserPriority(userPrior);
		setUserName(name);
	}
	
	public void printJob() {
		System.out.println("User Priority: "+this.user_priority +"\tName: "+this.userName+"\tNumber of Pages: "+this.numPages+"\tJob Priority ="+this.getJobPriority());
	}
	
	public int getNumPages() {
		return numPages;
	}
	
	public void setNumPages(int i) {
		numPages=i;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String s) {
		userName=s;
	}
	
	public int getJobPriority() {
		return user_priority*numPages;
	}
	
	public int getUserPriority() {
		return user_priority;
	}
	
	public void setUserPriority(int i) {
		if(i>=1 && i<=3) {
			user_priority=i;
		}
	}
}

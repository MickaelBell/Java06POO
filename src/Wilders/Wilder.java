package Wilders;

public class Wilder {

	
	private String firstname;
	private boolean aware;
	
	public Wilder( String firstname, boolean aware) {
		
		this.firstname = firstname;
		this.aware = aware;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	public void whoAmI() {
		
		
		System.out.println(this.isAware());
		
		if(this.isAware()) {
			 System.out.println("Je m'appelle " + this.getFirstname() + " et je suis aware");
		}
		else {
			 System.out.println("Je m'appelle " + this.getFirstname() + " et je ne suis pas aware");
		}
		
	}
	
}

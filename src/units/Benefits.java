package units;

public class Benefits {
	private String benefitName = null;
	private long benefitID = -1;
	
	public Benefits(String name, long ID) {
		this.benefitName = name;
		this.benefitID = ID;
	}
	
	public void setBenefitName(String name) {
		this.benefitName = name;
	}
	
	public void setBenefitID(long ID) {
		this.benefitID = ID;
	}
	
	public String getBenefitName() {
		return this.benefitName;
	}
	
	public long getBenefitID() {
		return this.benefitID;
	}
}

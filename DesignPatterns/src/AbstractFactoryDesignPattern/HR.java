package AbstractFactoryDesignPattern;

public class HR implements DepartmentLevel {

	@Override
	public String professionaldeatils() {
		 String deatails=" Hr manager 3-5 years";
		return deatails;
	}

	@Override
	public String getskills() {
		String skills="abode";
		return skills;
	}

	@Override
	public String getsalarydetails() {
		String salary="120000";
		return salary;
	}

}

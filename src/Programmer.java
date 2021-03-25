import day10.my_interface.IWebsiteCreator;

public class Programmer extends Employee implements IWebsiteCreator {

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Programmer pro = new Programmer("Leon", "Cannedy", 15);
		System.out.println(pro.getSalary());
	}

	public void createWebsite(String template, String titleName) {
		System.out.println(template+"..."+titleName);
	}

	public void installWindows(String version, String productKey) {
	}

}
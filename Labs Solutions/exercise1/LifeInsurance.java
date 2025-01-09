package exercise1;

public class LifeInsurance {
	public String calculate() {
		int age = Utils.getInt("What is your age?");
		String name = Utils.getString("What is your name?");
		int years = Utils.getInt("How many years to run?");
		String jobDiscount = Utils.getString("Are you a member of Police, Teacher, NHS (y/n) ?");

		if(age >= 85 || age < 1) {
			return "You age must be > 0 and less than 85" ;
		}
		
		if(age+years > 85) {
			return "The maximum number of years we can run is " + (85-age);
		}
		
		double price = 5 + age + (years/10.0);
		if(jobDiscount.equals("y") )
			price *= 0.9;
		
		return("Dear " + name + " for a term of " + years + " you will pay £" + price);

	}
}

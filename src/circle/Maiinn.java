package circle;

public class Maiinn {
	public static void main(String[] args) {
		Student student =new Student();
		Commission commission =new Commission();
		commission.AcceptDetails_Employee("Murugesh","10166 vkpudur",638534589,90000);
		double commissionAmount =commission.CalculateCommission();
		System.out.println("Commission amount:$"+commissionAmount);
		

		}
}

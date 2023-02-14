
abstract class AbstractClass {
	int workHourEachDay;
int againtest;
	public AbstractClass(int workHourEachDay ){
		this.workHourEachDay = workHourEachDay;
	}
	public abstract double monthlyPay();
	public int getworkHourEachDay(){
		return workHourEachDay;
		
	}
}
class AnnuallySalaryWorker extends AbstractClass{
	double annuallySalary;
	public AnnuallySalaryWorker(double annuallySalary, int workHourEachDay){
		super( workHourEachDay );
		this.annuallySalary = annuallySalary;
	}
	public double monthlyPay(){
		return annuallySalary/12;
	}
}
class HourlySalaryWorker extends AbstractClass{
	double hourlyPay;
	public HourlySalaryWorker(double hourlyPay, int workHourEachDay){
		super( workHourEachDay );
		this.hourlyPay = hourlyPay;
	}
	public double monthlyPay(){
		return workHourEachDay * hourlyPay * 22;
	}
}

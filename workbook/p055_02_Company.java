package workbook;

public class p055_02_Company {
	private double salary;//기본급
	private double annualIncome;//연소득
	private double bonus;//보너스
	private double afterTaxBonus;//세금제외후 보너스
	
	public p055_02_Company() {
		
	}
	public p055_02_Company(double salary) {
		this.salary = salary;
	}
	public p055_02_Company(double salary, double annualIncome, double bonus, double afterTaxBonus) {
		super();
		this.salary = salary;
		this.annualIncome = annualIncome;
		this.bonus = bonus;
		this.afterTaxBonus = afterTaxBonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getBonus() {
		double result = 4*this.salary*0.2;
		setBonus(result);
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getAfterTaxBonus() {
		return getBonus()-getBonus()*0.055;
	}

	public void setAfterTaxBonus() {
		this.afterTaxBonus = afterTaxBonus;
	}
	public double getAfterTaxIncome() {
		double result = getIncome()-getIncome()/10.0;
		return result;
	}
	public double getIncome() {
		double result = 12*this.salary;
		return result;
	}
	public void print() {
		System.out.println("연 기본급 합: "+getIncome()+"세후: "+getAfterTaxIncome());
		System.out.println("연 보너스 합: "+getBonus()+"세후: "+getAfterTaxBonus());
		System.out.println("연 지급액 합: "+(getAfterTaxBonus()+getAfterTaxIncome()));
	}
}

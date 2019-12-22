package workbook;

public class p055_02_Company {
	private double salary;//�⺻��
	private double annualIncome;//���ҵ�
	private double bonus;//���ʽ�
	private double afterTaxBonus;//���������� ���ʽ�
	
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
		System.out.println("�� �⺻�� ��: "+getIncome()+"����: "+getAfterTaxIncome());
		System.out.println("�� ���ʽ� ��: "+getBonus()+"����: "+getAfterTaxBonus());
		System.out.println("�� ���޾� ��: "+(getAfterTaxBonus()+getAfterTaxIncome()));
	}
}

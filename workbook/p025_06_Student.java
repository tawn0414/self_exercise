package workbook;

public class p025_06_Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public p025_06_Student() {
		
	}

	public p025_06_Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		double result = (getKorean()+getEnglish()+getMath()+getScience())/4.0;
		return result;
	}
	
	public String getGrade() {
		String result = "";
		if (getAvg()<=100 & getAvg()>=90) {
			result = "A";
		}else if(getAvg()>=70 & getAvg()<90) {
			result = "B";
		}else if(getAvg()>=50 & getAvg()<70) {
			result = "C";
		}else if(getAvg()>=30 & getAvg()<50) {
			result = "D";
		}else {
			result = "F";
		}
		return result;
	}
	public void print() {
		System.out.print(this.name+" Æò±Õ:"+getAvg()+" ÇÐÁ¡:"+getGrade()+"\n");
	}
	
}

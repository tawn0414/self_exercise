package workbook;

public class p058_04_StudentTest {
	public static void main(String[] args) {
		p058_04_Student[] arr = new p058_04_Student[3];
		arr[0] = new p058_04_Student("ȫ�浿",15,171,81);
		arr[1] = new p058_04_Student("�ѻ��",13,183,72);
		arr[2] = new p058_04_Student("�Ӱ���",16,175,65);
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"������");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+"\t"+arr[i].getAge()+"\t"+arr[i].getHeight()+"\t"+arr[i].getWeight());
		}
		
		double avage=0;
		double avheight = 0;
		double avweight = 0;
		
		avage = (arr[0].getAge()+arr[1].getAge()+arr[2].getAge())/3.0;
		avheight = (arr[0].getHeight()+arr[1].getHeight()+arr[2].getHeight())/3.0;
		avweight = (arr[0].getWeight()+arr[1].getWeight()+arr[2].getWeight())/3.0;
		
		System.out.println("������ ���: "+Math.round(avage*100)/100.0);
		System.out.println("������ ���: "+Math.round(avheight*100)/100.0);
		System.out.println("�������� ���: "+Math.round(avweight*100)/100.0);
	}

}

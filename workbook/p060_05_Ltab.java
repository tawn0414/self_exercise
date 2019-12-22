package workbook;

public class p060_05_Ltab extends p060_05_Mobile{
	
	public p060_05_Ltab() {
		
	}
	public p060_05_Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	public void print() {
		System.out.println(super.getMobileName()+"\t"+super.getBatterySize()+"\t"+super.getOsType());
	}
}

package workbook;

public class p060_05_Otab extends p060_05_Mobile{

	public p060_05_Otab() {
		
	}
	public p060_05_Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	public int operate(int time) {
		int result = super.getBatterySize()-(12*time);
		super.setBatterySize(result);
		return result;
	}
	public int charge(int time) {
		int result = super.getBatterySize()+(8*time);
		super.setBatterySize(result);
		return result;
	}
	public void print() {
		System.out.println(super.getMobileName()+"\t"+super.getBatterySize()+"\t"+super.getOsType());
	}
	
}

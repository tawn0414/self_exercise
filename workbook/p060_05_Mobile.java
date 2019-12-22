package workbook;

public class p060_05_Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public p060_05_Mobile() {
		
	}

	public p060_05_Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	public int operate(int time) {
		int result = this.batterySize-(10*time);
		setBatterySize(result);
		return result;
	}
	public int charge(int time) {
		int result = this.batterySize+(10*time);
		setBatterySize(result);
		return result;
	}
	public void print() {
		System.out.println(this.getMobileName()+"\t"+this.getBatterySize()+"\t"+this.getOsType());
	}
}

package lecture;
public class kimsam_polyex1_VideoShop {
	public static void main(String[] args) {
		kimsam_polyex1_Content[] content = new kimsam_polyex1_Content[3];
		content[0] = new kimsam_polyex1_Video("�����","new");
		content[1] = new kimsam_polyex1_Video("Ž��","comic");
		content[2] = new kimsam_polyex1_Video("���ī��","child");
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}

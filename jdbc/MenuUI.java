package jdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	DeptDAO dao = new DeptDAOImpl();
	
	public void insertMenu() {
		System.out.println("*****�μ����******");
		System.out.print("�μ���ȣ:");
		int deptno = key.nextInt();
		System.out.print("�μ��̸�:");
		String dname = key.next();
		System.out.print("�����ڵ�:");
		String loc_code = key.next();
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int result = dao.insert(dept);
		if(result>0) {
			System.out.println("�μ���� ����");
		}else {
			System.out.println("�μ���� ����");
		}
		
	}
	
	public void selectdeptMenu() {
		System.out.println("�μ�������ȸ");
		DeptDTO deptlist = dao.getDeptInfo();
		if(deptlist == null) {
			System.out.println("�μ�������ȸ ����");
		}else {
			System.out.println("�μ�������ȸ ����");
		}
	}
	
	public void updateMenu() {
		System.out.println("�μ���������");
		System.out.print("�μ��̸�:");
		String dname = key.next();
		System.out.print("�����ڵ�:");
		String loc_code = key.next();
		DeptDTO dept = new DeptDTO(dname, loc_code);
		int result = dao.update(dept);
		if(result>0) {
			System.out.println("�μ����� ����");
		}else {
			System.out.println("�μ����� ����");
		}
	}
	
	public void deleteMenu() {
		System.out.println("�μ�����");
		System.out.print("�μ���ȣ:");
		int deptno = key.nextInt();
		System.out.print("�μ��̸�:");
		String dname = key.next();
		System.out.print("�����ڵ�:");
		String loc_code = key.next();
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int result = dao.insert(dept);
		if(result>0) {
			System.out.println("�μ����� ����");
		}else {
			System.out.println("�μ����� ����");
		}
	}
	
	public void selectMenu() {
		System.out.println("���μ���� Ȯ���ϱ�");
		ArrayList<DeptDTO> deptlist = dao.getDeptList();
		int size = deptlist.size();
		for(int i = 0; i<size; i++) {
			DeptDTO dept=deptlist.get(i);
			System.out.println(dept.getDeptno()+"\t"+dept.getDname()+"\t"+dept.getLoc_code());
		}
	}
	
	public void empoMenu() {
		System.out.println("�μ��� ��� ��� Ȯ��");
		System.out.print("�μ���ȣ:");
		int deptno = key.nextInt();
		ArrayList<EmpDTO> emplist = dao.getMemberList(deptno);
		int size = emplist.size();
		for(int i = 0; i<size; i++) {
			EmpDTO emp=emplist.get(i);
			System.out.println(emp.getEmpno()+"\t"+emp.getEname()+"\t"+emp.getJob()+"\t"+emp.getMgr()+"\t"+emp.getHiredate()+"\t"+emp.getSal()+"\t"+emp.getComm()+"\t"+emp.getDeptno());
		}
		
	}
}

package jdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	DeptDAO dao = new DeptDAOImpl();
	
	public void insertMenu() {
		System.out.println("*****부서등록******");
		System.out.print("부서번호:");
		int deptno = key.nextInt();
		System.out.print("부서이름:");
		String dname = key.next();
		System.out.print("지역코드:");
		String loc_code = key.next();
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int result = dao.insert(dept);
		if(result>0) {
			System.out.println("부서등록 성공");
		}else {
			System.out.println("부서등록 실패");
		}
		
	}
	
	public void selectdeptMenu() {
		System.out.println("부서정보조회");
		DeptDTO deptlist = dao.getDeptInfo();
		if(deptlist == null) {
			System.out.println("부서정보조회 성공");
		}else {
			System.out.println("부서정보조회 실패");
		}
	}
	
	public void updateMenu() {
		System.out.println("부서정보수정");
		System.out.print("부서이름:");
		String dname = key.next();
		System.out.print("지역코드:");
		String loc_code = key.next();
		DeptDTO dept = new DeptDTO(dname, loc_code);
		int result = dao.update(dept);
		if(result>0) {
			System.out.println("부서수정 성공");
		}else {
			System.out.println("부서수정 실패");
		}
	}
	
	public void deleteMenu() {
		System.out.println("부서삭제");
		System.out.print("부서번호:");
		int deptno = key.nextInt();
		System.out.print("부서이름:");
		String dname = key.next();
		System.out.print("지역코드:");
		String loc_code = key.next();
		DeptDTO dept = new DeptDTO(deptno, dname, loc_code);
		int result = dao.insert(dept);
		if(result>0) {
			System.out.println("부서삭제 성공");
		}else {
			System.out.println("부서삭제 실패");
		}
	}
	
	public void selectMenu() {
		System.out.println("모든부서목록 확인하기");
		ArrayList<DeptDTO> deptlist = dao.getDeptList();
		int size = deptlist.size();
		for(int i = 0; i<size; i++) {
			DeptDTO dept=deptlist.get(i);
			System.out.println(dept.getDeptno()+"\t"+dept.getDname()+"\t"+dept.getLoc_code());
		}
	}
	
	public void empoMenu() {
		System.out.println("부서별 사원 목록 확인");
		System.out.print("부서번호:");
		int deptno = key.nextInt();
		ArrayList<EmpDTO> emplist = dao.getMemberList(deptno);
		int size = emplist.size();
		for(int i = 0; i<size; i++) {
			EmpDTO emp=emplist.get(i);
			System.out.println(emp.getEmpno()+"\t"+emp.getEname()+"\t"+emp.getJob()+"\t"+emp.getMgr()+"\t"+emp.getHiredate()+"\t"+emp.getSal()+"\t"+emp.getComm()+"\t"+emp.getDeptno());
		}
		
	}
}

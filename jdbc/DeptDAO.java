package jdbc;

import java.util.ArrayList;

public interface DeptDAO {
	public int insert(DeptDTO dept); //부서등록
	public DeptDTO getDeptInfo(); //부서정보 조회
	public int update(DeptDTO dept); // 부서정보 수정
	public int delete(String deptno);// 부서삭제
	public ArrayList<DeptDTO> getDeptList(); //모든 부서목록 확인하기
	public ArrayList<EmpDTO> getMemberList(int deptno); // 부서별 사원 목록 확인하기
}

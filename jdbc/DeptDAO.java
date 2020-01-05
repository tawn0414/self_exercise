package jdbc;

import java.util.ArrayList;

public interface DeptDAO {
	public int insert(DeptDTO dept); //�μ����
	public DeptDTO getDeptInfo(); //�μ����� ��ȸ
	public int update(DeptDTO dept); // �μ����� ����
	public int delete(String deptno);// �μ�����
	public ArrayList<DeptDTO> getDeptList(); //��� �μ���� Ȯ���ϱ�
	public ArrayList<EmpDTO> getMemberList(int deptno); // �μ��� ��� ��� Ȯ���ϱ�
}

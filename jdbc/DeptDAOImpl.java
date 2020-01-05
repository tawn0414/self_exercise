package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAOImpl implements DeptDAO{

	@Override
	public int insert(DeptDTO dept) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "insert into dept values(?,?,?)";
		int result = 0;
		try {
			con = DBUtill.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dept.getDeptno());
			ptmt.setString(2, dept.getDname());
			ptmt.setString(3, dept.getLoc_code());
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public DeptDTO getDeptInfo() {
		DeptDTO dept = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from dept";
		try {
			con = DBUtill.getConnection();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				dept = new DeptDTO(rs.getInt(1),
								rs.getString(2),rs.getString(3));											
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtill.close(rs, ptmt, con);
			}
			return dept;
	}

	@Override
	public int update(DeptDTO dept) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "update dept set dname= ? and loc_code = ? where deptno = ?";
		int result = 0;
		try {
			con = DBUtill.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dept.getDname());
			ptmt.setString(2, dept.getLoc_code());
			ptmt.setInt(3, dept.getDeptno());
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public int delete(String deptno) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "delete dept where deptno =?";
		int result = 0;
		try {
			con = DBUtill.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtill.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public ArrayList<DeptDTO> getDeptList() {
		ArrayList<DeptDTO> deptlist = new ArrayList<DeptDTO>();
		DeptDTO dept = null;
		String sql = "desc dept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
			
		try {
			con = DBUtill.getConnection();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				dept = new DeptDTO(rs.getInt(1),
								rs.getString(2),rs.getString(3));					
				deptlist.add(dept);						
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtill.close(rs, ptmt, con);
			}
			return deptlist;
	}

	@Override
	public ArrayList<EmpDTO> getMemberList(int deptno) {
		ArrayList<EmpDTO> memberlist = new ArrayList<EmpDTO>();
		EmpDTO member = null;
		String sql = "select * from emp where deptno = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
			
		try {
			con = DBUtill.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, deptno);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				member = new EmpDTO(rs.getInt(1),
								rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getInt(6),rs.getInt(7),rs.getInt(8));					
				memberlist.add(member);						
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtill.close(rs, ptmt, con);
			}
			return memberlist;
	}

}

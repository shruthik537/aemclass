package firstweb.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import firstweb.bean.Emp;
import firstweb.dbutil.Dbutil;
import firstweb.service.EmpRegister;

public class EmpRegisterImpl implements EmpRegister{
	Connection con=null;
	int status=0;

	@Override
	public void EmpRegi(int id, String name, String email, String password, String country) {
		// TODO Auto-generated method stub
		
	
		
		
		try {
			  
         
				System.out.println("connection success----"+con);
					
				} catch (Exception e) {
					// TODO: handle exception
					
					e.printStackTrace();
				}finally {
					
				}
		
	}

	@Override
	public int save(Emp e) {
		// TODO Auto-generated method stub
		Dbutil db=new Dbutil();
		System.out.println("id==="+e.getId()+"name==="+e.getName()+"email==="+e.getEmail()+"password==="+e.getPassword()+"country==="+e.getCountry());
		try {
			con=db.getConnection();
			System.out.println("connection object===="+con);
			PreparedStatement ps=(PreparedStatement)con.prepareStatement("insert into user905(id,name,email,password,country)values(?,?,?,?,?)");
			System.out.println("below prepared statement");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getPassword());
			ps.setString(5, e.getCountry());
			
			status=ps.executeUpdate();
			con.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
			}
			
		}
		
		return status;
	}

	@Override
	public int update(Emp e) {
		// TODO Auto-generated method stub
		Dbutil db=new Dbutil();
		System.out.println("id==="+e.getId()+"name==="+e.getName()+"email==="+e.getEmail()+"password==="+e.getPassword()+"country==="+e.getCountry());
		try {
			con=db.getConnection();
			System.out.println("connection object===="+con);
			PreparedStatement ps=(PreparedStatement)con.prepareStatement("update user905 set id=? where name='hrut'");
			System.out.println("below prepared statement");
			
			
			ps.setString(1, e.getName());
			ps.setString(2, e.getEmail());
			ps.setString(3, e.getPassword());
			ps.setString(4, e.getCountry());
			ps.setInt(5, e.getId());
			status=ps.executeUpdate();
			
			con.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
			}
			
		}
		
return status;
	}

	@Override
	public int delete(Emp e) {
		// TODO Auto-generated method stub
		Dbutil db=new Dbutil();
		System.out.println("id==="+e.getId()+"name==="+e.getName()+"email==="+e.getEmail()+"password==="+e.getPassword()+"country==="+e.getCountry());
		try {
			con=db.getConnection();
			System.out.println("connection object===="+con);
			PreparedStatement ps=(PreparedStatement)con.prepareStatement("delete from user905 where name='hru'");
			System.out.println("below prepared statement");
			
			ps.setString(1, e.getName());
			status=ps.executeUpdate();
			
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
			}
			
		}
		
return status;
	}

	@Override
	public Emp getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

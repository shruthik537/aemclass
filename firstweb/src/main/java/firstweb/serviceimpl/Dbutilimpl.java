package firstweb.serviceimpl;

import java.sql.Connection;

import firstweb.dbutil.Dbutil;
import firstweb.service.Dbutilinterface;

public class Dbutilimpl implements Dbutilinterface {

	@Override
	public void emp(String id, String name, String age) {
		// TODO Auto-generated method stub
		
		Dbutil db=new Dbutil();
		
		
try {
	Connection con=db.getConnection();
	System.out.println("connection success----"+con);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}finally {
			
		}

}

	}



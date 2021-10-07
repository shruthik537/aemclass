package firstweb.serviceimpl;

import firstweb.service.EmployRegister;

public class employRegisterimpl implements EmployRegister{

	@Override
	public void employregi(String firstname, String lastname, String email, String password) {
		// TODO Auto-generated method stub
		
		System.out.println("employregimethod"+firstname+"----"+lastname+"----"+email+"----"+password);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}finally {
			
		}

}
}




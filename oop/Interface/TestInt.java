package oop.Interface;

public class TestInt {
	public static void main(String[] args) {
		
		RoleDAO dao = new RoleDAO();
		
		dao.add();
		dao.update();
		dao.delete();
		
		
		
		BaseDAOInt base = new RoleDAO();
		
		base.add();
		base.update();
		base.delete();
		
		
		UserDAOInt user = new RoleDAO();
		
		user.search();
		
		
		
		
	}

}

package oop.Interface;

public class RoleDAO implements BaseDAOInt, UserDAOInt{

	@Override
	public void search() {
	System.out.println("Search");
		
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void update() {
		System.out.println("update");
		
	}

	@Override
	public void delete() {
		System.out.println("delete");
		
	}

}

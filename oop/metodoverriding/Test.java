package oop.metodoverriding;

public class Test {
	
	public static void main(String[] args) {
		
//		BaseCtl[] baseCtl = new BaseCtl[2];
//		
//		baseCtl[0] = new LoginCtl();
//		baseCtl[1] = new UserCtl();
//		
//		for (int i = 0; i < baseCtl.length; i++) {
//			baseCtl[i].getView();
//			
//		}
		
		UserCtl ctl = new UserCtl();
		ctl.getView();
		
		
		LoginCtl ctl1 = new LoginCtl();
		ctl1.getView();
		
		BaseCtl ctl2 = new LoginCtl();
		ctl2.getView();
		
	}

}

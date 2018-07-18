package basicSelenium;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ActionDemo ad=new ActionDemo();
		ad.dragAndDrop();
		//Result result = JUnitCore.runClasses(ActionDemo.class);
	}

}

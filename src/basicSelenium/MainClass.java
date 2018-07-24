package basicSelenium;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import Grid.GridEx;

public class MainClass {

	public static void main(String[] args) throws Exception {

		// ActionDemo ad=new ActionDemo();
		// ad.dragAndDrop();
		// ad.mouserOver();
		// ad.keyEvent();

		// JavaScriptEx jc=new JavaScriptEx();
		// jc.setUp();
		// jc.scrollingToElementofAPage();
		// jc.scrollingToBottomofAPage();

		// NavigationEx navigationEx=new NavigationEx();
		// navigationEx.nevigationTest();
		// ScreenShot screenShot=new ScreenShot();
		// screenShot.screenShotEx();

		//WindowSwitch windowSwitch = new WindowSwitch();
		//windowSwitch.test();
		// windowSwitch.testSwichToNewTab();
		
		GridEx gridEx=new GridEx();
		gridEx.setUp();
		
	}

}

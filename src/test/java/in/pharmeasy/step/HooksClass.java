package in.pharmeasy.step;



import in.pharmeasy.baseclass.BaseClass;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	BaseClass base=new BaseClass();
	@Before
	public void browserSetup() {
		base.browserLaunch();
	}
}

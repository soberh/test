package dragon.test;

import junit.framework.TestCase;

/**
 * Unit test for VelocityInJDK14
 */
public class VelocityInJDK14Test extends TestCase {
	public void testBuildContent() {
		try {
			String outmsg = VelocityInJDK14.buildContent("test1.vm");
			System.out.println("test1="+outmsg);
			outmsg = VelocityInJDK14.buildContent("test2.vm");
			System.out.println("-----------------------------------");
			System.out.println("test2="+outmsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

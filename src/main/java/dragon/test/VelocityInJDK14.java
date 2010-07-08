package dragon.test;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 * 测试Velocity与jdk1.4的兼容性
 * 
 */
public class VelocityInJDK14 {
	static{
		try {
			Velocity.init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String buildContent(String tpl) throws Exception {
		VelocityContext context = new VelocityContext();

		context.put("name", new String("Velocity"));

		Template template = null;

		template = Velocity.getTemplate(tpl);

		StringWriter sw = new StringWriter();

		template.merge(context, sw);
		return sw.toString();
	}
}

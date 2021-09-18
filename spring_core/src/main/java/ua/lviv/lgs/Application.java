package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		Student student = (Student) ctx.getBean("student");

		ConsoleEventLogger cel = (ConsoleEventLogger) ctx.getBean("consoleEventLogger");
		cel.logEvent(student.getId()+" ---> "+student.getName()+" ---> "+student.getAge());
	}

}

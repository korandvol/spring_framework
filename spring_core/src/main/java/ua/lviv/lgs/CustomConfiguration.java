package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
	@Bean(name = "consoleEventLogger")
	public ConsoleEventLogger getConsoleEventLogger() {
		return new ConsoleEventLogger();
	}

	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Andrii");
		student.setAge(33);
		return student;
	}
}

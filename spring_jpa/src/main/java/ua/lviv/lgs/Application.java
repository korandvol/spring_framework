package ua.lviv.lgs;



import java.text.ParseException;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;
@ComponentScan("ua.lviv.lgs.service")
@SpringBootApplication
public class Application {

	
	public static void main(String[] args) throws ParseException {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UniversityService service = ctx.getBean(UniversityService.class);
		
		University university = new University();
		university.setName("KPNU");
		university.setAccreditation("IV LEVEL");
		university.setAmountOfInstitution(5);
		university.setAmountOfStudents(1000);
		university.setAdress("Khmelnitsky region, Kamianets-Podilsky");
		
		University university1 = new University();
		university1.setName("ÊPAC");
		university1.setAccreditation("III LEVEL");
		university1.setAmountOfInstitution(6);
		university1.setAmountOfStudents(890);
		university1.setAdress("Khmelnitsky region, Kamianets-Podilsky");
		
		service.addUniversity(university);
		service.addUniversity(university1);
		
		// save user to DB
		service.save(university);
		service.save(university1);
		// read from DB
        System.out.println(service.findById((long)3));
        System.out.println(service.findById((long)2));
        System.out.println(service.findByName((String)"KPNU"));
        
        //readAll
        service.findAll().stream().forEach(System.out::println);
        
        //delete
        service.deleteById((long)16);
        
        service.findAll().stream().forEach(System.out::println);
        
     // update from DB
        
        University forUpdate = service.findById((long)10);
        forUpdate.setName("MOBB DEEP");
        service.update(forUpdate);
        System.out.println(service.findById((long)10));
	}
	

}

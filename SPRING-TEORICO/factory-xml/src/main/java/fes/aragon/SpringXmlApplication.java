package fes.aragon;

import fes.aragon.model.*;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

@SpringBootApplication
public class SpringXmlApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
				"bean-configuration.xml","bean-servicio.xml"
		});
		try {
			Persona p1 = context.getBean("persona",Persona.class);
			p1.getCoche().getModeloCoche(TiposCarro.TODOTERRENO).crear();
			System.out.println(p1.toString());
			Persona p2 = context.getBean("persona",Persona.class);
			p2.setNombre("Raul");
			p2.getCoche().getModeloCoche(TiposCarro.DEPORTIVO).crear();
			System.out.println(p2.toString());
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}

	}
}

package fes.aragon;

import fes.aragon.model.*;
import fes.aragon.repositorio.BaseDeDatosDAO;
import fes.aragon.repositorio.BaseDeDatosDAOImpl;
import fes.aragon.servicio.ConfiguracionServicio;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

@SpringBootApplication
public class SpringXmlApplication {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
//				"bean-configuration.xml"
//		});
	/*	ConfigurableApplicationContext context=
				new AnnotationConfigApplicationContext(ConfiguracionServicio.class);
				Estudiante estudiante=context.getBean("estudiante", Estudiante.class);
				System.out.println(estudiante);
				Materia materia=context.getBean("materia",Materia.class);
				System.out.println(materia); */
		ConfigurableApplicationContext context =
				new AnnotationConfigApplicationContext("fes.aragon");
		BaseDeDatosDAO bd=context.getBean("BaseDeDatosDAO", BaseDeDatosDAO.class);
		System.out.println("ico");
		context.close();
	}
}

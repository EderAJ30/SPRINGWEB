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

	public static <Persona> void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
				"bean-configuration.xml","bean-servicio.xml"
		});
		/*
		Persona p=(Persona) context.getBean("persona");
				System.out.println(p);
		Persona p2=(Persona) context.getBean("personaDos");
				System.out.println(p2);
		Persona p3=(Persona) context.getBean("personaTres");
			System.out.println(p3);
		System.out.println("--------------------------------------");
		Empleado em1=(Empleado) context.getBean("empleadoUno");
				System.out.println(em1.getNumTrabajador());
				em1.getActividades().realiza();
				em1.setNombre("Rosa");
				em1.setEdad(23);
				System.out.println(em1);
		System.out.println("--------------------------------------");
		Empleado em2=(Empleado) context.getBean("empleadoDos");
			System.out.println(em2.getNumTrabajador());
			em2.getActividades().realiza();
			em2.setNombre("Paco");
			em2.setEdad(27);
			System.out.println(em2);
		System.out.println("--------------------------------------");
		Empleado em3=(Empleado) context.getBean("empleadoTres");
			System.out.println(em3.getNumTrabajador());
			em3.getActividades().realiza();
			em3.setNombre("Juan");
			em3.setEdad(28);
			System.out.println(em3);
		System.out.println("--------------------------------------");
		EmpleadoC em4=context.getBean("empleadoCuatro", EmpleadoC.class);
			System.out.println(em4);
			for(Actividades ac: em4.getActividades()){
				ac.realiza();
			}
		System.out.println("--------------------------------------");
		EmpleadoC em5=context.getBean("empleadoCinco", EmpleadoC.class);
		System.out.println(em5);
		for(Actividades ac: em5.getActividades()){
			ac.realiza();
		}
		System.out.println("--------------------------------------");
		EmpleadoM em6=context.getBean("empleadoSeis", EmpleadoM.class);
			System.out.println(em6);
			for (Iterator<String> iter = em6.getActividades().keySet().iterator(); iter.hasNext();){
				String llave=(String)iter.next();
				System.out.println("Llave: "+llave);
				em6.getActividades().get(llave).realiza();
			}
		System.out.println("--------------------------------------");
		EmpleadoP em7=context.getBean("empleadoSiete", EmpleadoP.class);
		System.out.println(em7);
		for (Iterator<Object> iter = em7.getActividades().keySet().iterator(); iter.hasNext();){
			String llave=(String)iter.next();
			System.out.println("Llave: "+llave);
			System.out.println(em7.getActividades().get(llave));
		}
		*/
		try {
			Empleado emp=context.getBean("empleado",Empleado.class);
			System.out.println(emp);
			if(emp.getActividades()!=null) {
				emp.getActividades().realiza();
			}
		} catch (UnsatisfiedDependencyException ex) {
			System.out.println("error xd");
		}
	}
}

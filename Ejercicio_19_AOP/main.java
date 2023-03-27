package main;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		writetxt w = contexto.getBean(writetxt.class);
		
		empleado e1 = new empleado("León", "Prieto", 22);
		empleado e2 = new empleado("Pedro", "Miguel", 30);
		
		
		List<empleado> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		w.añadirLista(emp);
		w.genArchivo();
		
		

	}

}

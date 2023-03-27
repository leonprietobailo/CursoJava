package main;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


import org.aspectj.lang.annotation.After;

@Aspect
@Component
public class aspecto {
	
	@Before("execution(void generaTxt())")
	public void escribir_before()
	{
		System.out.println("Se está generando un fichero");
	}
	
	@After("execution(void generaTxt())")
	public void cierraPrograma() {
		System.out.println("Se está cerrando el programa");
	}

}

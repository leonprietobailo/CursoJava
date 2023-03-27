package main;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


import org.aspectj.lang.annotation.After;

@Aspect
@Component
public class aspecto {
	
	@Before("execution(void genArchivo())")
	public void escribir_before()
	{
		System.out.println("Escribiendo archivo...");
	}
	
	@After("execution(void genArchivo())")
	public void escribir_after() {
		System.out.println("Ha terminado el programa! Saliendo... ");
	}

}

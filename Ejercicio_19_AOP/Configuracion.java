package main;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //Esto le indica a Eclipse que es la configuración
@EnableAspectJAutoProxy //Esto HABILITA la relación entre AOP y
						//el proyecto.
@ComponentScan("main") //Esto le indica que va a scannear este paquete buscando Aspectos.
//@ComponentScan("es.login.aop.dao") //Esto le indica que va a scannear este paquete buscando Aspectos.
//Esta es la clase de Servicio, necesaria para implementar
//el paradigma de Aspectos.


public class Configuracion {

}

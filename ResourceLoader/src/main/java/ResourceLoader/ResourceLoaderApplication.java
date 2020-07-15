package ResourceLoader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ResourceLoaderApplication 
{

	public static void main(String[] args) 
	{   
	    ApplicationContext ctx = SpringApplication.run(ResourceLoaderApplication.class, args); 
	    ResourceLoaderService loader = (ResourceLoaderService)ctx.getBean("resourceLoaderService");  

	    
	    System.out.println("** Resource loader using file path **");
	    try {
	      loader.showResourceDataUsingFilePath();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    
	    System.out.println("** Resource loader using root path **");
	    try {
	      loader.showResourceDataUsingRoot();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    
	    System.out.println("** Resource loader using class path **");
	    try {
	      loader.showResourceDataUsingClassPath();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    
	    System.out.println("** Resource loader using url path **");
	    try {
	      loader.showResourceDataUsingURL();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }  
	}

}

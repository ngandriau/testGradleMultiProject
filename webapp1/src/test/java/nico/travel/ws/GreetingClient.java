package nico.travel.ws;

import nico.travel.dom.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 *
 */
public class GreetingClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cxf-client.applicationContext.xml");

        GreetingWS client = (GreetingWS) context.getBean("greetingWS");

        System.out.println("call sayHi():");
        System.out.println("" + client.sayHi("Nicolas"));

        Person Nicolas = new Person();
        Nicolas.setDateOfBirth(new Date());
        Nicolas.setFirstName("Nicolas");

        Person Yves = new Person();
        Yves.setFirstName("Yves");
        Nicolas.setFather(Yves);

        Person Sylvaine = new Person();
        Sylvaine.setFirstName("Sylvaine");
        Nicolas.setMother(Sylvaine);

        System.out.println("call whoSaysHelloToWho():");
        System.out.println("" + client.whoSaysHelloToWho(Nicolas, "from paris"));

    }
}

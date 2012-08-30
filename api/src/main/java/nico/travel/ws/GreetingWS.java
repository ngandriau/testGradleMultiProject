package nico.travel.ws;

import nico.travel.dom.Person;

import javax.jws.WebService;

@WebService
public interface GreetingWS {
    String sayHi(String text);

    Person whoSaysHelloToWho(Person who, String message);
}

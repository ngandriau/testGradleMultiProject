package nico.travel.ws.impl;

import nico.travel.dom.Person;
import nico.travel.ws.GreetingWS;

import javax.jws.WebService;

@WebService(endpointInterface = "nico.travel.ws.GreetingWS")
public class GreetingWSImpl implements GreetingWS {

    @Override
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }

    @Override
    public Person whoSaysHelloToWho(Person who, String message){
        System.out.println("whoSaysHelloToWho");
        return who;
    }
}

package hello;

import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@io.micronaut.http.annotation.Controller
public class Controller {

    @Inject
    Dependency dependency;

    @Get
    public String hello() {
        dependency.doSomething();
        return "Hello World";
    }
}

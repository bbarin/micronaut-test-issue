package hello;

import io.micronaut.test.annotation.MicronautTest;
import io.micronaut.test.annotation.MockBean;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.inject.Inject;


@MicronautTest
class ControllerTest {

    @Inject
    Dependency dependency;

    @Test
    void hello() {
        dependency.doSomething();
        System.out.println("test");
    }

    @MockBean(Dependency.class)
    Dependency another() {
        return Mockito.mock(Dependency.class);
    }
}

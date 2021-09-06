package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sda.component.ClassWithDependencies;
import pl.sda.component.ComponentWithProperty;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private ClassWithDependencies classWithDependencies;

    @Autowired
    private ComponentWithProperty componentWithProperty;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");

        componentWithProperty.printPropertyValue();
    }
}
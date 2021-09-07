package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sda.component.ClassWithDependencies;
import pl.sda.component.CompomentWithPropetyCollections;
import pl.sda.component.ComponentWithProperty;
import pl.sda.scope.RandomNumberReader1;
import pl.sda.scope.RandomNumberReader2;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private ClassWithDependencies classWithDependencies;

    @Autowired
    private ComponentWithProperty componentWithProperty;

    @Autowired
    private CompomentWithPropetyCollections compomentWithPropetyCollections;

    @Autowired
    private RandomNumberReader1 randomNumberReader1;

    @Autowired
    private RandomNumberReader2 randomNumberReader2;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");

        componentWithProperty.printPropertyValue();

        System.out.println(compomentWithPropetyCollections);
        randomNumberReader1.printRandomNumber();
        randomNumberReader2.printRandomNumber();
    }
}

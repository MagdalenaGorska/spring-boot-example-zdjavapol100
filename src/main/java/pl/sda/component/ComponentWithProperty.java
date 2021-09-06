package pl.sda.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentWithProperty {

    @Value("${pl.sda.example.value}")
    private String propertyValue;

    public void printPropertyValue(){
        System.out.println("Wartość z pliku application.properties: " + propertyValue);
    }
}

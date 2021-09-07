package pl.sda.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "pl.sda.collections")
@Component
public class CompomentWithPropetyCollections {
    private List<String> stringList;
    private Map<String, Integer> map;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "CompomentWithPropetyCollections{" +
                "stringList=" + stringList +
                ", map=" + map +
                '}';
    }
}

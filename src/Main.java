import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Felipe", "Bob", "Cecilia", "Alicia");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("F"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);


        List<String> namesWithA = new ArrayList<>();
        namesWithA.add("Alice");
        namesWithA.add("Alex");
        namesWithA.add("Pedro");
        namesWithA.add("Maria");

        List<String> filterNamesWithA = namesWithA.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());// acumula los elementos del flujo en una lista

        System.out.println(filterNamesWithA);
    }

}


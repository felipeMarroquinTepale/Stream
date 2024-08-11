package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Resumen {
    public static void main(String[] args) {
        //Operaciones de creacion y conversion
        //stream(): convierte un stream a partir de una lista,
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream = list.stream();
        //stream.forEach(System.out::println);
        //of() crea un stream a partir de elementos individuales
        Stream<String> streamOf = Stream.of("a","b","c","d");

        //Operaciones de transformacion
        //map: transformaa cada elemento del stream usando una funcion
        List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        //filter() Filtra elementos que cumplen con una condicion
        List<String> filteredList = list.stream()
                .filter(s-> s.startsWith("a"))
                .collect(Collectors.toList());

        //Reduccion y agregacion
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sum = numbers.stream()
                .reduce((a,b) -> a + b);

        sum.ifPresent(System.out::println);


    }
}

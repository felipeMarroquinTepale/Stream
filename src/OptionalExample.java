import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //Optional sirve para representar valores que pueden estar presentes o ausentes
        //evitando errores como nullpoienterexeption

        Optional<String> name = Optional.of("Alice");
        name.ifPresent(System.out::println);

        Optional<String> emptyName = Optional.empty();
        emptyName.ifPresent(System.out::println);
    }
}

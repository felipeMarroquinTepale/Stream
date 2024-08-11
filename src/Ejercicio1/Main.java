package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Curso de java", 6.5F, 50, 200));
        cursos.add(new Curso("Cursos profesional de DB", 9.5f, 70, 700));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

        //Obtener la cantidad de cursos con una duracion mayor a 5 horas
        List<Curso> cursoDuracionMayor5h = cursos.stream()
                .filter(curso -> curso.getDuracion() > 5)
                .collect(Collectors.toList());
        System.out.println("Curso duracion mayor a 5 horas: " + cursoDuracionMayor5h.toString());

        //Obtener la cantidad de cursos con una duración menor a 2 horas.
        List<Curso> cursoDuracionMenor2h = cursos.stream()
                .filter(curso -> curso.getDuracion() < 2)
                .collect(Collectors.toList());
        System.out.println("Curso duracion mayor a 2 horas: " + cursoDuracionMenor2h.toString());


        //Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
        List<Curso> cursoCantVideoMayor50 = cursos.stream()
                .filter(curso -> curso.getVideos() >50)
                .collect(Collectors.toList());
        System.out.println("Curso con una cantidad de videos mayor a 50" + cursoCantVideoMayor50.toString());

        List<Curso> cursosWithMayorDuration = cursos.stream()
                .sorted(Comparator.comparingDouble(Curso::getDuracion).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("3 cursos con mayor duracion"+ cursosWithMayorDuration);

        //Mostrar en consola la duración total de todos los cursos.
        double DurationTotalCurso = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .sum();
        System.out.println("SUMA TOTAL DE DURACION DE LOS CURSOS: "+ DurationTotalCurso);

        //Obtener el curso con mayor duración.
        List<Curso> cursoConMayorDuracion = cursos.stream()
                .sorted(Comparator.comparingDouble(Curso::getDuracion).reversed())
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("Curso con mayor duracion: "+  cursoConMayorDuracion);

        List<String> titulosCursos = cursos.stream()
                .map(Curso::getTitulo)
                .collect(Collectors.toList());
        System.out.println("Titulos "+ titulosCursos);

        //Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
        double promedioDuracion = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .average()
                .orElse(0);
    }
}

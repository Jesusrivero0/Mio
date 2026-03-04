package Ejercicio7Repaso;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // Crear academia
        Academia academia = new Academia();
        academia.setCuidad("Madrid");
        academia.setTelefono(123456789);
        academia.setListaCurso(new ArrayList<>());

        // Crear un curso
        Curso curso1 = new Curso("Java", new BigDecimal("600"), 20);
        curso1.setFechaInicio(LocalDate.now().plusMonths(1));
        curso1.setFechaFin(LocalDate.now().plusMonths(4));
        curso1.setNumeroPlazaOcupadas(5);

        // Añadir curso a la academia
        academia.getListaCurso().add(curso1);

        // Probar métodos
        System.out.println("Precio medio: " + academia.getPrecioMedio());
        System.out.println("Total plazas libres: " + academia.getTotalPlazasLibres());

        Curso barato = academia.getCursoMasBarato();
        if (barato != null) {
            System.out.println("Curso más barato: " + barato.getNombre());
        }

        System.out.println("Cursos disponibles: " + academia.getCursoDisponibles().size());
    }
}

import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Introdução a linguagem Java");
        curso1.setCargahoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Introdução a linguagem Javascript");
        curso2.setCargahoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Kotlin Experience");
        curso3.setDescricao("Introdução a linguagem Kotlin");
        curso3.setCargahoraria(7);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria para Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Javascript");
        mentoria2.setDescricao("Descrição da mentoria para Javascript");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria de Kotlin");
        mentoria3.setDescricao("Descrição da mentoria para Kotlin");
        mentoria3.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(mentoria3);
    }
}
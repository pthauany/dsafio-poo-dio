import dominio.*;

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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria para Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devThauany = new Dev();
        devThauany.setNome("Thauany");
        devThauany.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thauany: " + devThauany.getConteudosInscritos());
        devThauany.progredir();
        devThauany.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Thauany: " + devThauany.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thauany: " + devThauany.getConteudosConcluidos());

        System.out.println("-------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.printf("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
    }
}
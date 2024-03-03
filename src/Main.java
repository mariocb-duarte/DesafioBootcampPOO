import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("java curso");
        curso1.setDescricao("descrição java curso");
        curso1.setCaragaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("js curso");
        curso2.setDescricao("descrição js curso");
        curso2.setCaragaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMario = new Dev();
        devMario.setNome("Mario Duarte");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mario: " + devMario.getConteudosInscritos());
        devMario.progredir();
        devMario.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mario: " + devMario.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mario: " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXp());

        System.out.println("------");

        Dev devLivia = new Dev();
        devLivia.setNome("Livia Ambrosio");
        devLivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Livia: " + devLivia.getConteudosInscritos());
        devLivia.progredir();
        devLivia.progredir();
        devLivia.progredir();
        System.out.println("-----");
        System.out.println("Conteudos Inscritos Livia: " + devLivia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Livia: " + devLivia.getConteudosConcluidos());
        System.out.println("XP: " + devLivia.calcularTotalXp());

    }
}
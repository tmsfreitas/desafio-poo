import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Curso de Java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Curso de JavaScript");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Descrição Mentoria Java");

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develope");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Thiago: " + devThiago.getConteudosIncritos());
        devThiago.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluídos Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularXp());

        System.out.println("-----------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosIncritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosIncritos());
        System.out.println("Conteudos concluídos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularXp());
        


    }
}
    

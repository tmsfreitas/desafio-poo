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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
    

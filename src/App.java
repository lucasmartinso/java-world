public class App {
    public static void main(String[] args) throws Exception {
        Users novoAluno = new Users();
        novoAluno.name = "lucas";
        novoAluno.age = 21;

        novoAluno.setCpf("12345678911");

        System.out.println(novoAluno.getCpf());
    }
}

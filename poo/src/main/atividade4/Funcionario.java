public class Funcionario {
    private int id;
    public Funcionario(int id, String nome, Double salario, String idade, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.setor = setor;
        this.sexo = sexo;
    }
    private String nome;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    private Double salario;
    private String idade;
    private Setor setor;
    private Sexo sexo;

    
    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", idade=" + idade + ", setor="
                + setor + ", sexo=" + sexo + "]";
    }



}

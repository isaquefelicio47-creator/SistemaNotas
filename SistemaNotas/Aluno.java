package SistemaNotas;
public class Aluno{
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;
public Aluno(String nome, String matricula, double nota1, double nota2, double nota3){
    this.nome = nome;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
}
public Aluno(){
    nome = "Sem Nome";
    matricula = "000";
    nota1 = 0.0;
    nota2 = 0.0;
    nota3 = 0.0;
}
public void lancarNotas(double n1, double n2, double n3){
    this.nota1 = n1;
    this.nota2 = n2;
    this.nota3 = n3;
}
public double calcularMedia(){
    return (nota1 + nota2 + nota3)/3;
}
public String verificarSituacao(){
    double Media = calcularMedia();
    if(Media >= 6.0){
        return "APROVADO";
    }
    else if(Media >= 4.0 && Media < 6.0){
       return "RECUPERACAO";
    }
    else if(Media < 4.0){
        return "REPROVADO";
    }
    else{
        return "";
    }  
}
public void exibirBoletim(){
    System.out.println("\n-----------------------Boletim-----------------------");
    System.out.println("Nome: "+ nome);
    System.out.println("Matricula: "+ matricula);
    System.out.println("Nota1: "+ nota1);
    System.out.println("Nota2: "+ nota2);
    System.out.println("Nota3: "+ nota3);
    System.out.format("\nMedia: %.2f%% ", calcularMedia());
    System.out.format("\nSituação: "+ verificarSituacao());
}
public String getAluno(){
    return this.nome;
}
}
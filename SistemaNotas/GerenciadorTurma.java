package SistemaNotas;

public class GerenciadorTurma {
    private String nomeTurma;
    private Aluno[] aluno;
    private int contador;
public GerenciadorTurma(String nomeTurma){
    this.nomeTurma = nomeTurma;
    this.aluno = new Aluno[4];
    this.contador = 0;
}
public void cadastrarAluno(Aluno a){
    if(this.contador < 4){
    this.aluno[this.contador] = a;
    this.contador++; 
    }else{
        System.out.printf("Turma com capacidade máxima atingida");
    }
}
public void emitirBoletins(){
    for(int cont = 0; cont < this.contador ; cont++ ){
        this.aluno[cont].exibirBoletim();
    }
}
public int contarAprovados(){
    int aprovados = 0;
    for(int cont = 0; cont < this.contador; cont++){
    if(aluno[cont].verificarSituacao().equals("APROVADO")){
        aprovados++;
    }
  }
    return aprovados;
}
public void exibirMaiorMedia(){
    Aluno melhorAluno = aluno[0];
    for(int cont = 0; cont < this.contador; cont++){
    if(aluno[cont].calcularMedia() > melhorAluno.calcularMedia()){
    melhorAluno = aluno[cont];
        
    }
}   
    System.out.println("\n-------------------------Melhor Aluno-------------------------");
    System.out.println("\nNome: " +  melhorAluno.getAluno());
    System.out.printf("\nMédia: %.2f%%", melhorAluno.calcularMedia());

}
public Aluno getAluno(int indice){
    if(indice >= 0 && indice < this.contador){
        return this.aluno[indice];
    }
    return null;
}
}
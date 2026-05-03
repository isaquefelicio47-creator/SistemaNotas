# SistemaNotas
## O sistema permite o cadastro de alunos, lançamento de notas, cálculo de médias e verificação automática da situação acadêmica (Aprovado, Recuperação ou Reprovado).
## Tecnologia utilizada ( Java 21.0.10, VScode)

### Passo a passo para compilar e rodar no console:
* Primeiro passo, clone o projeto: Use (git clone https://github.com/isaquefelicio47-creator/SistemaNotas.git)
  
* Segundo passo, Acesse a pasta raiz do código: (cd SistemaNotas)

* Terceiro passo, Compile o projeto: (javac -d bin *.java)

* Quarto passo, Execute a aplicação: (java -cp bin SistemaNotas.TesteNotas)

  Descrição das classes criadas e a responsabilidade de cada uma.

* Aluno.java: É a classe que modela o aluno. Ela armazena o nome, matrícula e três notas. Suas principais responsabilidades são calcular a média e definir a situação do aluno com base nos critérios de avaliação.

* GerenciadorTurma.java: Atua como gerenciador da turma. Ela utiliza um vetor para armazenar até 4 objetos da classe Aluno, permitindo listar os boletins de todos, identificar quem obteve a maior média e contar o total de aprovados na turma.

* TesteNotas.java: É a interface de interação. Contém o menu interativo (utilizando switch-case e do-while) que permite ao usuário navegar pelas funções do sistema em tempo real.

package com.cubos.exercicio_funcoes;

public class Alunos {
    public static void main(String[] args) {

        Prova prova = new Prova("João", "Português", 10, new Questao[] {
                new Questao("a", "b"),
                new Questao("c", "c"),
                new Questao("e", "b"),
                new Questao("b", "b"),
                new Questao("c", "c")
        });

        corrigirProva(prova);
    }

    public static void corrigirProva(Prova prova) {
        int acertos = 0;

        for (int i = 0; i < prova.questoes.length; i++) {
            if (prova.questoes[i].resposta.equals(prova.questoes[i].correta)) {
                acertos++;
            }
        }

        int nota = (int) Math.round(((double) acertos / prova.questoes.length) * prova.valor);

        System.out.println("O aluno(a) " + prova.aluno + " acertou " + acertos + " questões e obteve nota " + nota);
    }
}

class Prova {
    String aluno;
    String materia;
    int valor;
    Questao[] questoes;

    public Prova(String aluno, String materia, int valor, Questao[] questoes) {
        this.aluno = aluno;
        this.materia = materia;
        this.valor = valor;
        this.questoes = questoes;
    }
}

class Questao {
    String resposta;
    String correta;

    public Questao(String resposta, String correta) {
        this.resposta = resposta;
        this.correta = correta;
    }
}
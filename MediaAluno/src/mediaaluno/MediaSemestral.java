/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaluno;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author aavls
 */
public class MediaSemestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nProva1, nProjeto1, nExercicios1, nContribuicao1;
        String nomeAluno, disciplina;
        Scanner entrada = new Scanner (System.in);
        
        // ESCREVA("Informe o nome do aluno: ")
        System.out.println("Informe o nome do aluno: ");
        //LEIA(NOTA DA PROVA)
        nomeAluno=entrada.nextLine();
        
        // ESCREVA("Informe a disciplina: ")
        System.out.println("Informe a disciplina: ");
        //LEIA(NOTA DA PROVA)
        disciplina=entrada.nextLine();
        
        // ESCREVA("Informe a nota da prova do aluno no 1º Bimestre: ")
        System.out.println("Informe a nota da prova do aluno no 1º Bimestre: ");
        //LEIA(NOTA DA PROVA)
        nProva1=entrada.nextFloat();
        
        // ESCREVA("Informe a nota do projeto do aluno no 1º Bimestre: ")
        System.out.println("Informe a nota do projeto do aluno no 1º Bimestre: ");
        //LEIA(NOTA DA PROJETO)
        nProjeto1=entrada.nextFloat();
        
        // ESCREVA("Informe a nota dos exercícios do aluno no 1º Bimestre: ")
        System.out.println("Informe a nota dos exercícios do aluno no 1º Bimestre: ");
        //LEIA(NOTA DOS EXERCICIOS)
        nExercicios1=entrada.nextFloat();
        
        // ESCREVA("Informe a nota de contribuição do aluno no 1º Bimestre: ")
        System.out.println("Informe a nota de contribuição do aluno no 1º Bimestre: ");
        //LEIA(NOTA DA CONTRIBUIÇÃO)
        nContribuicao1=entrada.nextFloat();
        
        
        
        
        
        float nProva2, nProjeto2, nExercicios2, nContribuicao2;
        
        // ESCREVA("Informe a nota da prova do aluno no 2º Bimestre: ")
        System.out.println("Informe a nota da prova do aluno no 2º Bimestre: ");
        //LEIA(NOTA DA PROVA)
        nProva2=entrada.nextFloat();
        
        // ESCREVA("Informe a nota do projeto do aluno no 2º Bimestre: ")
        System.out.println("Informe a nota do projeto do aluno no 2º Bimestre: ");
        //LEIA(NOTA DA PROJETO)
        nProjeto2=entrada.nextFloat();
        
        // ESCREVA("Informe a nota dos exercícios do aluno no 2º Bimestre: ")
        System.out.println("Informe a nota dos exercícios do aluno no 2º Bimestre: ");
        //LEIA(NOTA DOS EXERCICIOS)
        nExercicios2=entrada.nextFloat();
        
        // ESCREVA("Informe a nota de contribuição do aluno no 2º Bimestre: ")
        System.out.println("Informe a nota de contribuição do aluno no 2º Bimestre: ");
        //LEIA(NOTA DA CONTRIBUIÇÃO)
        nContribuicao2=entrada.nextFloat();
        
        
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        //SOMAR NOTAS E CALCULAR MÉDIA DO 1º BIMESTRE
        float nota1Bimestre;
        //PROVA(PESO 3), PROJETO(PESO 3), EXERCÍCIOS(PESO 2) E CONTRIBUIÇÃO(PESO 3)
        nota1Bimestre=((nProva1 * 3 + nProjeto1 * 3 + nExercicios1 * 2 + nContribuicao1 * 3)/11);
        //ESCREVA O RESULTADO DO CALCULO ARITIMÉTICO PONDERADO DA MÉDIDO DO ALUNO NO 1º BIMESTRE
        System.out.println("A nota final do aluno " + nomeAluno + " no 1º Bimestre em " + disciplina + " foi: " + formatador.format(nota1Bimestre));
        
        
        
        //SOMAR NOTAS E CALCULAR MÉDIA DO 2º BIMESTRE
        float nota2Bimestre;
        //PROVA(PESO 3), PROJETO(PESO 3), EXERCÍCIOS(PESO 2) E CONTRIBUIÇÃO(PESO 3)
        nota2Bimestre=((nProva2 * 3 + nProjeto2 * 3 + nExercicios2 * 2 + nContribuicao2 * 3)/11);
        //ESCREVA O RESULTADO DO CALCULO ARITIMÉTICO PONDERADO DA MÉDIDO DO ALUNO NO 2º BIMESTRE
        System.out.println("A nota final do aluno " + nomeAluno + " no 2º Bimestre em " + disciplina + " foi: " + formatador.format(nota2Bimestre));
        
        
        
        //SOMAR AS NOTAS DO 1º E 2º BIMESTRE E CALCULAR A MÉDIA SEMESTRAL
        float mediaSemestral;
        mediaSemestral= ((nota1Bimestre + nota2Bimestre) / 2);
        //ESCREVA O RESULTADO DO CALCULO ARITIMÉTICO SIMPLES DA MÉDIDA SEMESTRAL DO ALUNO
        System.out.println("A média semestral do aluno " + nomeAluno + " em " + disciplina + " é: " + formatador.format(mediaSemestral));
        
        if (mediaSemestral >= 8) {
            System.out.println("O aluno " + nomeAluno + " está aprovado!");
        } else if (mediaSemestral<8){
            System.out.println("O aluno " + nomeAluno + " está em recuperação!");
        } if (mediaSemestral<8) {
            float notaMinima;
            notaMinima= (10 - mediaSemestral);
            System.out.println("Para ser aprovado o aluno " + nomeAluno + " precisa tirar uma pontuação de " + formatador.format(notaMinima) + " na prova final.");
        }
    }
    
}

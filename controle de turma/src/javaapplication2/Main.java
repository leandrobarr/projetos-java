package javaapplication2;

import java.util.Scanner;


public class Main
{

public static void main(String[]args) {
    Scanner s = new Scanner(System.in); // para ler os inputs;
Aluno[] turmaX = new Aluno[5];
turmaX[0] = new Aluno("Carlinho", 123456, 4);
turmaX[1] = new Aluno("Pedrinho", 123455, 4);
turmaX[2] = new Aluno("Joaozinho", 123454, 4);
turmaX[3] = new Aluno("Larissinha", 123453, 4);
turmaX[4] = new Aluno("Robertinho", 123452, 4);
for (Aluno aluno : turmaX){
    System.out.println("Aluno "+aluno.name);
    for(int i = 0; i<aluno.notas.length; i++){
        System.out.print(" - digite a nota "+(i+1)+": ");
        aluno.notas[i] = s.nextInt();
         if(!(aluno.notas[i] >= 0 && aluno.notas[i] <= 10)){
             i--;
             
         }
    }
        
    System.out.println();
    
}
double somaNotasAlunos = 0;
for (Aluno aluno : turmaX){
    double media = aluno.getMedia();
     System.out.println("Média do "+aluno.name+": " + media);
     somaNotasAlunos += media;
     
}
System.out.println();
System.out.println("Média da turma: "+ (Math.floor(somaNotasAlunos/turmaX.length*100)/100));

}

public static class Aluno{
    
    String name;
    int ra;
    double[] notas;
    
    public Aluno(String name, int ra, int notasSize){
        this.name = name;
            this.ra = ra;
            this.notas = new double[notasSize];
    }
    
    public double getMedia(){
        double total = 0;
         int q = 0; 
         for(q = 0; q < notas.length; q++){
              total+=notas[q];
         }
          return total/q;
    }
}
}


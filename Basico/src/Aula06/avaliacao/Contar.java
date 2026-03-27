package Aula06.avaliacao;

import java.util.Date;

public class Contar {
    static void contarMilhao(String msg) {

        for (int i=0; i<1000000; i++){
            System.out.println(i + "-" + msg);
        }
    }
    public static void main(String[] args){
        contarMilhao("Um");
        contarMilhao("Dois");
        contarMilhao("Três");
    }
}

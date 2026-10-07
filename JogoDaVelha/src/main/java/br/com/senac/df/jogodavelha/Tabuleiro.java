package br.com.senac.df.jogodavelha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caio61567586
 */
public class Tabuleiro {
    private int notaJ1;
    private int notaJ2;
    private String regras;
    public boolean houveGanhadorUltimaRodada;
    private int jogadorDaVez;
    private char  A1=' ', A2=' ', A3=' ', B1=' ', B2=' ', B3=' ', C1=' ', C2=' ', C3=' ';
    
    public int getJogadorDaVez() {
        return jogadorDaVez;
    }

    public void setJogadorDaVez(int jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }

    public int getNotaJ1() {
        return notaJ1;
    }

    public boolean isHouveGanhadorUltimaRodada() {
        return houveGanhadorUltimaRodada;
    }

    public void setHouveGanhadorUltimaRodada(boolean houveGanhadorUltimaRodada) {
        this.houveGanhadorUltimaRodada = houveGanhadorUltimaRodada;
    }

    public void setNotaJ1(int notaJ1) {
        this.notaJ1 = notaJ1;
    }

    public int getNotaJ2() {
        return notaJ2;
    }

    public void setNotaJ2(int notaJ2) {
        this.notaJ2 = notaJ2;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    
    public Tabuleiro( String regras) {
        this.notaJ1 = 0;
        this.notaJ2 = 0;
        this.regras = regras;
        this.houveGanhadorUltimaRodada = false;
        this.jogadorDaVez = 1;
    }
    
    public void verificarGanhador(char simbolo, int numeroJogador){
       if(A3 == simbolo && B2 == simbolo && C1 == simbolo) {
           this.houveGanhadorUltimaRodada = true;
       }
    else if (A1 == simbolo && B1 == simbolo && C1 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (A2 == simbolo && A2 == simbolo && C2 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
        
    }else if (B3 == simbolo && B3 == simbolo && C3 == simbolo) {
     this.houveGanhadorUltimaRodada = true;   
    }else if (A1 == simbolo && B2 == simbolo && C3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (C1 == simbolo && C2 == simbolo && C3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (B1 == simbolo && B2 == simbolo && B3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (A1 == simbolo && A2 == simbolo && A3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }else if (A1 == simbolo && B1 == simbolo && C1 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }
    }

    public void organizarTabuleiro(){
    
    }
    
    public void mostrarTabuleiro(){
    System.out.printf("""
                       A     B     C
                          |     |                 
                 1   %c    | %c   | %c
                     _____|_____|_____
                     
                 2        |     |     
                       %c  | %c   | %c 
                     _____|_____|_____
                     
                          |     |     
                 3   %c    | %c   | %c   
                          |     |                      """, A1, B1, C1, A2, B2, C2, A3, B3, C3 );
    
    }
    
    public void marcarJogada(char simbolo, String coordenada){
    switch(coordenada){
        case "A1":
        case  "a1":
                this.A1 = simbolo;
            break;
        case "A2":
        case  "a2":    
            this.A2 = simbolo;
            break;
        case "A3":
        case  "a3":    
                this.A3 = simbolo;
            break;
        case "B1":
        case  "b1":    
           this.B1 = simbolo;          
            break;
        case "B2": 
        case  "b2":
            this.B2 = simbolo;
        break;
        case "B3":
         case  "b3":    
            this.B3 = simbolo;
            break;
        case "C1":
        case  "c1":    
            this.C1 = simbolo;
        break;
        case "C2":
        case  "c2":    
            this.C2 = simbolo;
            break;
        case "C3":
        case  "c3":    
            this.C3 = simbolo;
            break;     
            
    }
    }
}
   
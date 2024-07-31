package br.com.newgo;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double altura;
    private double base;

    public Triangulo(double ladoA, double ladoB, double ladoC, double altura, double base) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
        this.base = base;
    }

    public double calcularAreaBaseAltura(){
        
        return this.base*this.altura/2;

    }

    

    public Integer calculateAreaHeron() {
        return 0;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    
    
    
}


package br.dev.eloisasantos.appobras;

/**
 *
 * @author sesi2dia
 */
public class Comodo {
    String nome;
    double largura;
    double comprimento;

    public Comodo() {
    }

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
    
   public double calcularArea(){ 
        return this.comprimento * this.largura; 
       
    }

    @Override
    public String toString() {
        return String.format("| %10s |    %.2f |        %.2f | %02.2f |",
                nome,
                largura,
                comprimento,
                this.calcularArea());
    }
   
    
}

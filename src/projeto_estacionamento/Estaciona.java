package projeto_estacionamento;

import javax.swing.JOptionPane;

public class Estaciona {
    
    public String modelo;
    public String placa;
    public double hora_entrada;
    public double min_entrada;
    public double hora_saida;
    public double min_saida;
    protected double preco;
    
    public double calculaTempo (double hora_entrada, double min_entrada, double hora_saida, double min_saida){
        
        double conv_ent = hora_entrada + min_entrada/60;
        double conv_saida = hora_saida + min_saida/60;
        
        double tempo = Math.ceil(conv_saida - conv_ent);      
        return tempo;

    }
    
    public void GeraNota (double tempo_total, double preco){
        
        double valor_total = tempo_total * preco;
        
        
        JOptionPane.showMessageDialog(null,"Dados: \n"
                + "Modelo: "+ getModelo()+"\n" + "Placa: "+getPlaca()+"\n"
                + "Hora de entrada: "+ getHora_entrada()+"h e "+ getMin_entrada()+"min \n"
                + "Hora de saída: "+ getHora_saida()+"h e "+ getMin_saida()+"min \n"
                + "Total de horas: " + tempo_total + " horas \n"
                + "Preço por hora: " + getPreco() + " reais \n"
                + "Valor total: " + valor_total + " reais");
    }

    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public double getHora_entrada(){
        return hora_entrada;
    }
    
    public void setHora_entrada(double hora_entrada){
        this.hora_entrada = hora_entrada;
    }
    
    public double getMin_entrada(){
        return min_entrada;
    }
    
    public void setMin_entrada(double min_entrada){
        this.min_entrada = min_entrada;
    }
    
    public double getHora_saida(){
        return hora_saida;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setHora_saida(double hora_saida){
        this.hora_saida = hora_saida;
    }
    
    public double getMin_saida(){
        return min_saida;
    }

    
    public void setMin_saida(double min_saida){
        this.min_saida = min_saida;
    }
      
}

package br.com.newton.LingProg.Pratica03;

public class Questao02 {
	import javax.swing.JOptionPane;

		public static void main(String[] args) {
			

	        String CPF;
	        String nome;

	        CPF =  JOptionPane.showInputDialog("Informe um CPF:");
	      
	        
	        nome =  JOptionPane.showInputDialog("Informe um nome :");
	        

	       
	            // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
	        if (VALIDACPF.isCPF(CPF) == true)
	        	JOptionPane.showMessageDialog(null,"CPF Válido"+ VALIDACPF.imprimeCPF(CPF));
	        else 	JOptionPane.showMessageDialog(null,"erro, CPF invalido !!!\n");
	        
	    
		}


}

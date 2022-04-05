package br.com.newton.LingProg.Pratica03;
import javax.swing.JOptionPane;

public class Questao_01 {
	

		public static void main(String[] args) {
		
			
			String nome = JOptionPane.showInputDialog("Digite o nome: ");
			String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
			
			JOptionPane.showMessageDialog(null, "Nome:
					"+nome,"Informação",JOptionPane.INFORMATION_MESSAGE);
		}

	}



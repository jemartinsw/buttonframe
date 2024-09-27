import javax.swing.JFrame;//Importa componente da biblioteca javax 

public class ButtonTest//Declra classe buttont
{//Inicio do bloco de codigos da classe buttontest
   public static void main(String[] args)//declração do método main (executor)
   { //Início do bloco de código do método principal
      ButtonFrame buttonFrame = new ButtonFrame(); //Declração da variável buttonframe do tipo buttonframe do arquivo buttonframe. O valor da variável que será atribuído é o objeto. Construtor sempre tem new antes.
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Define operação de fechamento padrão (exit on close).
      buttonFrame.setSize(275, 110); //Define tamanho do quadro
      buttonFrame.setVisible(true); //Define a visibilidade (true).
   } //Fecha bloco de código do método principal
}//Fecha bloco da classe

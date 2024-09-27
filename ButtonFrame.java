import java.awt.FlowLayout;// Importa componente, o quadrado das camdas renderizadas de modo fluído. Flowlayout é o responsivo do quadro.
import java.awt.event.ActionListener;// Importa dis acionadores d eevento, dentro do submodulo event e awt e biblioteca java; Escutador da ação do usuário;
import java.awt.event.ActionEvent;// Captura eventos da tela após a ação do usuário;
import javax.swing.JFrame;// Fornece estrutura pronta do quadro (titulo, divisão, icone, botôes de fechar maximizar, cor do fundo, formato arredondado);
import javax.swing.JButton;// Importa dois botões do modulo swing da biblioteca java;
import javax.swing.Icon;// Importa o fancy button;
import javax.swing.ImageIcon;// Importa o bug do ao posicionar mouse sobre o botão;
import javax.swing.JOptionPane;// Importa a mensagem que aparece ao clicar nos botões;

public class ButtonFrame extends JFrame // Declaração da classe buttonframe. Extends herda a herança jframe  
{// Início do bloco de códigos da classe buttonframe
   private final JButton plainJButton;// Declarações de variáveis de tipo comum ibutton. Final é somente leitura. Private é de uso exclusivo da classe, não é exportada, apenas importado
   private final JButton fancyJButton;//

   public ButtonFrame()// Construtor é exportado para o buttonTest.
   {// Inicio do boco de codigo 
      super("Testing Buttons");// Definidor do titulo superior;
      setLayout(new FlowLayout()); // setlayout é um metodo que define o layout que é a saída  das camadas. Define a saida das camadas.

      plainJButton = new JButton("Plain Button");// Atribui novo jbutton que envia nome do botão (plain button). 
      add(plainJButton);// Adiciona o plainbutton no jframe.

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));//Primeira imagem do inseto. É do tipo icon. há declaração de variável. dentro do imageicon é´enviado um parâmetro. Gatclass coleta classe que o imageicon está inserido.  
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));// Coleta recurso da imagem bug2.gif;
      fancyJButton = new JButton("Fancy Button", bug1);// Está sendo atribuído. Fancy button está snedo enviado com um parâmetro a mais, o bug1;
      fancyJButton.setRolloverIcon(bug2);//Declara a variável  invocando o metodo setrollovericon (coloca mouse por cima). Troca o bug1 por bug2.
      add(fancyJButton);// Adiciona o rollover na renderização. 

      ButtonHandler handler = new ButtonHandler();// Executa a operação manual (handler), do tipo buttonrandler (classe privativa que sera construida abaixo); Variável está sendo atribuída como new buttonhandler. Cria contrutor dele mesmo.
      fancyJButton.addActionListener(handler);// Escutador de ação recebe a exibição do objeto. 
      plainJButton.addActionListener(handler);// Escutador do nome do botão
   }// Incia bloc de codigo

   private class ButtonHandler implements ActionListener // Declaração de classe privativa buttonhandler. Injetou actionlistener como objeto
   {// new accttionlistener
      @Override// sobrescrito. 
      public void actionPerformed(ActionEvent event)// Para inserir ações no metodo que ja existe. Atuação é um conjunto de ações. Actionperformed precisa ser declarado com um parametro event que foi importado 
      {//
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "You pressed: %s", event.getActionCommand()));//o diálogo que será enviado ao usuário é uma mesangem. Para criar metodos usar nome sugestivo. O objeto pai é a classe, o botão. (.this significa declarar a própria classse). O seugndo parágrafo é uma string formatada. Virgula divide parâmetro. Texto do proprio objeto = getactioncommand.
      }// Finaliza bloco de codigo da classe actperformed
   } //Finaliza bloco de codigo buttonframe
}//Finaliza bloco de codigo 

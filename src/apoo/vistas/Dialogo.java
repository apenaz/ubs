package apoo.vistas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import apoo.basico.os.UBS;
import apoo.file.Filtros;
 
 
public class Dialogo implements ActionListener {
     
    // Declara componentes
    JLabel rotulo;
    JTextArea texto;
    JScrollPane barra;
    JButton botao1, botao2;
    JFileChooser dlg;
    BufferedReader buffer;
     
    // Declara variaveis
    String linha;
    List<UBS> ubss = new ArrayList<UBS>();
	List<UBS> ubsSelecionadasEstado = new ArrayList<UBS>();
	List<UBS> ubsSelecionadas = new ArrayList<UBS>();
	Filtros selecao = new Filtros();
	
    public Container criaPainel()
    {
        // Cria painel principal
        JPanel painel = new JPanel();
         
        // Define layout
        painel.setLayout(new BorderLayout());                       
        painel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
         
        // Cria componentes
        rotulo = new JLabel("Abra o arquivo");
        texto = new JTextArea();
        barra = new JScrollPane(texto);
        botao1 = new JButton("Abrir");
        botao2 = new JButton("Salvar");
        dlg = new JFileChooser();
                 
        // Cria barras de rolagem
        barra.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        barra.setPreferredSize(new Dimension(1000, 600));
             
        // Alinha componentes
        rotulo.setAlignmentX(Component.CENTER_ALIGNMENT);
                         
        // Define eventos dos botões
        botao1.addActionListener(this);
        botao2.addActionListener(this);
         
        // Cria novos paineis
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
         
        // Cria layouts
        painel1.setLayout(new BoxLayout(painel1, BoxLayout.PAGE_AXIS));
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.X_AXIS));        
         
        // Adiciona componentes aos paineis
        painel1.add(rotulo);
        painel1.add(Box.createVerticalStrut(10));
        painel1.add(barra);
        painel1.add(Box.createVerticalStrut(10));
         
        painel2.add(botao1);
        painel2.add(botao2);
                 
        // Adiciona paineis ao painel principal
        painel.add(painel1, BorderLayout.PAGE_START);
        painel.add(painel2, BorderLayout.CENTER);           
         
        return painel;
    }
     
    @Override
    public void actionPerformed(ActionEvent arg0) 
    {
      
        // Cria evento para os botões
        if (arg0.getSource() == botao1)
        {
            // Cria variavel de dialogo
            int retorno = dlg.showOpenDialog(texto);
          
            // Verifica dialogo
            if (retorno == JFileChooser.APPROVE_OPTION)
            {
                // Retorna nome do arquivo
                File arquivo = dlg.getSelectedFile();
                 
                // Cria um buffer para o arquivo
                try
                {                   
                     buffer = new BufferedReader(new FileReader(arquivo));
                } 
                 
                catch (FileNotFoundException e)             
                {
                    e.printStackTrace();
                }               
                 
                // Lê as linhas do buffer
                try
                {
                    linha = buffer.readLine();
                }
                 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
                 
                // Laço nas linhas do arquivo
                while (linha != null)
                {
                    
                    
                    ubss.add(new UBS(linha.split(",")));                       
 
                    try {
                        linha = buffer.readLine();
                    } 
                    catch (IOException e) 
                    {                       
                        e.printStackTrace();
                        continue;
                    }
                     
                }
                texto.append("total de ubs no país: " + ubss.size());
        		for (UBS ubs : ubss) {
        			if(selecao.estado(ubs, 23)) {
        				ubsSelecionadasEstado.add(ubs);
        			}
        		}
        		for (UBS ubs : ubsSelecionadasEstado) {
        			if( selecao.telefone(ubs, "Não se aplica") || selecao.estruturaFisica(ubs, 1) || selecao.estruturaFisicaAdaptacao(ubs, 1) || selecao.equipamentos(ubs, 1) || selecao.medicamentos(ubs, 1)){
        				ubsSelecionadas.add(ubs);
        			}
        			
        		}
        		texto.append("numero de ubs encontradas no estado: " +  ubsSelecionadasEstado.size());
        		texto.append("numero de ubs encontradas no estado com alguma deficiencia: " + ubsSelecionadas.size());
        		for (UBS ubs : ubsSelecionadas) {
        			texto.append(ubs.toString());
        		}
                
            }
        }
         
        // Cria evento para o botão
        if (arg0.getSource() == botao2)
        {
         
            int retorno = dlg.showSaveDialog(texto);
             
            if (retorno == JFileChooser.APPROVE_OPTION)
            {
                File arquivo = dlg.getSelectedFile();
                 
                // Cria buffer e grava o arquivo;
                try
                {
                    BufferedWriter grava = new BufferedWriter(new FileWriter(arquivo));
                    grava.write(texto.getText());
                    grava.close();
                }
                catch (IOException e) 
                {               
                    e.printStackTrace();
                }
            }   
             
        }
         
    }
 
    public static void criaGUI()
    {   
      // Cria formulario
      JFrame formulario = new JFrame("Encontra UBS");
      formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
      Dialogo dialogo = new  Dialogo();
       
      formulario.setContentPane(dialogo.criaPainel());
       
      formulario.pack();;
      formulario.setVisible(true);
    }
     
    public static void main(String[] args) {
         
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
             
                // Thread do swing
                criaGUI();
                 
            }
        });
    }
}
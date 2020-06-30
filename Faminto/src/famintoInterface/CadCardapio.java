package famintoInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadCardapio extends JFrame {

	private JPanel contentPane;
	private JTextField textname;
	private JTextField textprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadCardapio frame = new CadCardapio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadCardapio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 226, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto:");
		lblNomeDoProduto.setBounds(37, 12, 148, 15);
		contentPane.add(lblNomeDoProduto);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(37, 70, 70, 15);
		contentPane.add(lblPreo);
		
		textname = new JTextField();
		textname.setBounds(37, 39, 154, 19);
		contentPane.add(textname);
		textname.setColumns(10);
		
		textprice = new JTextField();
		textprice.setBounds(37, 96, 114, 19);
		contentPane.add(textprice);
		textprice.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textname.getText();
				double preco = Double.parseDouble(textprice.getText());
				Cardapio coca = new Refeicao(nome, preco);
				JOptionPane.showMessageDialog(null, "Cadastro efetuado: \n" + coca);
			}
		});
		btnCadastrar.setBounds(37, 133, 117, 25);
		contentPane.add(btnCadastrar);
	}

}

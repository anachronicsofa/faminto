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

public class CadBebida extends JFrame {

	private JPanel contentPane;
	private JTextField textname;
	private JTextField textprice;
	private JTextField textestoque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadBebida frame = new CadBebida();
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
	public CadBebida() {
		setTitle("Cadastro de Bebida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 246, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDaBebida = new JLabel("Nome da Bebida:");
		lblNomeDaBebida.setBounds(40, 12, 131, 15);
		contentPane.add(lblNomeDaBebida);
		
		textname = new JTextField();
		textname.setBounds(40, 39, 144, 19);
		contentPane.add(textname);
		textname.setColumns(10);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(40, 75, 70, 15);
		contentPane.add(lblPreo);
		
		textprice = new JTextField();
		textprice.setBounds(40, 105, 114, 19);
		contentPane.add(textprice);
		textprice.setColumns(10);
		
		JLabel lblQuantidadeEmEstoque = new JLabel("Quantidade em estoque:");
		lblQuantidadeEmEstoque.setBounds(40, 146, 186, 15);
		contentPane.add(lblQuantidadeEmEstoque);
		
		textestoque = new JTextField();
		textestoque.setBounds(40, 173, 114, 19);
		contentPane.add(textestoque);
		textestoque.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textname.getText();
				double preco = Double.parseDouble(textprice.getText());
				int estoque = Integer.parseInt(textestoque.getText());
				Cardapio bebida = new Bebida(nome, preco, estoque);
				JOptionPane.showMessageDialog(null, "Cadastro efetuado: \n" + bebida);
			}
		});
		btnCadastrar.setBounds(40, 219, 117, 25);
		contentPane.add(btnCadastrar);
	}

}

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

public class CadCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textname;
	private JTextField textaddress;
	private JTextField textphone;
	private JTextField textreference;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadCliente frame = new CadCliente();
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
	public CadCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(26, 12, 70, 15);
		contentPane.add(lblNome);
		
		textname = new JTextField();
		textname.setBounds(26, 38, 114, 19);
		contentPane.add(textname);
		textname.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setBounds(26, 71, 89, 15);
		contentPane.add(lblEndereo);
		
		textaddress = new JTextField();
		textaddress.setBounds(26, 98, 250, 19);
		contentPane.add(textaddress);
		textaddress.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(26, 129, 70, 15);
		contentPane.add(lblTelefone);
		
		textphone = new JTextField();
		textphone.setBounds(26, 156, 114, 19);
		contentPane.add(textphone);
		textphone.setColumns(10);
		
		JLabel lblReferencia = new JLabel("Referencia:");
		lblReferencia.setBounds(26, 188, 114, 15);
		contentPane.add(lblReferencia);
		
		textreference = new JTextField();
		textreference.setBounds(26, 216, 168, 19);
		contentPane.add(textreference);
		textreference.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textname.getText();
				String endereco = textaddress.getText();
				String telefone = textphone.getText();
				String referencia = textreference.getText();
				Cliente cliente = new Cliente(nome, endereco, telefone, referencia);
				JOptionPane.showMessageDialog(null, "Cadastro efetuado: \n" + cliente);				
			}
		});
		btnCadastrar.setBounds(26, 265, 117, 25);
		contentPane.add(btnCadastrar);
	}

}

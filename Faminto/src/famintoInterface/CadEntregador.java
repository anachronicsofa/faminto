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

public class CadEntregador extends JFrame {

	private JPanel contentPane;
	private JTextField textname;
	private JTextField textplaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadEntregador frame = new CadEntregador();
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
	public CadEntregador() {
		setTitle("Cadastrar Entregador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 214, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDoEntregador = new JLabel("Nome do Entregador:");
		lblNomeDoEntregador.setBounds(26, 12, 165, 15);
		contentPane.add(lblNomeDoEntregador);
		
		textname = new JTextField();
		textname.setBounds(26, 42, 114, 19);
		contentPane.add(textname);
		textname.setColumns(10);
		
		JLabel lblPlacaDoCarro = new JLabel("Placa do Carro:");
		lblPlacaDoCarro.setBounds(26, 73, 114, 15);
		contentPane.add(lblPlacaDoCarro);
		
		textplaca = new JTextField();
		textplaca.setBounds(26, 106, 114, 19);
		contentPane.add(textplaca);
		textplaca.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textname.getText();
				String placa = textplaca.getText();
				
				Entregador entregador = new Entregador(nome, placa);
				JOptionPane.showMessageDialog(null, "Cadastro de Entregador efetuado! \n" + entregador);	
				
			}
		});
		btnCadastrar.setBounds(26, 157, 105, 19);
		contentPane.add(btnCadastrar);
	}

}

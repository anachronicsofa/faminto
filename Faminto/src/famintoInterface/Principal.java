package famintoInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCardpio = new JMenu("Cardápio");
		menuBar.add(mnCardpio);
		
		JMenuItem mntmCadastrarRefeio = new JMenuItem("Cadastrar Refeição");
		mntmCadastrarRefeio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadCardapio().setVisible(true);
			}
		});
		mnCardpio.add(mntmCadastrarRefeio);
		
		JMenuItem mntmCadastrarBebida = new JMenuItem("Cadastrar Bebida");
		mntmCadastrarBebida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadBebida().setVisible(true);
			}
		});
		mnCardpio.add(mntmCadastrarBebida);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadCliente().setVisible(true);
			}
		});
		mnCliente.add(mntmCadastrar);
		
		JMenu mnEntregador = new JMenu("Entregador");
		menuBar.add(mnEntregador);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mntmCadastrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadEntregador().setVisible(true);
			}
		});
		mnEntregador.add(mntmCadastrar_1);
		
		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);
		
		JMenuItem mntmCadastrar_2 = new JMenuItem("Cadastrar");
		mntmCadastrar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadPedido().setVisible(true);
			}
		});
		mnPedido.add(mntmCadastrar_2);
		
		JMenuItem mntmBuscas = new JMenuItem("Buscas");
		mntmBuscas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadBuscas().setVisible(true);
			}
		});
		mnPedido.add(mntmBuscas);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

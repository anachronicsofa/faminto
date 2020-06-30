package famintoInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.List;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

public class CadBuscas extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadBuscas frame = new CadBuscas();
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
	public CadBuscas() {
		setTitle("Buscar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(223, 57, -145, 151);
		contentPane.add(table);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setBounds(78, 109, 161, 22);
		contentPane.add(progressBar);
		
		JLabel lblPrecisoDe = new JLabel("É preciso de um banco de dados:");
		lblPrecisoDe.setBounds(48, 70, 233, 15);
		contentPane.add(lblPrecisoDe);
	}
}

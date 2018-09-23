import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class ExercicioInterface {

	public static void main(String[] args) {

		// Criando os elementos gráficos
		JFrame janela = new JFrame("Janela Teste");
		JPanel painel = new JPanel();
		JLabel lblFeedback = new JLabel("FeedBack do Programa");
		JLabel lblNome = new JLabel("Digite seu nome: ");
		JLabel lblTelefone = new JLabel("Digite seu telefone: ");
		JLabel lblConsideracoes = new JLabel();
		JTextField txtNome = new JTextField(40);
		JTextField txtTelefone = new JTextField(30);
		JTextArea txtConsideracoes = new JTextArea(20, 80);
		JButton btnEnviar = new JButton("Enviar");
		JButton btnCancel = new JButton("Cancelar");

		// Editando uso do layout
		FlowLayout flow1 = new FlowLayout();
		BorderLayout border1 = new BorderLayout();
		GridLayout grid1 = new GridLayout(3, 2);

		// Conectando os elementos
		painel.add(lblFeedback, flow1);
		painel.add(lblNome);
		painel.add(txtNome);
		painel.add(lblTelefone);
		painel.add(txtTelefone);
		painel.add(lblConsideracoes);
		painel.add(txtConsideracoes);
		painel.add(btnEnviar);
		painel.add(btnCancel);
		janela.setContentPane(painel);

		// Editando Layout dos objetos
		lblFeedback.setBounds(210, 1, 200, 40);
		lblNome.setBounds(4, 4, 150, 100);
		txtNome.setBounds(110, 46, 320, 20);
		lblTelefone.setBounds(4, 40, 150, 100);
		txtTelefone.setBounds(120, 80, 100, 20);
		lblConsideracoes.setBounds(4, 90, 180, 100);
		txtConsideracoes.setBounds(180, 120, 250, 100);
		btnEnviar.setBounds(150, 250, 100, 40);
		btnCancel.setBounds(400, 250, 110, 40);

		// Quebra de linha dentro do Label, o JLabel entende HTML
		lblConsideracoes.setText("<html>Digite as suas considerações <br/>sobre o programa: </html>");

		// Brincando com as cores do programa
		lblFeedback.setForeground(Color.red);
		lblFeedback.setFont(new Font("Comic Sans", Font.PLAIN, 18));
		txtNome.setBorder(new LineBorder(Color.black));
		txtTelefone.setBorder(new LineBorder(Color.black));
		txtConsideracoes.setBorder(new LineBorder(Color.black));
		btnEnviar.setBorder(new LineBorder(Color.black));
		txtTelefone.setBorder(new LineBorder(Color.black));
		btnEnviar.setForeground(Color.white);
		btnCancel.setForeground(Color.white);
		btnEnviar.setBackground(Color.green);
		btnCancel.setBackground(Color.red);

		// Conectando o Layout Manager aos objetos
		painel.setLayout(null);

		// Tornando a janela vísivel
		janela.setSize(600, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

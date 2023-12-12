import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class View extends JFrame {
    private final JPanel workerJPanel =
        new JPanel(new GridLayout(2,2,5,5));
    private final JTextField numberJTextField = new JTextField();
    private final JButton goJButton = new JButton("Ir");
    private final JLabel fibonacciJLabel = new JLabel();

    // Componentes e variáveis para obter o próximo número de Fibonacci
    private final JPanel eventThreadJPanel =
        new JPanel(new GridLayout(2, 2, 5, 5));
    private long n1 = 0; // inicializa com o primeiro número de Fibonacci
    private long n2 = 1; // inicializa com o segundo número de Fibonacci
    private int count = 1; // número de Fibonacci atual para exibir
    private final JLabel nJLabel = new JLabel("Fibonacci de 1: ");
    private final JLabel nFibonacciJLabel =
        new JLabel(String.valueOf(n2));
    private final JButton nextNumberJButton = new JButton("Próximo");

    // Componentes e variáveis para obter conexão com MySQL
    private final JPanel sqlJPanel =
        new JPanel(new GridLayout(2, 2, 5, 5));
    private final JTextField sqlJTextField = new JTextField();
    private final JButton sqlJButton = new JButton("Pesquisar");
    private final JLabel sqlJLabel = new JLabel();

    // construtor
    public View()
    {
        super("Números de Fibonacci");
        setLayout(new GridLayout (2, 1, 10, 10));

        workerJPanel.setBorder(new TitledBorder(
            new LineBorder(Color.magenta), "Com SwingWorker"));
        workerJPanel.add(new JLabel("Ver Fibonacci de:"));
        workerJPanel.add(numberJTextField);
        goJButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    int n;

                    try
                    {
                        // recupera a entrada do usuário como um inteiro
                        n = Integer.parseInt(numberJTextField.getText());
                    }
                    catch(NumberFormatException ex)
                    {
                        // exibe uma mensagem de erro se o usuário não inseriu
                        // um número inteiro
                        fibonacciJLabel.setText("Digite um número inteiro.");
                        return;
                    }

                    // indica que o cálculo começou
                    fibonacciJLabel.setText("Calculando...");

                    // cria uma tarefa para realizar o cálculo em segundo plano
                    FibonacciNumbers task =
                        new FibonacciNumbers(n, fibonacciJLabel);
                    task.execute(); // executa a tarefa
                }
            } // fim da classe interna anônima
        ); // fim da chamada para addActionListener
        workerJPanel.add(goJButton);
        workerJPanel.add(fibonacciJLabel);

        // parei aqui...
        eventThreadJPanel.setBorder(new TitledBorder(
            new LineBorder(Color.BLACK), "Sem SwingWorker"));
        eventThreadJPanel.add(nJLabel);
        eventThreadJPanel.add(nFibonacciJLabel);
        nextNumberJButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    // calcula o número de Fibonacci após n2
                    long temp = n1 + n2;
                    n1 = n2;
                    n2 = temp;
                    ++count;

                    // exibe o próximo número de Fibonacci
                    nJLabel.setText("Fibonacci of " + count + ": ");
                    nFibonacciJLabel.setText(String.valueOf(n2));
                }
            } // fim da classe interna anônima
        ); // fim da chamada para addActionListener
        eventThreadJPanel.add(nextNumberJButton);

        // nova grid com conexão com mysql
        sqlJPanel.setBorder(new TitledBorder(
            new LineBorder(Color.BLUE), "Pesquisa senha de usuário"));
        sqlJPanel.add(sqlJTextField);
        sqlJPanel.add(sqlJLabel);
        sqlJButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    // indica que a pesquisa começou
                    sqlJLabel.setText("Pesquisando...");

                    // realiza a busca sql e retorna as informações
                    String sqlResultado = Model.selSql(sqlJTextField.getText());
                    sqlJLabel.setText("A senha do usuário é: " + sqlResultado);
                }
            }
        );
        sqlJPanel.add(sqlJButton);

        add(workerJPanel);
        add(eventThreadJPanel);
        add(sqlJPanel);
        setSize(800, 800);
        setVisible(true);
    } // fim do construtor
}
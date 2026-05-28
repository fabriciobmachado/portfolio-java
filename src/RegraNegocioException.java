// Herdando de Exception, o Java entende que isso agora é um erro oficial
public class RegraNegocioException extends Exception {

    // Construtor que recebe a mensagem de erro customizada
    public RegraNegocioException(String mensagem) {
        super(mensagem);
    }
}
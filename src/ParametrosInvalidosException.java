public class ParametrosInvalidosException extends RuntimeException{

    private String mensagem;

    public ParametrosInvalidosException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }

}

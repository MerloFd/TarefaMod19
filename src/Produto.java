@Tabela("Tabela tal")
public class Produto {
    @Tabela("Tabela Nome")
    private String nome;
    private Double valor;
    private String codigo;


    public Produto(String nome, Double valor, String codigo){
        this.nome=nome;
        this.valor=valor;
        this.codigo=codigo;
    }

}

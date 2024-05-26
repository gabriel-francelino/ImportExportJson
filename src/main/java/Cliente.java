import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;
}

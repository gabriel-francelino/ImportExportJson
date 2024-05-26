public class Main {
    public static void main(String[] args) {
        Endereco endereco = Endereco.builder()
                .rua("Rua das Pedras")
                .numero(123)
                .bairro("Jardim das Rosas")
                .cidade("Minas Gerais")
                .estado("MG")
                .cep("12345-678")
                .build();

        Cliente cliente = Cliente.builder()
                .nome("Gabriel")
                .email("gab@gmail.com")
                .cpf("123.456.789-00")
                .telefone("(11) 98765-4321")
                .endereco(endereco)
                .build();

        JsonConverter jsonConverter = new JsonConverter();

        // Converter para Json e baixar o arquivo
        jsonConverter.convertToJson(cliente);

        // Importar de Json e converter para objeto
        Cliente clienteFromJson = jsonConverter.convertFromJson("src/main/resources/cliente.json");
        System.out.println(clienteFromJson.toString());
    }
}

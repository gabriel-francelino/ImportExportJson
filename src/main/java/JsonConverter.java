import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonConverter {

    ObjectMapper objectMapper;

    public JsonConverter() {
        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public void convertToJson(Cliente cliente) {
        try {
            File filePath = new File("src/main/resources/cliente.json");
            objectMapper.writeValue(filePath, cliente);
            System.out.println("JSON file created!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Cliente convertFromJson(String jsonPath) {
        Cliente cliente = null;

        try {
            File filePath = new File(jsonPath);
            cliente = objectMapper.readValue(filePath, Cliente.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cliente;
    }

}
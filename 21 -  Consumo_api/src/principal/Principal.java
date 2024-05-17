package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;

public class Principal {

    public static void main(String[] args) {
        
        GestionUsuarios ventana = new GestionUsuarios();

        ConsumoAPI consumo = new ConsumoAPI();

        // Endpoint obtener
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");

        System.out.println("Respuesta: " + respuesta01);
        // Endpoint insertar
        Map<String, String> datosInsertar = new HashMap<>();
        datosInsertar.put("cedula", "123123123");
        datosInsertar.put("nombres", "Cristian David");
        datosInsertar.put("apellidos", "Peña Arce");
        datosInsertar.put("telefono", "0900909");
        datosInsertar.put("direccion", "Samaria 1");
        datosInsertar.put("email", "cris@cris");
        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
        System.out.println("Respuesta insertar: " + respuesta02);

        // Endpoint actualizar
        Map<String, String> datosActualizar = new HashMap<>();
        datosActualizar.put("cedula", "123123123");
        datosActualizar.put("nombres", "Cristian");
        datosActualizar.put("apellidos", "Peña");
        datosActualizar.put("telefono", "0000000000");
        datosActualizar.put("direccion", "pereira 2");
        datosActualizar.put("email", "cristian@email");
        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
        System.out.println("Respuesta Actualizar: " + respuesta03);
        
//        Endpoint eilminar
//        Map<String, String> datosEliminar = new HashMap<>();
//        datosEliminar.put("cedula", "123123123");
//        String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
//        System.out.println("Respuesta eliminar: " + respuesta04);
//        
//        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
//        
//        for (int i = 0; i<registros.size(); i++){
//            JsonObject temp = registros.get(i).getAsJsonObject();
//            String nombres = temp.get("nombres").getAsString();
//            String apellidos = temp.get("apellidos").getAsString();
//            System.out.println(nombres + " " + apellidos);
//        }
    }
}

package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiFacade {


    // ===== Facade Method (The Facade Method for the Client can use) =====
    public String getAttributeValueFromJson(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {

        String json = getJsonFromApi(urlString);
        return extractAttributeFromJson(json, attributeName);
    }



    // ===== Subsystem: HTTP =====
    private String getJsonFromApi(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json");

        try (BufferedReader in =
                     new BufferedReader(new InputStreamReader(con.getInputStream()))) {

            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();

        } finally {
            con.disconnect();
        }
    }

    // ===== Subsystem: JSON Parsing =====
    private String extractAttributeFromJson(String json, String attributeName) {

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            if (!jsonObject.containsKey(attributeName)) {
                throw new IllegalArgumentException(
                        "Attribute '" + attributeName + "' not found in JSON");
            }

            return jsonObject.get(attributeName).toString();

        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid JSON format");
        }
    }
}

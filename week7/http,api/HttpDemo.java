import com.mashape.unirest.http.Headers;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;


public class HttpDemo {

    public static void main(String[] args) {
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("https://api.chucknorris.io/jokes/random")
                                                        .asJson();


            int status = jsonResponse.getStatus();
            if (status == 200 || status == 201) {
                JsonNode node = jsonResponse.getBody();
                JSONObject obj = node.getObject();
                String category;
                if (obj.isNull("category")) {
                    category = null;
                } else {
                    category = obj.getString("category");
                }
                String icon_url = obj.getString("icon_url");
                String id = obj.getString("id");
                String url = obj.getString("url");
                String value = obj.getString("value");
                Joke random_joke;
                if (category == null) {
                    random_joke = new Joke(icon_url, id, url, value);
                } else {
                    random_joke = new Joke(category, icon_url, id, url, value);
                }
                System.out.println(random_joke.getValue());
                // TODO: store jokes in an ArrayList

                // TODO: store jokes into the SQLite Database

                // TODO: JavaFX app, make a simple button to send a new request to get a new joke
            }
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Engine {
    public static void main(String[] args) {
         JSONParser parser = new JSONParser();
         try{
            Object obj = parser.parse(new FileReader("db.json"));
            JSONObject db = (JSONObject)obj;
            String name = (String)jsonObject.get("teams");
            System.out.println(name);
         }
         catch(Exception e){
            e.printStackTrace();
         }
    }
}

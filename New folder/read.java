import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class JSONReadFromTheFileTest {
   public static void main(String[] args) {
      JSONParser parser = new JSONParser();
      try {
         Object obj = parser.parse(new FileReader("/Users/User/Desktop/solr-8.11.2/example/exampledocs/patent_data.json"));
         JSONObject jsonObject = (JSONObject)obj;
         String patent_number = (String)jsonObject.get("patent_number");
         String patent_date = (String)jsonObject.get("patent_date");
         String patent_title = (String)jsonObject.get("patent_title");
         JSONArray subjects = (JSONArray)jsonObject.get("patents");
         System.out.println("patent_number: " + patent_number);
         System.out.println("patent_date: " + patent_date);
         System.out.println("patent_title:"+patent_title);
         Iterator iterator = subjects.iterator();
         while (iterator.hasNext()) {
            System.out.println(iterator.next());
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}
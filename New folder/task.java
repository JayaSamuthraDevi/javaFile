import java.io.IOException;    
  
import org.apache.Solr.client.Solrj.SolrClient;   
import org.apache.Solr.client.Solrj.SolrServerException;   
import org.apache.Solr.client.Solrj.impl.HttpSolrClient;   
import org.apache.Solr.common.SolrInputDocument;   
  
public class AddingDocument {   
   public static void main(String args[]) throws Exception {   
      //Prepare the Solr client   
      String urlString = "http://localhost:8983/Solr/my_core";   
      SolrClient Solr = new HttpSolrClient.Builder(urlString).build();     
        
      //Prepare the Solr doc.   
      SolrInputDocument doc = new SolrInputDocument();   
     
      //Add fields to the doc.  
   /*   doc.addField("id", "003");   
      doc.addField("name", "Rajaman");   
      doc.addField("age","34");   
      doc.addField("addr","vishakapatnam");  */ 
           
      //Add the doc. to Solr   
      Solr.add(doc);           
           
      //Save the changes   
      Solr.commit();   
      System.out.println("Documents added");   
   }   
}

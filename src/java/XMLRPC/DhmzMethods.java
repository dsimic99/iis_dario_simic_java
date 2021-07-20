package XMLRPC;

import Model.Grad;
import Utils.Utilities;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class DhmzMethods {

    public Node podaciOGradu(String naziv) throws IOException, XPathExpressionException {
          URL url = new URL("https://vrijeme.hr/hrvatska_n.xml");
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        String body = IOUtils.toString(in, encoding);
        Document doc = Utilities.convertStringToXmlDocument(body);
        
        XPath xPath = XPathFactory.newInstance().newXPath();
        Node node = (Node)xPath.compile("/Hrvatska/Grad[GradIme = '"+naziv+"']").evaluate(doc, XPathConstants.NODE);

        return node;
    }
    
    public Document sviGradovi() throws IOException, XPathExpressionException {
          URL url = new URL("https://vrijeme.hr/hrvatska_n.xml");
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        String body = IOUtils.toString(in, encoding);
        Document doc = Utilities.convertStringToXmlDocument(body);
        
        

        return doc;
    }

}

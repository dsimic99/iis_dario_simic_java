package XMLRPC;

import java.io.IOException;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class Dhmz {

    public static void main(String[] args) throws XmlRpcException, IOException {
        
        WebServer server=new WebServer(1312);
        
        XmlRpcServer xmlServer=server.getXmlRpcServer();
        PropertyHandlerMapping phm=new PropertyHandlerMapping();
        phm.addHandler("Vrijeme", DhmzMethods.class);
        xmlServer.setHandlerMapping(phm);
        
        XmlRpcServerConfigImpl serverConfig=(XmlRpcServerConfigImpl)xmlServer.getConfig();
        serverConfig.setContentLengthOptional(false);
        serverConfig.setEnabledForExtensions(true);
        
        server.start();
    }
    
}

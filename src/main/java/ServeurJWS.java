import SRV_JaxWS.BanqueService;
import jakarta.xml.ws.Endpoint;

import java.sql.SQLOutput;

public class ServeurJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web Service déployé sur http://0.0.0.0:9191/");
    }
}
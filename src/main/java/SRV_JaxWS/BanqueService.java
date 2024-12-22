package SRV_JaxWS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam (name = "montant") double mt) {
        return mt*10.01;
    }
    @WebMethod
    public compte getcompte(@WebParam (name = "code") int code){
        return new compte(code, Math.random()*7582, new Date());

    }
    @WebMethod
    public List<compte> Listcomptes(){
        return List.of(
                new compte(1,Math.random()*7582, new Date()),
                new compte(2,Math.random()*7582, new Date()),
                new compte(3,Math.random()*7582, new Date())
                );

    }
}

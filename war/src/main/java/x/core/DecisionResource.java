package x.core;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
@RequestScoped
@RolesAllowed("A")
public class DecisionResource {

    @GET
    public String get() {
        return "OK";
    }

}

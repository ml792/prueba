package permiso;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;


@Path("/")
public class Recursos {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("public")
    public Mensaje getPublic(@Context HttpHeaders header, @Context HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return new Mensaje("public");
    }
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("secured")
    public Mensaje getSecured() {
        return new Mensaje("secured");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("admin")
    public Mensaje getAdmin() {
        return new Mensaje("admin");
    }
    
}

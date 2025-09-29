package at.htl.primer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/time")
public class TimeServerResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTime() {
        return "Zeit: " + java.time.LocalTime.now().toString();
    }

}

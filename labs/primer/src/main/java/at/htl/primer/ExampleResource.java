package at.htl.primer;

import at.htl.primer.entity.Person;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class ExampleResource {

    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Person hello() {
        return new Person("Hanan", "Mehic");
    }

    @Path("response")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello2() {
        return Response
                .ok()
                .entity(new Person("Hanan", "Mehic"))
                .header("my-token", "abc123")
                .build();
    }

}

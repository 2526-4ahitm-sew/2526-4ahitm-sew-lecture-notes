package at.htl.primer;

import at.htl.primer.entity.Person;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Person hello() {
        return new Person("Hanan", "Mehic");
    }


}

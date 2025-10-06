package at.htl.primer.boundary;

import at.htl.primer.entity.Person;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("persons")
public class PersonResource {

    @GET
    @Path("string")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonByString() {
        return "[{\"firstName\":\"Hanan\",\"lastName\":\"Mehic\"}]";
    }

    @GET
    @Path("entity")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonByJackson() {
        Person hanan = new Person("Hanan", "Mehic");
        return hanan;
    }

    @GET
    @Path("response")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonByResponse() {
        Person hanan = new Person("Hanan", "Mehic");
        return Response
                .ok(hanan)
                .header("my-header-entry","xxx")
                .build();
    }



}

package at.htl.album.boundary;

import at.htl.album.control.PhotoRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("photos")
public class PhotoResource {

    @Inject
    PhotoRepository photoRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPhotos() {
        return Response.ok(
                photoRepository.getPhotos()
        ).build();
    }

}

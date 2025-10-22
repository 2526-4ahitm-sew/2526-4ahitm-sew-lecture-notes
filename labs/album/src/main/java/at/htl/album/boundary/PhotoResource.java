package at.htl.album.boundary;

import at.htl.album.control.PhotoRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("photos")
public class PhotoResource {

    @Inject
    PhotoRepository photoRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPhotos() {
        return Response.ok(
                photoRepository.findWithNamedQueryAllPhotos()
        ).build();
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("title")
    public Response findByTitle(
            @QueryParam("title") String title
    ) {
        return Response.ok(
                photoRepository.findByTitle(title)
        ).build();
    }

}

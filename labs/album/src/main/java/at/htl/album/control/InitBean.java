package at.htl.album.control;

import at.htl.album.entity.Photo;
import io.quarkus.logging.Log;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Transient;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class InitBean {

    @Inject
    PhotoRepository photoRepository;

    @Transactional
    void init(@Observes StartupEvent event) {
        Log.info("Application is starting up...");
//        photoRepository.insert(
//                new Photo(
//                        1l
//                        , null
//                        , "xy accusamus beatae ad facilis cum similique qui sunt"
//                        , "https://via.placeholder.com/600/92c952"
//                        , "https://via.placeholder.com/150/92c952"
//                )
//        );
        photoRepository.initDatabase();


        // find(...)
        var p = photoRepository.findById(1L);
        Log.info("Found photo with id: " + p);


        // query (mit JP-QL)
        //Log.info(photoRepository.findWithQueryAllPhotos());



        // named queries with Parameter ...
        Log.info(photoRepository.findByTitle("similique"));

        // native queries ...


    }

}

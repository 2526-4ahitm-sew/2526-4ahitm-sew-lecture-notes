package at.htl.album.control;

import at.htl.album.entity.Photo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class PhotoRepositoryTest {

    @Inject
    PhotoRepository photoRepository;

    List<Photo> photos= Arrays.asList(
            new Photo(1L, 1L, "accusamus beatae ad facilis cum similique qui sunt", "https://via.placeholder.com/600/92c952", "https://via.placeholder.com/150/92c952"),
            new Photo(1L, 2L, "reprehenderit est deserunt velit ipsam", "https://via.placeholder.com/600/771796", "https://via.placeholder.com/150/771796"),
            new Photo(1L, 3L, "officia porro iure quia iusto qui ipsa ut modi", "https://via.placeholder.com/600/24f355", "https://via.placeholder.com/150/24f355"),
            new Photo(1L, 4L, "culpa odio esse rerum omnis laboriosam voluptate repudiandae", "https://via.placeholder.com/600/d32776", "https://via.placeholder.com/150/d32776"),
            new Photo(1L, 5L, "natus nisi omnis corporis facere molestiae rerum in", "https://via.placeholder.com/600/f66b97", "https://via.placeholder.com/150/f66b97"),
            new Photo(1L, 6L, "accusamus ea aliquid et amet sequi nemo", "https://via.placeholder.com/600/56a8c2", "https://via.placeholder.com/150/56a8c2"),
            new Photo(1L, 7L, "officia delectus consequatur vero aut veniam explicabo molestias", "https://via.placeholder.com/600/b0f7cc", "https://via.placeholder.com/150/b0f7cc"),
            new Photo(1L, 8L, "aut porro officiis laborum odit ea laudantium corporis", "https://via.placeholder.com/600/54176f", "https://via.placeholder.com/150/54176f"),
            new Photo(1L, 9L, "qui eius qui autem sed", "https://via.placeholder.com/600/51aa97", "https://via.placeholder.com/150/51aa97"),
            new Photo(1L, 10L, "beatae et provident et ut vel", "https://via.placeholder.com/600/810b14", "https://via.placeholder.com/150/810b14")

    );
    @Test
    void getPhotos_getAllPhotos_returnAllPhotos() throws JsonProcessingException {
        assertThat(photoRepository.getPhotos()).isNotNull();
        assertThat(photoRepository.getPhotos()).isNotEmpty();
        assertThat(photoRepository.getPhotos().size()).isEqualTo(10);
        assertThat(photoRepository.getPhotos())
                .usingRecursiveFieldByFieldElementComparator()
                .isEqualTo(photos);





    }
}
package at.htl.album.control;

import at.htl.album.entity.Photo;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;
import java.util.List;

/**
 * {
 * "albumId": 1,
 * "id": 1,
 * "title": "accusamus beatae ad facilis cum similique qui sunt",
 * "url": "https://via.placeholder.com/600/92c952",
 * "thumbnailUrl": "https://via.placeholder.com/150/92c952"
 * },
 * {
 * "albumId": 1,
 * "id": 2,
 * "title": "reprehenderit est deserunt velit ipsam",
 * "url": "https://via.placeholder.com/600/771796",
 * "thumbnailUrl": "https://via.placeholder.com/150/771796"
 * },
 * {
 * "albumId": 1,
 * "id": 3,
 * "title": "officia porro iure quia iusto qui ipsa ut modi",
 * "url": "https://via.placeholder.com/600/24f355",
 * "thumbnailUrl": "https://via.placeholder.com/150/24f355"
 * },
 * {
 * "albumId": 1,
 * "id": 4,
 * "title": "culpa odio esse rerum omnis laboriosam voluptate repudiandae",
 * "url": "https://via.placeholder.com/600/d32776",
 * "thumbnailUrl": "https://via.placeholder.com/150/d32776"
 * },
 * {
 * "albumId": 1,
 * "id": 5,
 * "title": "natus nisi omnis corporis facere molestiae rerum in",
 * "url": "https://via.placeholder.com/600/f66b97",
 * "thumbnailUrl": "https://via.placeholder.com/150/f66b97"
 * },
 * {
 * "albumId": 1,
 * "id": 6,
 * "title": "accusamus ea aliquid et amet sequi nemo",
 * "url": "https://via.placeholder.com/600/56a8c2",
 * "thumbnailUrl": "https://via.placeholder.com/150/56a8c2"
 * },
 * {
 * "albumId": 1,
 * "id": 7,
 * "title": "officia delectus consequatur vero aut veniam explicabo molestias",
 * "url": "https://via.placeholder.com/600/b0f7cc",
 * "thumbnailUrl": "https://via.placeholder.com/150/b0f7cc"
 * },
 * {
 * "albumId": 1,
 * "id": 8,
 * "title": "aut porro officiis laborum odit ea laudantium corporis",
 * "url": "https://via.placeholder.com/600/54176f",
 * "thumbnailUrl": "https://via.placeholder.com/150/54176f"
 * },
 * {
 * "albumId": 1,
 * "id": 9,
 * "title": "qui eius qui autem sed",
 * "url": "https://via.placeholder.com/600/51aa97",
 * "thumbnailUrl": "https://via.placeholder.com/150/51aa97"
 * },
 * {
 * "albumId": 1,
 * "id": 10,
 * "title": "beatae et provident et ut vel",
 * "url": "https://via.placeholder.com/600/810b14",
 * "thumbnailUrl": "https://via.placeholder.com/150/810b14"
 * }
 */

@ApplicationScoped
public class PhotoRepository {


    public List<Photo> getPhotos() {
        return Arrays.asList(
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
    }


}

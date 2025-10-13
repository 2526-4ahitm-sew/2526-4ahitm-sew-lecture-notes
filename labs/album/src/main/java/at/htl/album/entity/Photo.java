package at.htl.album.entity;

public class Photo {
    private Long albumId;
    private Long id;
    private String title;
    private String url;
    private String thumbnailUrl;


    public Photo() {
    }

    public Photo(Long albumId, Long id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }




    /**
     * "albumId": 1,
     *     "id": 4,
     *     "title": "culpa odio esse rerum omnis laboriosam voluptate repudiandae",
     *     "url": "https://via.placeholder.com/600/d32776",
     *     "thumbnailUrl": "https://via.placeholder.com/150/d32776"
     */


    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}

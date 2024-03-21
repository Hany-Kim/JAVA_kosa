package DAY_03_21.movieManager;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private String genre;
    private String director;
    private String mainActor;
    private String releaseDate;
}

package DAY_03_21.movieManager;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String title; // 제목
    private String genre; // 장르
    private String director; // 감독
    private String mainActor; // 주연
    private String releaseDate; // 개봉일
}

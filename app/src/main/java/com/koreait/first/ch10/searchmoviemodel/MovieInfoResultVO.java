package com.koreait.first.ch10.searchmoviemodel;

import java.util.List;

public class MovieInfoResultVO {
    private MovieInfoVO MovieInfo;
    private String source;

    public MovieInfoVO getMovieInfo() {
        return MovieInfo;
    }

    public void setMovieInfo(MovieInfoVO movieInfo) {
        MovieInfo = movieInfo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

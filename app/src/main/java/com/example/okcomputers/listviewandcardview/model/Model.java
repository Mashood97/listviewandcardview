package com.example.okcomputers.listviewandcardview.model;

/**
 * Created by OK Computers on 7/18/2018.
 */

public class Model {
    private int movieImage;
    private String movieTitle;

    public Model(int movieId, String movieTitle) {
        this.movieImage = movieId;
        this.movieTitle = movieTitle;

    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieId) {
        this.movieImage = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }


}

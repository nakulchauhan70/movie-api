package com.movie;

public class Genre {
    private int genreId;
    private String gender;

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", gender='" + gender + '\'' +
                '}';
    }
}

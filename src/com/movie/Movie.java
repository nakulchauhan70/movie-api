package com.movie;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private int movieId;
    private String title;
    private List<Genre> genre;
    private List<Cast> casts;
    private long budget;
    private String homepage;
    private List<Production> productions;
    private LocalDate releaseDate;
    private long revenue;
    private int runtimeInMinutes;
    private List<SpokenLanguages> spokenLanguagesList;
    private String tagLine;
    private String originalMovieLanguage;
    private String overview;
    private VoteDetails voteDetails;
}

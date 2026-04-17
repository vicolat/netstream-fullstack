package com.netstream.backend.dto;

import jakarta.validation.constraints.NotBlank;

public class MovieDTO {

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @NotBlank(message = "Genre cannot be empty")
    private String genre;

    private String trailerUrl;

    private String posterUrl;

    // Default constructor
    public MovieDTO() {}

    // Constructor with all fields
    public MovieDTO(String title, String genre, String trailerUrl, String posterUrl) {
        this.title = title;
        this.genre = genre;
        this.trailerUrl = trailerUrl;
        this.posterUrl = posterUrl;
    }

    // Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Trailer URL
    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    // Poster URL
    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
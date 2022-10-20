package org.opencsd.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("mediacontent")
public class Content extends BaseModel {

    private String credit;
    private String title;
    private String category;
    private String genre;
    private String releaseDate;


    private String ordering;
    private String language;
    private boolean isOriginal;
    private long runTime;
    private boolean isAdult;

    public Content(String title, String category, String genre, String releaseDate) {
        this.title = title;
        this.category = category;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOrdering() {
        return ordering;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    public void setOriginal(boolean original) {
        isOriginal = original;
    }

    public long getRunTime() {
        return runTime;
    }

    public void setRunTime(long runTime) {
        this.runTime = runTime;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}

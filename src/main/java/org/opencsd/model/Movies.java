package org.opencsd.model;

import java.util.List;

public class Movies extends Content{
    public Movies(String title, String category, String genre, String releaseDate) {
        super(title, category, genre, releaseDate);
    }

    private List<String> cast;
    private String Director;
    private String Writer;
    private String plotLine;

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getPlotLine() {
        return plotLine;
    }

    public void setPlotLine(String plotLine) {
        this.plotLine = plotLine;
    }
}

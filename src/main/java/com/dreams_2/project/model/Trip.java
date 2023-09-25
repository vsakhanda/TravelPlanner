package com.dreams_2.project.model;

import java.util.Objects;

public class Trip {

    private int id;
    private String name;
    private int author;
    private String description;
    private String datetime;
    private boolean is_compleated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public boolean isIs_compleated() {
        return is_compleated;
    }

    public void setIs_compleated(boolean is_compleated) {
        this.is_compleated = is_compleated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trip trips = (Trip) o;

        if (id != trips.id) return false;
        if (author != trips.author) return false;
        if (is_compleated != trips.is_compleated) return false;
        if (!Objects.equals(name, trips.name)) return false;
        if (!Objects.equals(description, trips.description)) return false;
        return Objects.equals(datetime, trips.datetime);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + author;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        result = 31 * result + (is_compleated ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "trips{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", description='" + description + '\'' +
                ", datetime='" + datetime + '\'' +
                ", is_compleated=" + is_compleated +
                '}';
    }
}

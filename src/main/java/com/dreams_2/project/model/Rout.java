package com.dreams_2.project.model;

import java.util.Objects;

public class Rout {

    private int id;
    private String name;
    private String author;
    private String description;
    private String startpoint;
    private String endpoint;
    private boolean is_private;
    private boolean is_round_route;

    //point<List point>;


    public Rout(int id) {
        this.id = id;
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public boolean isIs_private() {
        return is_private;
    }

    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    public boolean isIs_round_route() {
        return is_round_route;
    }

    public void setIs_round_route(boolean is_round_route) {
        this.is_round_route = is_round_route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rout routs = (Rout) o;

        if (id != routs.id) return false;
        if (is_private != routs.is_private) return false;
        if (is_round_route != routs.is_round_route) return false;
        if (!Objects.equals(name, routs.name)) return false;
        if (!Objects.equals(author, routs.author)) return false;
        if (!Objects.equals(description, routs.description)) return false;
        if (!Objects.equals(startpoint, routs.startpoint)) return false;
        return Objects.equals(endpoint, routs.endpoint);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startpoint != null ? startpoint.hashCode() : 0);
        result = 31 * result + (endpoint != null ? endpoint.hashCode() : 0);
        result = 31 * result + (is_private ? 1 : 0);
        result = 31 * result + (is_round_route ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "routs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", startpoint='" + startpoint + '\'' +
                ", endpoint='" + endpoint + '\'' +
                ", is_private=" + is_private +
                ", is_round_route=" + is_round_route +
                '}';
    }
}

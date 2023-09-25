package com.dreams_2.project.model;

import java.util.Objects;

public class Point {

    private int id;
    private String name;
    private double latitude;
    private double  longitude;
    private String description;
    private String point_adress;
    private String phone_number;
    private String link;
    private String district;
    private String regions ;


    public Point(int id) {
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoint_adress() {
        return point_adress;
    }

    public void setPoint_adress(String point_adress) {
        this.point_adress = point_adress;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point points = (Point) o;

        if (id != points.id) return false;
        if (Double.compare(latitude, points.latitude) != 0) return false;
        if (Double.compare(longitude, points.longitude) != 0) return false;
        if (!Objects.equals(name, points.name)) return false;
        if (!Objects.equals(description, points.description)) return false;
        if (!Objects.equals(point_adress, points.point_adress))
            return false;
        if (!Objects.equals(phone_number, points.phone_number))
            return false;
        if (!Objects.equals(link, points.link)) return false;
        if (!Objects.equals(district, points.district)) return false;
        return Objects.equals(regions, points.regions);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (point_adress != null ? point_adress.hashCode() : 0);
        result = 31 * result + (phone_number != null ? phone_number.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (regions != null ? regions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "points{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", description='" + description + '\'' +
                ", point_adress='" + point_adress + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", link='" + link + '\'' +
                ", district='" + district + '\'' +
                ", regions='" + regions + '\'' +
                '}';
    }
}
package com.cpt202a19.reservation.entity;

import java.io.Serializable;
import java.util.Objects;

<<<<<<< HEAD
/** Entity class for Dmg data */
public class Dmg implements Serializable {

=======
/** Entity class for D/M/G data */
public class Dmg implements Serializable {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    private Integer id;
    private String parent;
    private String code;
    private String name;

<<<<<<< HEAD
    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getParent() { return parent; }

    public void setParent(String parent) { this.parent = parent; }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
=======
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dmg)) return false;
        Dmg district = (Dmg) o;
<<<<<<< HEAD
        return Objects.equals(getId(), district.getId()) && Objects.equals(getParent(), 
        district.getParent()) && Objects.equals(getCode(), district.getCode()) && Objects.equals(getName(), district.getName());
    }

    @Override
    public int hashCode() { return Objects.hash(getId(), getParent(), getCode(), getName()); }
=======
        return Objects.equals(getId(), district.getId()) && Objects.equals(getParent(), district.getParent()) && Objects.equals(getCode(), district.getCode()) && Objects.equals(getName(), district.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getParent(), getCode(), getName());
    }
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", parent='" + parent + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}

package com.sandeepa.crudapp.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "school")
public class SchoolDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "school_fk", referencedColumnName = "id")
    List<StudentDto> schoolName = new ArrayList<>();

    public List<StudentDto> getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(List<StudentDto> studentDTO) {
        this.schoolName = studentDTO;
    }

    public SchoolDto() {
    }

    public SchoolDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SchoolDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
package com.alighieri.employees;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employees", schema = "emp")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emp")
    private Integer idEmp;

    @Column(name = "name_emp")
    private String nameEmp;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "function_emp")
    private String functionEmp;

    public EmployeeModel() {}

    // get and set
    public Integer getId() {return idEmp;}
    public void setId(Integer idEmp) {this.idEmp = idEmp;}

    public String getNameEmp() {return nameEmp;}
    public void setNameEmp(String nameEmp) {this.nameEmp = nameEmp;}

    public Date getDateCreated() {return dateCreated;}
    public void setDateCreated(Date dateCreated) {this.dateCreated = dateCreated;}

    public String getFunctionEmp() {return functionEmp;}
    public void setFunctionEmp(String functionEmp) {this.functionEmp = functionEmp;}
}
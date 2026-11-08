package com.alighieri.products;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProd;

    @Column(name = "type_prod")
    private String typeProd;

    private String name;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "cost_price")
    private Float costPrice;

    @Column(name = "selling_price")
    private Float sellingPrice;

    public ProductModel() {}

    // get and set
    public Long getId() {return idProd;}
    public void setId(Long id) {this.idProd = id;}

    public String getType() {return typeProd;}
    public void setType(String typeProd) {this.typeProd = typeProd;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Date getDate() {return dateCreated;}
    public void setDate(Date dateCreated) {this.dateCreated = dateCreated;}

    public Float getCost() {return costPrice;}
    public void setCost(Float costPrice) {this.costPrice = costPrice;}

    public Float getSelling() {return sellingPrice;}
    public void setSelling(Float sellingPrice) {this.sellingPrice = sellingPrice;}
}
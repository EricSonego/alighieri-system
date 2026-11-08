package com.alighieri.products;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "products", schema = "prod")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProd;

    @Column(name = "type_prod")
    private String typeProd;

    @Column(name = "name_prod")
    private String name;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "cost_price", precision = 10, scale = 2)
    private BigDecimal costPrice;

    @Column(name = "selling_price", precision = 10, scale = 2)
    private BigDecimal sellingPrice;

    public ProductModel() {}

    // get and set
    public Integer getId() {return idProd;}
    public void setId(Integer id) {this.idProd = id;}

    public String getType() {return typeProd;}
    public void setType(String typeProd) {this.typeProd = typeProd;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Date getDate() {return dateCreated;}
    public void setDate(Date dateCreated) {this.dateCreated = dateCreated;}

    public BigDecimal getCost() {return costPrice;}
    public void setCost(BigDecimal costPrice) {this.costPrice = costPrice;}

    public BigDecimal getSelling() {return sellingPrice;}
    public void setSelling(BigDecimal sellingPrice) {this.sellingPrice = sellingPrice;}
}
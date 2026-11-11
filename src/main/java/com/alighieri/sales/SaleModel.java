package com.alighieri.sales;

import com.alighieri.employees.EmployeeModel;
import com.alighieri.products.ProductModel;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "sales", schema = "sale")
public class SaleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;

    @ManyToOne
    @JoinColumn(name = "id_emp", nullable = false)
    private EmployeeModel employee;

    @ManyToOne
    @JoinColumn(name = "id_prod", nullable = false)
    private ProductModel product;

    @Column(name = "date_sale", insertable = false, updatable = false)
    private Date dateSale;

    @Column(name = "sale_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal salePrice;

    public SaleModel() {}

    // get and set
    public Integer getIdSale() {return idSale;}
    public void setIdSale(Integer idSale) {this.idSale = idSale;}

    public EmployeeModel getEmployee() {return employee;}
    public void setEmployee(EmployeeModel employee) {this.employee = employee;}

    public ProductModel getProduct() {return product;}
    public void setProduct(ProductModel product) {this.product = product;}

    public Date getDateSale() {return dateSale;}
    public void setDateSale(Date dateSale) {this.dateSale = dateSale;}

    public BigDecimal getSalePrice() {return salePrice;}
    public void setSalePrice(BigDecimal salePrice) {this.salePrice = salePrice;}
}

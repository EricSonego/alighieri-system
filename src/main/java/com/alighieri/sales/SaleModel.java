package com.alighieri.sales;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "sales", schema = "sal")
public class SaleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSale;

    @Column(name = "id_emp")
    private Long idEmp;

    @Column(name = "id_prod")
    private Long idProd;

    @Column(name = "date_sale")
    private Date dateSale;

    @Column(name = "sale_price", precision = 10, scale = 2)
    private BigDecimal salePrice;

    public SaleModel() {}

    // get and set
    public Long getIdSale() {return idSale}
    public void setIdSale(Long idSale) {this.idSale = idSale;}

    public Long getIdEmp() {return idEmp}
    public void setidEmp(Long idEmp) {this.idEmp = idEmp;}

    public Long getIdProd() {return idProd}
    public void setIdProd(Long idProd) {this.idProd = idProd;}

    public Date getDateSale() {return dateSale;}
    public void setDateSale(Date dateSale) {this.dateSale = dateSale;}

    public BigDecimal getSalePrice() {return salePrice;}
    public void setSalePrice(BigDecimal salePrice) {this.salePrice = salePrice;}
}

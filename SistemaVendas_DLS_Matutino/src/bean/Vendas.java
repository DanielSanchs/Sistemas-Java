package bean;
// Generated 07/06/2022 15:08:41 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vendas generated by hbm2java
 */
@Entity
@Table(name="vendas"
    ,catalog="vendas_cursos"
)
public class Vendas  implements java.io.Serializable {


     private int idvendas;
     private Clientes clientes;
     private Usuarios usuarios;
     private Date dataVenda;
     private double total;

    public Vendas() {
    }

	
    public Vendas(int idvendas) {
        this.idvendas = idvendas;
    }
    public Vendas(int idvendas, Clientes clientes, Usuarios usuarios, Date dataVenda, double total) {
       this.idvendas = idvendas;
       this.clientes = clientes;
       this.usuarios = usuarios;
       this.dataVenda = dataVenda;
       this.total = total;
    }
   
     @Id 

    
    @Column(name="idvendas", unique=true, nullable=false)
    public int getIdvendas() {
        return this.idvendas;
    }
    
    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cliente")
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuarios")
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_venda", length=10)
    public Date getDataVenda() {
        return this.dataVenda;
    }
    
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    
    @Column(name="total", precision=10)
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
}


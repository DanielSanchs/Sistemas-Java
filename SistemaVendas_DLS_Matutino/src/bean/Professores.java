package bean;
// Generated 07/06/2022 15:08:41 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Professores generated by hbm2java
 */
@Entity
@Table(name="professores"
    ,catalog="vendas_cursos"
)
public class Professores  implements java.io.Serializable {


     private int idprofessores;
     private String nome;
     private String sexo;
     private String rg;
     private String cpf;
     private Date dataNascimento;
     private int graduacao;
     private String especializacao;

    public Professores() {
    }

	
    public Professores(int idprofessores) {
        this.idprofessores = idprofessores;
    }
    public Professores(int idprofessores, String nome, String sexo, String rg, String cpf, Date dataNascimento, Byte graduacao, String especializacao) {
       this.idprofessores = idprofessores;
       this.nome = nome;
       this.sexo = sexo;
       this.rg = rg;
       this.cpf = cpf;
       this.dataNascimento = dataNascimento;
       this.graduacao = graduacao;
       this.especializacao = especializacao;
    }
   
     @Id 

    
    @Column(name="idprofessores", unique=true, nullable=false)
    public int getIdprofessores() {
        return this.idprofessores;
    }
    
    public void setIdprofessores(int idprofessores) {
        this.idprofessores = idprofessores;
    }

    
    @Column(name="nome", length=30)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="sexo", length=1)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    @Column(name="rg", length=9)
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }

    
    @Column(name="cpf", length=14)
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_nascimento", length=10)
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    @Column(name="graduacao")
    public int getGraduacao() {
        return this.graduacao;
    }
    
    public void setGraduacao(int graduacao) {
        this.graduacao = graduacao;
    }

    
    @Column(name="especializacao", length=50)
    public String getEspecializacao() {
        return this.especializacao;
    }
    
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    
    public String toString(){
        return this.getNome();
    }
    
    public boolean equals(Object object){
        
            if(object instanceof Professores){
                Professores professores = (Professores) object;
                if(this.getIdprofessores() == professores.getIdprofessores()){
                    return true;
                }
            }
        return false;
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prenotation;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "esame")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Esame.findAll", query = "SELECT e FROM Esame e")
    , @NamedQuery(name = "Esame.findById", query = "SELECT e FROM Esame e WHERE e.id = :id")
    , @NamedQuery(name = "Esame.findByNome", query = "SELECT e FROM Esame e WHERE e.nome = :nome")
    , @NamedQuery(name = "Esame.findByDocente", query = "SELECT e FROM Esame e WHERE e.docente = :docente")})
public class Esame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "docente")
    private String docente;

    public Esame() {
    }

    public Esame(Integer id) {
        this.id = id;
    }

    public Esame(Integer id, String nome, String docente) {
        this.id = id;
        this.nome = nome;
        this.docente = docente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esame)) {
            return false;
        }
        Esame other = (Esame) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prenotation.Esame[ id=" + id + " ]";
    }
    
}

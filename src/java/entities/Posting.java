/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import dal.commons.DalEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Javier
 */
@Entity
@Table(name = "posteos", catalog = "corpus", schema = "")
@NamedQueries({
    @NamedQuery(name = "Posting.findAll", query = "SELECT p FROM Posting p"),
    @NamedQuery(name = "Posting.findByIdDocumento", query = "SELECT p FROM Posting p WHERE p.postingPK.idDocumento = :idDocumento"),
    @NamedQuery(name = "Posting.findByIdTermino", query = "SELECT p FROM Posting p WHERE p.postingPK.idTermino = :idTermino"),
    @NamedQuery(name = "Posting.findByFrecuencia", query = "SELECT p FROM Posting p WHERE p.frecuencia = :frecuencia")})
public class Posting implements Serializable,DalEntity {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostingPK postingPK;
    @Basic(optional = false)
    @Column(name = "frecuencia")
    private int frecuencia;

    public Posting() {
    }

    public Posting(PostingPK postingPK) {
        this.postingPK = postingPK;
    }

    public Posting(PostingPK postingPK, int frecuencia) {
        this.postingPK = postingPK;
        this.frecuencia = frecuencia;
    }

    public Posting(int idDocumento, int idTermino) {
        this.postingPK = new PostingPK(idDocumento, idTermino);
    }

    public PostingPK getPostingPK() {
        return postingPK;
    }

    public void setPostingPK(PostingPK postingPK) {
        this.postingPK = postingPK;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postingPK != null ? postingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Posting)) {
            return false;
        }
        Posting other = (Posting) object;
        if ((this.postingPK == null && other.postingPK != null) || (this.postingPK != null && !this.postingPK.equals(other.postingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Posting[ postingPK=" + postingPK + " ]";
    }
    
}


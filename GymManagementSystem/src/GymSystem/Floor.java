/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymSystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Abhishek Mane
 */
@Entity
@Table(name = "floor", catalog = "gymmanagementsystem", schema = "g14")
@NamedQueries({
    @NamedQuery(name = "Floor.findAll", query = "SELECT f FROM Floor f")
    , @NamedQuery(name = "Floor.findByFloorId", query = "SELECT f FROM Floor f WHERE f.floorId = :floorId")
    , @NamedQuery(name = "Floor.findByFloorName", query = "SELECT f FROM Floor f WHERE f.floorName = :floorName")})
public class Floor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "floor_id")
    private String floorId;
    @Column(name = "floor_name")
    private String floorName;

    public Floor() {
    }

    public Floor(String floorId) {
        this.floorId = floorId;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        String oldFloorId = this.floorId;
        this.floorId = floorId;
        changeSupport.firePropertyChange("floorId", oldFloorId, floorId);
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        String oldFloorName = this.floorName;
        this.floorName = floorName;
        changeSupport.firePropertyChange("floorName", oldFloorName, floorName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (floorId != null ? floorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Floor)) {
            return false;
        }
        Floor other = (Floor) object;
        if ((this.floorId == null && other.floorId != null) || (this.floorId != null && !this.floorId.equals(other.floorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GymSystem.Floor[ floorId=" + floorId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

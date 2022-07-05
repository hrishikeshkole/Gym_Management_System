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
@Table(name = "membership", catalog = "gymmanagementsystem", schema = "g14")
@NamedQueries({
    @NamedQuery(name = "Membership.findAll", query = "SELECT m FROM Membership m")
    , @NamedQuery(name = "Membership.findByMembershipId", query = "SELECT m FROM Membership m WHERE m.membershipId = :membershipId")
    , @NamedQuery(name = "Membership.findByTypeOfMembership", query = "SELECT m FROM Membership m WHERE m.typeOfMembership = :typeOfMembership")
    , @NamedQuery(name = "Membership.findByPriceOfMembership", query = "SELECT m FROM Membership m WHERE m.priceOfMembership = :priceOfMembership")
    , @NamedQuery(name = "Membership.findByFloorId", query = "SELECT m FROM Membership m WHERE m.floorId = :floorId")})
public class Membership implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "membership_id")
    private String membershipId;
    @Column(name = "type_of_membership")
    private String typeOfMembership;
    @Column(name = "price_of_membership")
    private Integer priceOfMembership;
    @Column(name = "floor_id")
    private String floorId;

    public Membership() {
    }

    public Membership(String membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        String oldMembershipId = this.membershipId;
        this.membershipId = membershipId;
        changeSupport.firePropertyChange("membershipId", oldMembershipId, membershipId);
    }

    public String getTypeOfMembership() {
        return typeOfMembership;
    }

    public void setTypeOfMembership(String typeOfMembership) {
        String oldTypeOfMembership = this.typeOfMembership;
        this.typeOfMembership = typeOfMembership;
        changeSupport.firePropertyChange("typeOfMembership", oldTypeOfMembership, typeOfMembership);
    }

    public Integer getPriceOfMembership() {
        return priceOfMembership;
    }

    public void setPriceOfMembership(Integer priceOfMembership) {
        Integer oldPriceOfMembership = this.priceOfMembership;
        this.priceOfMembership = priceOfMembership;
        changeSupport.firePropertyChange("priceOfMembership", oldPriceOfMembership, priceOfMembership);
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        String oldFloorId = this.floorId;
        this.floorId = floorId;
        changeSupport.firePropertyChange("floorId", oldFloorId, floorId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (membershipId != null ? membershipId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membership)) {
            return false;
        }
        Membership other = (Membership) object;
        if ((this.membershipId == null && other.membershipId != null) || (this.membershipId != null && !this.membershipId.equals(other.membershipId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GymSystem.Membership[ membershipId=" + membershipId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

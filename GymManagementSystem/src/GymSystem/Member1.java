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
@Table(name = "member", catalog = "gymmanagementsystem", schema = "g14")
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m")
    , @NamedQuery(name = "Member1.findByMemberId", query = "SELECT m FROM Member1 m WHERE m.memberId = :memberId")
    , @NamedQuery(name = "Member1.findByName", query = "SELECT m FROM Member1 m WHERE m.name = :name")
    , @NamedQuery(name = "Member1.findByEmail", query = "SELECT m FROM Member1 m WHERE m.email = :email")
    , @NamedQuery(name = "Member1.findByUserId", query = "SELECT m FROM Member1 m WHERE m.userId = :userId")
    , @NamedQuery(name = "Member1.findByPaymentId", query = "SELECT m FROM Member1 m WHERE m.paymentId = :paymentId")
    , @NamedQuery(name = "Member1.findByInstructorId", query = "SELECT m FROM Member1 m WHERE m.instructorId = :instructorId")
    , @NamedQuery(name = "Member1.findByMembershipId", query = "SELECT m FROM Member1 m WHERE m.membershipId = :membershipId")})
public class Member1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "member_id")
    private String memberId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "payment_id")
    private String paymentId;
    @Column(name = "instructor_id")
    private String instructorId;
    @Column(name = "membership_id")
    private String membershipId;

    public Member1() {
    }

    public Member1(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        String oldMemberId = this.memberId;
        this.memberId = memberId;
        changeSupport.firePropertyChange("memberId", oldMemberId, memberId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        String oldUserId = this.userId;
        this.userId = userId;
        changeSupport.firePropertyChange("userId", oldUserId, userId);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        String oldPaymentId = this.paymentId;
        this.paymentId = paymentId;
        changeSupport.firePropertyChange("paymentId", oldPaymentId, paymentId);
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        String oldInstructorId = this.instructorId;
        this.instructorId = instructorId;
        changeSupport.firePropertyChange("instructorId", oldInstructorId, instructorId);
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        String oldMembershipId = this.membershipId;
        this.membershipId = membershipId;
        changeSupport.firePropertyChange("membershipId", oldMembershipId, membershipId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberId != null ? memberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.memberId == null && other.memberId != null) || (this.memberId != null && !this.memberId.equals(other.memberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GymSystem.Member1[ memberId=" + memberId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

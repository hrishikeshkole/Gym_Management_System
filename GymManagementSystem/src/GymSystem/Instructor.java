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
@Table(name = "instructor", catalog = "gymmanagementsystem", schema = "g14")
@NamedQueries({
    @NamedQuery(name = "Instructor.findAll", query = "SELECT i FROM Instructor i")
    , @NamedQuery(name = "Instructor.findByInstructorId", query = "SELECT i FROM Instructor i WHERE i.instructorId = :instructorId")
    , @NamedQuery(name = "Instructor.findByInstructorName", query = "SELECT i FROM Instructor i WHERE i.instructorName = :instructorName")
    , @NamedQuery(name = "Instructor.findByContact", query = "SELECT i FROM Instructor i WHERE i.contact = :contact")
    , @NamedQuery(name = "Instructor.findByEmail", query = "SELECT i FROM Instructor i WHERE i.email = :email")})
public class Instructor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "instructor_id")
    private String instructorId;
    @Column(name = "instructor_name")
    private String instructorName;
    @Column(name = "contact")
    private String contact;
    @Column(name = "email")
    private String email;

    public Instructor() {
    }

    public Instructor(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        String oldInstructorId = this.instructorId;
        this.instructorId = instructorId;
        changeSupport.firePropertyChange("instructorId", oldInstructorId, instructorId);
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        String oldInstructorName = this.instructorName;
        this.instructorName = instructorName;
        changeSupport.firePropertyChange("instructorName", oldInstructorName, instructorName);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instructorId != null ? instructorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructor)) {
            return false;
        }
        Instructor other = (Instructor) object;
        if ((this.instructorId == null && other.instructorId != null) || (this.instructorId != null && !this.instructorId.equals(other.instructorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GymSystem.Instructor[ instructorId=" + instructorId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

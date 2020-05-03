package com.project.vehicleid.Model;


import javax.persistence.*;

@Entity
@Table(name = "vehicles")
//@EntityListeners(AuditingEntityListener.class)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "model" , nullable = false)
    private String model;

    @Column(name = "description")
    private String description;

    @Column(name = "registered")
    private boolean registered;

    public Vehicle() {

    }

    public Vehicle(String model, String description, boolean registered) {
        this.model = model;
        this.description = description;
        this.registered = registered;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setPublished(boolean isRegistered) {
        this.registered = isRegistered;
    }

    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", model=" + model + ", desc=" + description + ", registered=" + registered + "]";
    }




    //@CreationTimestamp
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "created_at" , nullable = false)
    //private Date createdAt;

    //@Column(name = "created_by", nullable = false)
    //@CreatedBy
    //private String createdBy;

    //@UpdateTimestamp
    //@Temporal(TemporalType.TIMESTAMP)
    //@Column(name = "updated_at", nullable = false)
    //private Date updatedAt;

    //@Column(name = "updated_by", nullable = false)
    //@LastModifiedBy
    //private String updatedBy;

    //public String getId() {
    //    return id;
    //}

    //public void setId(String id) {
    //    this.id = id;
    //}

    //public String getModelName() {
    //    return modelName;
    //}

    //public void setModelName(String modelName) {
    //    this.modelName = modelName;
    //}

    //public Date getCreatedAt() {
     //   return createdAt;
    //}

    //public void setCreatedAt(Date createdAt) {
    //    this.createdAt = createdAt;
   // }

    //public String getCreatedBy() {
    //    return createdBy;
   // }

    //public void setCreatedBy(String createdBy) {
   //     this.createdBy = createdBy;
   // }

    //public Date getUpdatedAt() {
   //     return updatedAt;
   // }

   // public void setUpdatedAt(Date updatedAt) {
    //    this.updatedAt = updatedAt;
   // }

   // public String getUpdatedBy() {
   //     return updatedBy;
   // }

   // public void setUpdatedBy(String updatedBy) {
        //this.updatedBy = updatedBy;
   // }

   // @Override
   // public String toString() {
    //    return "User{" +
    //            "id=" + id +
     //           ", modelName='" + modelName + '\'' +
    //            ", createdAt=" + createdAt +
    //            ", createdBy='" + createdBy + '\'' +
    //            ", updatedAt=" + updatedAt +
    //            ", updatedby='" + updatedBy + '\'' +
    //           '}';
   // }

}

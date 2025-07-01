package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "billing_details")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
public abstract class BaseBillingDetail extends BaseEntity{
    @Column(name = "number", nullable = false)
    private String number;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}

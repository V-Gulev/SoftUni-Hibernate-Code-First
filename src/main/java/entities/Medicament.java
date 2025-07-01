package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "medicaments")
public class Medicament extends BaseEntity{
    @Column(name = "name", length = 500, nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "medicaments")
    private Set<Prescription> prescriptions;

    public Set<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(Set<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "batches")
public class ProductionBatch extends BaseEntity{
    @Column(name = "date")
    private LocalDate date;

    @OneToMany(mappedBy = "productionBatch")
    private Set<Shampoo> shampoos;

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}

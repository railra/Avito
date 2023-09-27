package rahimov.Avito.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    private Long id;

    public Product(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

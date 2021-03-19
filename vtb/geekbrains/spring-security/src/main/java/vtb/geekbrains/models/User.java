package vtb.geekbrains.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "username")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    public User() {
    }

    public User(String name, String password, Boolean enabled) {
        this.name = name;
        this.password = password;
        this.enabled = enabled;
    }
}
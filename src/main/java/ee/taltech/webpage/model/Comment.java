package ee.taltech.webpage.model;

import ee.taltech.webpage.model.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String comment;
    private LocalDateTime time;

    public Comment(String firstName, String lastName, String comment, Long id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.comment = comment;
        time = LocalDateTime.now();
    }
}

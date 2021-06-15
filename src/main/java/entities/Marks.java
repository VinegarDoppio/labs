package entities;

import javax.persistence.*;
import java.util.List;

public class Marks extends SuperID{

    @Column(name = "mark")
    private int mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_students")
    private Students students;

}

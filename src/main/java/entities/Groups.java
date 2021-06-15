package entities;

import javax.persistence.*;
import java.util.List;

public class Groups extends SuperID{

    @Column(name = "code")
    private int code;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @OneToMany(fetch=FetchType.EAGER, mappedBy="groups")
    private List <Students> students;

}

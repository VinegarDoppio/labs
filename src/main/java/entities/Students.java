package entities;

import javax.persistence.*;
import java.util.List;

public class Students extends SuperID{

    @Column(name = "students_number")
    private int snumber;

    @Column(name = "scode")
    private int scode;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "status")
    private String status;

}

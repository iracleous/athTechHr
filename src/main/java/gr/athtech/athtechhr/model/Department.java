package gr.athtech.athtechhr.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String location;

     @OneToOne
    private Employee employeeManager;

    @OneToMany(mappedBy ="belongingDepartment")
    private List<Employee> workingEmployees;

}

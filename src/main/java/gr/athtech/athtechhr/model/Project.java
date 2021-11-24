package gr.athtech.athtechhr.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany(mappedBy="workingProjects")
    private  List<Employee> workingEmployees;

}

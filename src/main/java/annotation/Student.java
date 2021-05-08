package annotation;

@Table("t_student")
public class Student {

    @Column(name="s_no",columnType = "varchar",length = 20)
    private String sno;

    @Column(name="age",columnType ="int",length = 3)
    private int age;
}

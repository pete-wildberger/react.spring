import java.util.Date;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String description;
  private Date date = new Date();

	private Employee() {}

	public Employee(String firstName, String lastName, String description, Date date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
    this.date = date
	}
}

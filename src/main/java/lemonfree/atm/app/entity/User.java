package lemonfree.atm.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ATM_TB_USR")
public class User {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String name;

	@Column
	private String password;

	@Column(columnDefinition = "CHAR(2)")
	private String joinType;

	@Column
	private String email;
}

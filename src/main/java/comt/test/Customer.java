package comt.test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name ="firstname")
	private String firstname;
	@Column(name ="lastname")
	private String lastname;
	@Column(name ="phoneNumber")
	private String phoneNumber;
	
	@OneToOne(targetEntity =Transactions.class,cascade =CascadeType.ALL)
	private Transactions transactions;
	public Transactions getTransactions() {
		return transactions;
	}
	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

package SpringMvc_Application;

public class Student {
	 private Integer id;
     private String Prenom;
	 private String Nom;
	 private String Notes;
  

		 public Student() {
		super();
	}
		public Student(Integer id) {
		super();
		this.id = id;
	}
		public Integer getId() {
		  return id;
		 }
		 public void setId(Integer id) {
		  this.id = id;
		 }
	 public String getprenom() {
	  return Prenom;
	 }
	 public void setprenom(String Prenom) {
	  this.Prenom = prenom;
	 }
	 public String getNom() {
	  return Nom;
	 }
	 public void setNom(String Nom) {
	  this.Nom = Nom;
	 }
	 public String getNotes() {
	  return Notes;
	 }
	 public void setNotes(String Notes) {
	  this.Notes = Notes;
	 }
	}

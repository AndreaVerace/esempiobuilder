package it.prova.esempiobuilder.model;

public final class UserBuilder {

	private Long id;
	private String nome;
	private String cognome;
	private String nickname;
	private String password;
	private int eta;
	private boolean isRegistrato;
	private User.Sesso sesso;
	
	private UserBuilder() {
		
	}
	
	public static UserBuilder newBuilder(){
		return new UserBuilder();
	}
	
	public UserBuilder id(Long id) {
		this.id=id;
		return this;
	}
	
	public UserBuilder nome(String nome) {
		this.nome=nome;
		return this;
	}
	
	public UserBuilder cognome(String cognome) {
		this.cognome=cognome;
		return this;
	}
	
	public UserBuilder nickname(String nickname) {
		this.nickname=nickname;
		return this;
	}
	
	public UserBuilder password(String password) {
		this.password=password;
		return this;
	}
	
	public UserBuilder eta(int eta) {
		this.eta=eta;
		return this;
	}
	
	public UserBuilder isRegistrato(boolean isRegistrato) {
		this.isRegistrato=isRegistrato;
		return this;
	}
	
	public UserBuilder sesso(User.Sesso sesso) {
		this.sesso=sesso;
		return this;
	}
	
	public User build() {
		if(eta < 1) {
			throw new IllegalArgumentException("inserimento errato età");
		}
		
		if(!isRegistrato) {
			throw new IllegalArgumentException("Utente non registrato");
		}
		
		return new User(id,nome,cognome,nickname,password,eta,isRegistrato,sesso);
	}
}

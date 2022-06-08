package it.prova.esempiobuilder.model;

public class User {

	public enum Sesso {
		MASCHIO,FEMMINA
	}
	
	private Long id;
	private String nome;
	private String cognome;
	private String nickname;
	private String password;
	private int eta;
	private boolean isRegistrato;
	private Sesso sesso;
	
	public User() {
		
	}
	
	public User(Long id) {
		this.id=id;
	}
	
	public User(Long id,String nome,String cognome,String nickname,String password,
			int eta,boolean isRegistrato,Sesso sesso) {
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
		this.nickname=nickname;
		this.password=password;
		this.eta=eta;
		this.isRegistrato=isRegistrato;
		this.sesso=sesso;
	}
	
	public User(Long id,String nome,String cognome,String nickname,String password) {
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
		this.nickname=nickname;
		this.password=password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean isRegistrato() {
		return isRegistrato;
	}

	public void setRegistrato(boolean isRegistrato) {
		this.isRegistrato = isRegistrato;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", nickname=" + nickname + ", password="
				+ password + ", eta=" + eta + ", isRegistrato=" + isRegistrato + ", sesso=" + sesso + "]";
	}
	
	
}

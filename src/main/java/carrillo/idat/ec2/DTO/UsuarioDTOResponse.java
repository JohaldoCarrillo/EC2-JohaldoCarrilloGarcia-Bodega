package carrillo.idat.ec2.DTO;

public class UsuarioDTOResponse {

	private String token;

	public UsuarioDTOResponse() {
		super();
	}

	public UsuarioDTOResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}

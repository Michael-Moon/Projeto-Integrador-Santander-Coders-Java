package br.com.digitalhouse.security.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import br.com.digitalhouse.model.Usuario;
import lombok.Getter;

@Getter
public class AuthUser extends User {

private static final long serialVersionUID = 1L;
	
	private Long userId;
	private String nomeCompleto;
	private Long cliente;
	private String clienteEmail;
	
	public AuthUser(Usuario usuario, Collection<? extends GrantedAuthority> permissoes) {
		super(usuario.getEmail(), usuario.getSenha(), permissoes);
		
		this.userId = usuario.getId();
		this.nomeCompleto = usuario.getNome();
		this.cliente = usuario.getCliente().getId();
		this.clienteEmail = usuario.getEmail();
	}
	
}

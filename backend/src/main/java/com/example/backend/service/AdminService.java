package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import com.example.backend.model.Administrateur;

public interface AdminService {
	List<Administrateur> list();
	Administrateur saveAdmin(Administrateur admin);
	Administrateur updateAdmin(Long id, Administrateur admin);
	Administrateur AdminById(Long id);
	void deleteAdmin(Long id);
	Optional<Administrateur> LoginUser(String login, String password);

}

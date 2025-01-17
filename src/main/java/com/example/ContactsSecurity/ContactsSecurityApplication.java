package com.example.ContactsSecurity;

import com.example.ContactsSecurity.enums.AppRole;
import com.example.ContactsSecurity.model.AppUser;
import com.example.ContactsSecurity.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ContactsSecurityApplication implements CommandLineRunner {

	@Autowired
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactsSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) {
		createUserIfNotExists("admin@admin.admin", AppRole.ADMIN);
		createUserIfNotExists("user@user.user", AppRole.USER);
	}

	private void createUserIfNotExists(String email, AppRole role) {
		if (appUserRepository.findByEmail(email).isEmpty()) {
			AppUser account = new AppUser();
			account.setEmail(email);
			account.setPassword(new BCryptPasswordEncoder().encode("pass"));
			account.setRole(role);
			appUserRepository.save(account);
		}
	}

}

package lemonfree.atm.app.service;

import lemonfree.atm.app.entity.User;

import java.util.List;

public interface UserService {

	List findAll();

	Object findById(Long id);

	void save(User entity);

	long count();

	void delete(User entity);

	void deleteById(Long id);

	void deleteAll();
}

package lemonfree.atm.app.service;

import lemonfree.atm.app.common.Constant;
import lemonfree.atm.app.entity.User;
import lemonfree.atm.app.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(User entity) {
		userRepository.save(entity);
	}

	@Override
	public long count() {
		return userRepository.count();
	}

	@Transactional
	@Override
	public void delete(User entity) {
		userRepository.delete(entity);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Override
	public List<User> findAllByPageNo(int pageNo) {
		PageRequest pageRequest = PageRequest.of(pageNo, Constant.COMMON_PAGING_SIZE, Sort.by("id").descending());
		return userRepository.findAll(pageRequest).getContent();
	}
}

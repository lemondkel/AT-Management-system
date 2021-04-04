package lemonfree.atm.app.ctrl;

import lemonfree.atm.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	private UserService userService;

	@Autowired
	public AdminController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}

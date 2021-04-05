package lemonfree.atm.app.ctrl;

import lemonfree.atm.app.common.AjaxResult;
import lemonfree.atm.app.entity.User;
import lemonfree.atm.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class AdminController {

	private UserService userService;

	@Autowired
	public AdminController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 사용자 PUT
	 *
	 * @param user 사용자
	 * @return AjaxResult
	 * @author l2jong
	 * @since 2021-04-05
	 */
	@PutMapping(value = "/put")
	public AjaxResult put(@ModelAttribute("user") User user) {
		AjaxResult ajaxResult;
		try {
			userService.save(user);
			ajaxResult = new AjaxResult(true, 0, "정상 처리입니다.");
		} catch (Exception e) {
			ajaxResult = new AjaxResult(false, 999, "DB 처리에 실패하였습니다.");
		}

		return ajaxResult;
	}

	/**
	 * 사용자 DELETE
	 *
	 * @param user 사용자
	 * @return AjaxResult
	 * @author l2jong
	 * @since 2021-04-05
	 */
	@DeleteMapping(value = "/delete")
	public AjaxResult delete(@ModelAttribute("user") User user) {
		AjaxResult ajaxResult;
		try {
			userService.delete(user);
			ajaxResult = new AjaxResult(true, 0, "정상 처리입니다.");
		} catch (Exception e) {
			ajaxResult = new AjaxResult(false, 999, "DB 처리에 실패하였습니다.");
		}

		return ajaxResult;
	}

	/**
	 * 사용자 GET
	 *
	 * @param id 사용자 id
	 * @return AjaxResult
	 * @author l2jong
	 * @since 2021-04-05
	 */
	@GetMapping(value = "/detail/{id}")
	public AjaxResult getDetail(@PathVariable("id") long id) {
		AjaxResult ajaxResult;
		Map<String, Object> data = new HashMap<>();
		try {
			User user = userService.findById(id);
			data.put("user", user);
			ajaxResult = new AjaxResult(true, 0, "정상 처리입니다.", data);
		} catch (Exception e) {
			ajaxResult = new AjaxResult(false, 999, "DB 처리에 실패하였습니다.");
		}

		return ajaxResult;
	}

	/**
	 * 사용자 List GET
	 *
	 * @param pageNo 페이지번호
	 * @return AjaxResult
	 * @author l2jong
	 * @since 2021-04-05
	 */
	@GetMapping(value = "/list/{pageNo}")
	public AjaxResult getList(@PathVariable("pageNo") int pageNo) {
		AjaxResult ajaxResult;
		Map<String, Object> data = new HashMap<>();
		try {
			List<User> userList = userService.findAllByPageNo(pageNo);
			data.put("userList", userList);
			ajaxResult = new AjaxResult(true, 0, "정상 처리입니다.", data);
		} catch (Exception e) {
			ajaxResult = new AjaxResult(false, 999, "DB 처리에 실패하였습니다.");
		}

		return ajaxResult;
	}
}

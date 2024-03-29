package se0867.adb.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import se0867.adb.dto.AccountDto;
import se0867.adb.dto.FriendShipDto;
import se0867.adb.dto.PostDto;
import se0867.adb.dto.SharePostDto;
import se0867.adb.model.Account;
import se0867.adb.model.Job;
import se0867.adb.model.Member;
import se0867.adb.model.SharePost;
import se0867.adb.service.IAccountManager;
import se0867.adb.service.IFriendShipManager;
import se0867.adb.service.IJobManager;
import se0867.adb.service.ISharePostManager;
import se0867.adb.service.impl.AccountManager;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private IAccountManager manager;
	
	@Autowired
	private ISharePostManager sharePostManager;
	
	@Autowired
	private IFriendShipManager friendShipManager;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "login";
	}
	
	@RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
	public String checkLoginSession(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			Member member = (Member) session.getAttribute("USER");
			if (session.getAttribute("USER") != null) {
				List<FriendShipDto> friendships = friendShipManager.loadFriends(member.getEmail());
				List<PostDto> posts = sharePostManager.getPosts(friendships);
				model.addAttribute("LISTPOST", posts);
				return "home";
			}
		}
		
		return "login";
	}
	
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public String checkLogin(Model model, AccountDto accountDto, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("USER") == null) {
			Member account = manager.checkLogin(accountDto.getEmail(), accountDto.getPassword());
			if (account != null) {
				List<FriendShipDto> friendships = friendShipManager.loadFriends(accountDto.getEmail());
				List<PostDto> posts = sharePostManager.getPosts(friendships);
				model.addAttribute("LISTPOST", posts);
				session.setAttribute("USER", account);
				return "home";
			}else
			return "fail";
		}else {
			return "home";
		}
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.removeAttribute("USER");
		}
		return "login";
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getAccount", method = RequestMethod.GET)
	public Account getAccount() {
		return manager.getAccount(1);
	}
	
}

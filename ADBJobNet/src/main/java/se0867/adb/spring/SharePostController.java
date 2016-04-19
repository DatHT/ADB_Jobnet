package se0867.adb.spring;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se0867.adb.dto.SharePostDto;
import se0867.adb.model.Job;
import se0867.adb.model.Member;
import se0867.adb.model.SharePost;
import se0867.adb.service.IJobManager;
import se0867.adb.service.ISharePostManager;

@Controller
public class SharePostController {

	@Autowired
	private ISharePostManager sharePostManager;
	
	@Autowired
	private IJobManager jobManager;
	
	@RequestMapping(value = "/postStatus", method = RequestMethod.GET)
	public String postStatus(Model model, SharePostDto dto, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			Member user = (Member) session.getAttribute("USER");
			if (user != null) {
				Job job = new Job(dto.getJobName(), dto.getJobName(), 1, dto.getNumOfHire(), new Date(), new Date()
				, 1, 0, 0);
				jobManager.insertJob(job);
				
				SharePost post = new SharePost(user.getEmail(), 1, new Date(), dto.getStatus(), dto.getJobName(), dto.getJobDes(), false, "", 0);
				
				sharePostManager.shareJob(post);
				return "redirect:/checkLogin";
			}
		}
		
		return "fail";
	}
}

package BBS.servlet.user;

import BBS.beans.Users;
import BBS.servlet.BBSServlet;
import BBS.validation.EditUserForm;
import BBS.validation.UserForm;

public class UserServlet extends BBSServlet{
	private static final long serialVersionUID = 1L;


	protected UserForm toUserForm(Users usersBean){
		UserForm form = new UserForm();

		String loginId = usersBean.getLoginId();
		String password = usersBean.getPassword();
		String name = usersBean.getName();

		if(!loginId.isEmpty()){
			form.setLoginId(loginId);
		}
		if(!password.isEmpty()){
			form.setPassword(password);
		}
		if(!name.isEmpty()){
			form.setName(name);
		}
		return form;
	}
	protected UserForm toEditrUserForm(Users usersBean){
		EditUserForm form = new EditUserForm();

		String loginId = usersBean.getLoginId();
		String password = usersBean.getPassword();
		String name = usersBean.getName();
		String confirmationPassword = usersBean.getConfirmationPassword();

		if(!loginId.isEmpty()){
			form.setLoginId(loginId);
		}
		if(!password.isEmpty()){
			form.setPassword(password);
		}
		if(!name.isEmpty()){
			form.setName(name);
		}
		if(!confirmationPassword.isEmpty()){
			form.setConfirmationPassword(confirmationPassword);
		}
		return form;
	}
}
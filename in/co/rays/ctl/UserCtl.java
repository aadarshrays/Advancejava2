package in.co.rays.ctl;

import java.util.logging.Logger;

import javax.management.relation.Role;



@WebServlet(name= "UserCtl" , urlpatterns= {"/ctl/userctl"})
public class UserCtl extend BaseCtl {
private static final long serialVersionUID =1L;
private static Logger Log = Logger.getLogger(UserCtl.class);
@Override
protected void preload(HttpServletRequest request) {
	RoleModel model = new RoleModel();
	try {
		List l = model.list();
		request.setAttribute("roleList , l");
		System.out.println("list ---------"+l);
	} catch (ApplicationException e) {
		log.error(e);
	}
}
@Override
protected boolean validate(HttpServletRequest request) {
	log.debug("UserCtl method validate started ");
	boolean pass = true;
	String login  = request.getparameter("login");
	String password = request.getparameter("Password");
	String dob = request.getparameter("dob");
}

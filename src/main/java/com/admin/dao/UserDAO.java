package com.admin.dao;

import com.admin.model.UserModel;
import com.admin.persistence.Role;
import com.admin.persistence.User;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
/**
 * Created by binesh on 4/23/2017.
 */

@Named
@Transactional("transactionManager")
public class UserDAO {

	@Inject
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUser(UserModel model) {
		User user = new User();
		user.setLogin(model.getLogin());
		user.setPwd(model.getPwd());
		user.setEnabled(1);
		/*Role role = (Role) sessionFactory.getCurrentSession()
				.createQuery("from Role where code='ROLE_USER'").uniqueResult();
		if (role == null) {

			sessionFactory.getCurrentSession().save(role);
		}
		Set<Role> roles = new HashSet<Role>();
		roles.add(role);*/

		Role role = new Role();
		role.setCode("ROLE_USER");
		role.setLabel("ROLE FOR SIMPLE ACCESS");
		user.setRole(role);
		role.setUser(user);
		sessionFactory.getCurrentSession().save(user);
	}
}

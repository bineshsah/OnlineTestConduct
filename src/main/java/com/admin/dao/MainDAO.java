package com.admin.dao;

import com.admin.model.QuestionModel;
import com.admin.model.StudentModel;
import com.admin.persistence.Question;
import com.admin.persistence.Student;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by binesh on 4/23/2017.
 */


@Named
@Transactional("transactionManager")
public class MainDAO {


    @Inject
    private SessionFactory sessionFactory;
    List<StudentModel> studentModelList;

    List<QuestionModel> questionModelList;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public List<StudentModel> getAllStudent(){
        studentModelList=new ArrayList<StudentModel>();

        Collection<Student> students =  sessionFactory.getCurrentSession()
				.createQuery("from Student").list();
		if (students != null) {
		    for(Student st:students) {
                studentModelList.add(new StudentModel(st.getId(), st.getStudentID(), st.getStudentName(), st.getEmail(), st.getGender()));
            }
		}
    return studentModelList;
    }
    public List<QuestionModel> getAllQuestions(String mainTech,String subTech){
        questionModelList=new ArrayList<QuestionModel>();
        System.out.println("Getting questions");
        Collection<Question> questions =  sessionFactory.getCurrentSession()
                /*where mainTechnologyName='"+mainTech+"' and subTechnologyName='"+subTech+"'*/
                /*Select i from Inventory i,Category c INNER JOIN i.product ip INNER JOIN c.products cp where ip = cp and c.id=?*/
                /*, MainTechnology m INNER JOIN q.subTechnology qp INNER JOIN m.mainTechnologyID sp " +
                        " where m.mainTechnologyName='Java' and qp.subTechnologyName='JSP'*/
                .createQuery("from Question q where q.subTechnology.mainTechnology.mainTechnologyName='"+mainTech+"' and q.subTechnology.subTechnologyName='"+subTech+"' ").list();
        if (questions != null) {
            for(Question qm:questions) {
                questionModelList.add(new QuestionModel(qm.getQuestionID(),qm.getQuestionName(),qm.getOptionOne(),qm.getOptionTwo(),qm.getOptionThree(),qm.getOptionFour(),qm.getCorrectAnswr()));
                System.out.println("QuestionS"+questionModelList.toString());
            }
        }
        return questionModelList;
    }
}

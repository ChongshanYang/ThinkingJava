package JunitTest.impl;

import JunitTest.EStudent;
import JunitTest.dao.StudentsDao;

/**
 * Created by yanglc on 2017/1/10.
 */
public class StudentsDaoImpl implements StudentsDao{
    public EStudent getStudent(int id){
        EStudent est = new EStudent();
        est.setAge(12);
        est.setName("小明");
        return est;
    }
}

package JunitTest.impl;

import JunitTest.EStudent;
import JunitTest.dao.StudentsDao;

/**
 * Created by yanglc on 2017/1/10.
 */
public class MockStudentsDaoImpl implements StudentsDao {
    public EStudent getStudent(int id){
        EStudent est = new EStudent();
        est.setName("小红");
        est.setAge(12);
        return est;
    }
}

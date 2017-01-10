package JunitTest.tests;

import JunitTest.dao.StudentsDao;
import JunitTest.impl.MockStudentsDaoImpl;
import JunitTest.impl.StudentsDaoImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * 由于下面采用参数化测试，因此将测试运行器更换为Parameterized
 */
@RunWith(Parameterized.class)
public class StudentsDaoTest {
    static StudentsDao dao, mockDao;

    /**
     * 执行测试类中所有测试前执行一次
     * 用于前提条件的初始化
     */
    @BeforeClass
    public static void init(){
        dao = new StudentsDaoImpl();
        mockDao = new MockStudentsDaoImpl();
    }

    /**
     * 接收测试用数据
     */
    int id;
    public StudentsDaoTest(int id){
        this.id = id;
    }

    /**
     * 测试用例
     */
    @Test
    public void testGetStudent(){
        assertEquals("获取学生信息", mockDao.getStudent(id), dao.getStudent(id));
    }

    /**
     * 测试用数据提供方法
     */
    @Parameterized.Parameters
    public Collection dataFeed(){
        return Arrays.asList(new Object[][]{{1},{2},{3}});
    }
}
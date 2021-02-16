package com.aurora.mapper;

import com.aurora.pojo.Student;
import com.aurora.utils.MybatissUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void test() {
        // 获取SqlSession对象
        SqlSession sqlSession = MybatissUtils.getSqlSession();

        // 执行SQL
        // 第一种：getMapper()，先要获得mapper，才能用mapper中的getStudentList()方法
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        // 查询
        List<Student> students = mapper.getStudentList();
        for (Student stu : students) {
            System.out.println(stu);
        }
        System.out.println();

        // 删除
        Student student=new Student();
        student.setSnum("221801315");
        student.setSsex("女");
        System.out.println("删除结果:"+mapper.deleteStudent(student));
        System.out.println();

        // 增加
        Student newStu=new Student("221801315","Diana","女","Tony",3);
        System.out.println("增加结果:"+mapper.addStudent(newStu));
        System.out.println();

        // 修改
        Student udStu=mapper.getStudent("221801315");
        udStu.setTname("Lily");
        System.out.println("修改结果:"+mapper.updateStudent(udStu.getSnum(),udStu));
        System.out.println();
        System.out.println(mapper.getStudent(udStu.getSnum()));

        // 关闭sqlSession
        sqlSession.close();
    }
}



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example.student.model.student;
import com.example.student.studentService.studentService;

public abstract  class StudentRepository implements JpaRepository<student, String>
{

}

package com.example.student.studentService;

	import com.example.student.model.student;
import com.opencsv.bean.CsvToBeanBuilder;
	import org.springframework.stereotype.Service;

	import java.io.FileReader;
	import java.io.IOException;
	import java.util.List;

	@Service
	public class studentService {
	    private static final String FILE_PATH = "student_details.csv";

	    public List<student> getStudents(int page, int size) throws IOException {
	        List<student> allStudents = new CsvToBeanBuilder<Student>(new FileReader(FILE_PATH))
	                .withType(student.class)
	                .build()
	                .parse();

	        int startIndex = (page - 1) * size;
	        int endIndex = Math.min(startIndex + size, allStudents.size());

	        return allStudents.subList(startIndex, endIndex);
	    }
	}


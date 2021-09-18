package ua.lviv.lgs.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;


import ua.lviv.lgs.domain.Student;
import ua.lviv.lgs.fileuploadutil.FileUploadUtil;
import ua.lviv.lgs.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
    private StudentRepository repo;
     
    @PostMapping("/students/save")
    public RedirectView saveUser(@ModelAttribute Student student,
            @RequestParam("image") MultipartFile multipartFile) throws IOException {
         System.out.println(student.getAge());
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        student.setPhotos(fileName);
         
        Student savedStudent = repo.save(student);
 
        String uploadDir = "student-photos/" + savedStudent.getId();
 
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
         
        return new RedirectView("/students", true);
    }
}

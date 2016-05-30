package com.phase3.controller;

import com.phase3.form.FileUpload;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
 
@Controller
public class FileUploadController {
 
    @RequestMapping(value = "/FileUpload", method = RequestMethod.GET)
    public String crunchifyDisplayForm() {
        return "FileUpload";
    }
 
    @RequestMapping(value = "/savefiles", method = RequestMethod.POST)
    public String crunchifySave(
            @ModelAttribute("uploadForm") FileUpload uploadForm,
            Model map) throws IllegalStateException, IOException {
        String saveDirectory = "c:/hello/";
 
        List<MultipartFile> Files = uploadForm.getFiles();
 
        List<String> fileNames = new ArrayList<String>();
 
        if (null != Files && Files.size() > 0) {
            for (MultipartFile multipartFile : Files) {
 
                String fileName = multipartFile.getOriginalFilename();
                if (!"".equalsIgnoreCase(fileName)) {
                    // Handle file content - multipartFile.getInputStream()
                    multipartFile
                            .transferTo(new File(saveDirectory + fileName));
                    fileNames.add(fileName);
                }
            }
        }
 
        map.addAttribute("files", fileNames);
        return "UploadFileSuccess";
    }
}
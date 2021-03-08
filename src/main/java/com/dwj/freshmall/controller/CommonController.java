package com.dwj.freshmall.controller;

import com.dwj.freshmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("common")
public class CommonController {

    @Value("${web.upload-path}")
    private String filePath;

    @RequestMapping("upload")
    public ResultVO upload(MultipartFile file){
        String name = file.getOriginalFilename();
        String ext=name.substring(name.lastIndexOf("."));
        String desc = UUID.randomUUID() + ext;
        // System.out.println(file.getOriginalFilename());
        try {

            FileOutputStream fs =new FileOutputStream(filePath +desc);
            FileCopyUtils.copy(file.getInputStream(),fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ResultVO resultVO =new ResultVO(200,desc);
        return  resultVO;
    }
}

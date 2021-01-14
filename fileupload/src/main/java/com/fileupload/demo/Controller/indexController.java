package com.fileupload.demo.Controller;

import jdk.nashorn.internal.ir.CallNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @ProjectName: try
 * @Package: com.fileupload.demo.Controller
 * @ClassName: indexController
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/6 22:47
 * @Version: 1.0
 */
@Controller
public class indexController {
    private static final Logger logger = LoggerFactory.getLogger(indexController.class);


    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @PostMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败";
        }
        String filename = file.getOriginalFilename();
        String filepath = "C:\\Users\\zxcdr\\Desktop\\Tools\\";
        File file1 = new File(filepath + filename);
        try {
            file.transferTo(file1);
            logger.info("上传成功");
            return "上传成功";
        } catch (IOException e) {
            logger.error("上传失败");
            e.printStackTrace();
        }
        return "上传失败";
    }

}

package com.lvcai;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class readDAT {

    public static void main(String[] args) throws IOException {

        List<Demo> list = readFile("F:/QTDownloadRadio/download.dat");
        System.out.println(list);

        //扫描指定文件夹, 替换文件名
        File dir = new File("F:/QTDownloadRadio/");
        File[] files = dir.listFiles();

        list.stream().forEach(demo->{
          Arrays.asList(files).stream().forEach(file->{
              if(file.getName().equals(demo.getUniqueId().toString())){
                  file.renameTo(new File( "F:/QTDownloadRadio/"+demo.getProgramName()+".mp3"));
              }
          });
       });
    }

    public static List<Demo> readFile(String path){
        File f = new File(path);
        BufferedReader br = null;
        List<Demo> list = new ArrayList<Demo>();
        try {
            br = new BufferedReader(new FileReader(f));
            String content = null;
            while (true) {
                content = br.readLine();
                if(content == null){
                    break;
                }
                Demo demo =JSON.parseObject(content,Demo.class);
                list.add(demo);
            }

        } catch (Exception e) {
        }
        return list;
    }

}

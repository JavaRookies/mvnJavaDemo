package nuist.dymvn.IODemo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by dy on 2017/7/28.
 * 使用文件过滤器筛选文件名符合要求得文件    list(new FilenameFilter)、listFiles(new FilenameFilter)
 *
 */
public class FileFilterTest {
    public static void main(String[] args){
        File file = new File("E:\\视频");
        String name = "使用说明.docx";
        File[] files = fileFilter(file,name);
        for(File  file2 : files){
            System.out.println(file2.getAbsoluteFile());
        }
    }

    /**
     * 按文件名进行文件过滤
     * @param dir:目录
     * @param name：文件名
     * @return 符合条件的文件类对象数组
     */
    public static File[] fileFilter(File dir, final String name){
        File[] files = dir.listFiles(new FilenameFilter() {         //虚拟构造函数
            public boolean accept(File dir, String filename) {     //重写accept方法
                return new File(dir,filename).isFile() && filename.equals(name);
            }
        });
        return files;
    }
}

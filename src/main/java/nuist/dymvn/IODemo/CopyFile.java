package nuist.dymvn.IODemo;

import java.io.*;

/**
 * Created by dy on 2017/8/2.
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        File originalFile = new File("FileTest\\myfile.txt");
        File destFile = new File("FileTest\\copyFile.txt");
            long time = copyFolderChar5(originalFile,destFile);
            System.out.println("复制耗时"+time);
            disPlay(destFile);
    }

    private static void disPlay(File originalFile) throws IOException{
        FileInputStream fis = new FileInputStream(originalFile);
        int data;
        System.out.print(originalFile.getName()+":");
        while(( data = fis.read())!=-1){
            System.out.print((char)data);
        }
        fis.close();
    }

    //每次一个字节流，复制文件
    private static long copyFolder1(File originalFile, File destFile) throws IOException {
        long timeStart = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(originalFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        int data ;
        while(( data = fis.read())!=-1){
            fos.write((char)data);
        }
        fos.close();
        fis.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //每次读取一个字节数组，复制文件
    private static long copyFolder2(File originalFile, File destFile) throws IOException {
        long timeStart = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(originalFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] bytes = new byte[1024];
        int len=0;
        while(( len = fis.read(bytes))!=-1){          //读取字节流，放在bytes缓冲区
            fos.write(bytes,0,len);                   //将bytes缓冲区中从0-len字节的数据写入到fos文件中
        }
        fos.close();
        fis.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //缓冲区每次读取一个字节，复制文件
    private static long copyFolder3(File originalFile, File destFile) throws IOException{
        long timeStart = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int len = 0;
        while((len = bis.read())!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //缓冲区每次读取一个字节数组，复制文件
    private static long copyFolder4(File originalFile, File destFile) throws IOException{
        long timeStart = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //字符流复制文件，每次读一个字符
    private static long copyFolderChar1(File originalFile, File destFile) throws IOException{
        long timeStart = System.currentTimeMillis();

        InputStreamReader fr = new InputStreamReader(new FileInputStream(originalFile));     //指定了默认字符集和默认字符缓冲区大小
        OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream(destFile));

        int len = 0;
        while((len = fr.read())!=-1){
            fw.write(len);
        }
        fw.close();
        fr.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //字符流复制文件，每次读一个字符
    private static long copyFolderChar2(File originalFile, File destFile) throws IOException{
        long timeStart = System.currentTimeMillis();

        FileReader fr = new FileReader(originalFile);     //指定了默认字符集和默认字符缓冲区大小
        FileWriter fw = new FileWriter(destFile);

        int len = 0;
        while((len = fr.read())!=-1){
            fw.write(len);
        }
        fw.close();
        fr.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //字符流复制文件，每次读一个字符数组
    private static long copyFolderChar3(File originalFile, File destFile) throws IOException{
        long timeStart = System.currentTimeMillis();

        FileReader fr = new FileReader(originalFile);     //指定了默认字符集和默认字符缓冲区大小
        FileWriter fw = new FileWriter(destFile);

        char[] chars = new char[1024];
        int len = 0;
        while((len = fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }
        fw.close();
        fr.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //字符流缓冲区复制文件，每次读一个字符
    private static long copyFolderChar4(File originalFile, File destFile) throws IOException{
        long timeStart = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new FileReader(originalFile));     //指定了默认字符集和默认字符缓冲区大小
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));

        int len = 0;
        while((len = br.read())!=-1){
            bw.write(len);
        }
        bw.close();
        br.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }

    //字符流缓冲区复制文件，每次读一个字符串
    private static long copyFolderChar5(File originalFile, File destFile) throws IOException{
        long timeStart = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new FileReader(originalFile));     //指定了默认字符集和默认字符缓冲区大小
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));


        String line=null;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
        long timeEnd = System.currentTimeMillis();
        long times = timeEnd - timeStart;
        return times;
    }


}

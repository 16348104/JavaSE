package NCR.jbcz.L7_1;

import java.io.File;
import java.io.IOException;

/**
 * Created by zb on 2018/3/1.
 * 打印出用命令行参数指定录井下的所有目录及子目录
 */
public class FindDirectories {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"..."};
        }
        try {
            File pathName = new File(args[0]);                      //建立文件（目录）对象
            String[] fileNames = pathName.list();                    //路径文件名数组赋值
            pathName = new File(args[0]);
            for (int i = 0; i < fileNames.length; i++) {
                File f = new File(pathName.getPath(), fileNames[i]);
                if (f.isDirectory()) {
                    System.out.println(f.getCanonicalPath());      //输出规范文件路径
                    main(new String[]{f.getPath()});               //遍历所有子目录
                }
            }
        } catch (IOException e) {                           //捕捉IO异常
            e.printStackTrace();
        }
    }
}
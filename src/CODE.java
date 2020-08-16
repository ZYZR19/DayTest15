/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-16
 * Time: 21:21
 */
public class CODE {

        public String replaceSpace(StringBuffer str) {
            //先遍历旧的字符串找出有多少个空格
            //计算出新字符串的长度
            //在新旧字符串上分别设置指针指向他们的尾部
            //遍历旧的字符串 如果遇到空格写入0 2 % 如果是正常就写原来的
            String st = "happy";
            int count =0;
            for(int i =0;i<str.length();i++) {
                if(str.charAt(i)==' '){
                    count ++;
                }
            }
            int oldlength = str.length();
            int newlength = oldlength + 2*count;
            str.setLength(newlength);
            int newindex = newlength -1;
            int oldindex = oldlength-1;
            for(;oldindex>=0;oldindex--) {

            }
              return st;
    }
}

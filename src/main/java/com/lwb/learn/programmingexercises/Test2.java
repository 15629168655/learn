package com.lwb.learn.programmingexercises;


/**
 * ��Ŀ����
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * Created by LIWENBIN on 2018/8/6
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(replaceSpace1(new StringBuffer("We Are Happy")));
        System.out.println(replaceSpace2(new StringBuffer("We Are Happy")));
    }

    public static String replaceSpace1(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }

    public static String replaceSpace2(StringBuffer str) {
        if(str==null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

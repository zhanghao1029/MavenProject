package yinzhang.test;
import java.awt.Color;
import java.io.IOException;

import yinzhang.config.SealCircle;
import yinzhang.config.SealConfiguration;
import yinzhang.config.SealFont;
import yinzhang.utils.SealUtil;


public class Main {

    public static void main(String[] args) throws Exception {
        /**
         * 印章配置文件
         */
        SealConfiguration configuration = new SealConfiguration();

        /**
         * 主文字
         */
        SealFont mainFont = new SealFont();
//        mainFont.setBold(true);
        mainFont.setFontFamily("宋体");
        mainFont.setMarginSize(15);
        
        /**************************************************/
        mainFont.setFontText("合荣欣业");
        mainFont.setFontSize(18);
        mainFont.setFontSpace(10.0);

        /**
         * 副文字
         */
        SealFont viceFont = new SealFont();
//        viceFont.setBold(true);
//        viceFont.setFontFamily("宋体");
//        viceFont.setMarginSize(5);
        /**************************************************/
//        viceFont.setFontText("营业部");
//        viceFont.setFontSize(22);
//        viceFont.setFontSpace(12.0);

        /**
         * 中心文字
         */
        SealFont centerFont = new SealFont();
//        centerFont.setBold(true);
        centerFont.setFontFamily("宋体");
        /**************************************************/
        centerFont.setFontText("许竹龙\n\n\n");
        centerFont.setFontSize(18);
        
        /**
         * 中心文字2
         */
        SealFont centerFont2 = new SealFont();
//        centerFont2.setBold(true);
        centerFont2.setFontFamily("Calibri");
        /**************************************************/
        centerFont2.setFontText("MWQWOOOO7TYY");
        centerFont2.setFontSize(15);

        /**
         * 抬头文字
         */
        SealFont titleFont = new SealFont();
//        titleFont.setBold(true);
        titleFont.setFontFamily("宋体");
        titleFont.setFontSize(25);
        /**************************************************/
        titleFont.setFontText("正版认证");
        titleFont.setMarginSize(68);
        titleFont.setMarginSize(27);

        /**
         * 添加主文字
         */
        configuration.setMainFont(mainFont);
        /**
         * 添加副文字
         */
//        configuration.setViceFont(viceFont);
        /**
         * 添加中心文字
         */
        configuration.setCenterFont(centerFont);
        /**
         * 添加中心文字
         */
        configuration.setCenterFont2(centerFont2);
        /**
         * 添加抬头文字
         */
        //configuration.setTitleFont(titleFont);

        /**
         * 图片大小
         */
        configuration.setImageSize(220,140);
        /**
         * 背景颜色
         */
        configuration.setBackgroudColor(Color.RED);
        /**
         * 边线粗细、半径
         */
        configuration.setBorderCircle(new SealCircle(3, 100, 60));
        /**
         * 内边线粗细、半径
         */
//        configuration.setBorderInnerCircle(new SealCircle(1, 135, 95));
        /**
         * 内环线粗细、半径
         */
//        configuration.setInnerCircle(new SealCircle(2, 85, 45));

        //1.生成公章
        try {
            SealUtil.buildAndStoreSeal(configuration, "C:\\公章.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.生成私章
        SealFont font = new SealFont();
        font.setFontSize(120).setBold(true).setFontText("张浩");
        SealUtil.buildAndStorePersonSeal(300, 16, font, "印", "C:\\私章.png");
    }

}

package yinzhang.config;

import java.awt.Color;

/**
 * @Description: 鍗扮珷閰嶇疆绫� * @Author Ran.chunlin
 * @Date: Created in 12:17 2018-10-04
 */
public class SealConfiguration {
    /**
     * 涓绘枃瀛�     */
    private SealFont mainFont;
    /**
     * 鍓枃瀛�     */
    private SealFont viceFont;
    /**
     * 鎶ご鏂囧瓧
     */
    private SealFont titleFont;
    /**
     * 涓績鏂囧瓧
     */
    private SealFont centerFont;
    /**
     * 涓績鏂囧瓧2
     */
    private SealFont centerFont2;
    /**
     * 杈圭嚎鍦�     */
    private SealCircle borderCircle;
    /**
     * 鍐呰竟绾垮渾
     */
    private SealCircle borderInnerCircle;
    /**
     * 鍐呯嚎鍦�     */
    private SealCircle innerCircle;
    /**
     * 鑳屾櫙鑹诧紝榛樿绾㈣壊
     */
    private Color backgroudColor = Color.RED;
    /**
     * 鍥剧墖杈撳嚭灏哄锛岄粯璁�00
     */
    private int imageSizeX = 300;
    private int imageSizeY = 300;

    public SealConfiguration setMainFont(SealFont mainFont) {
        this.mainFont = mainFont;
        return this;
    }

    public SealConfiguration setViceFont(SealFont viceFont) {
        this.viceFont = viceFont;
        return this;
    }

    public SealConfiguration setTitleFont(SealFont titleFont) {
        this.titleFont = titleFont;
        return this;
    }

    public SealConfiguration setCenterFont(SealFont centerFont) {
        this.centerFont = centerFont;
        return this;
    }
    
    public SealConfiguration setCenterFont2(SealFont centerFont2) {
        this.centerFont2 = centerFont2;
        return this;
    }

    public SealConfiguration setBorderCircle(SealCircle borderCircle) {
        this.borderCircle = borderCircle;
        return this;
    }

    public SealConfiguration setBorderInnerCircle(SealCircle borderInnerCircle) {
        this.borderInnerCircle = borderInnerCircle;
        return this;
    }

    public SealConfiguration setInnerCircle(SealCircle innerCircle) {
        this.innerCircle = innerCircle;
        return this;
    }

    public SealConfiguration setBackgroudColor(Color backgroudColor) {
        this.backgroudColor = backgroudColor;
        return this;
    }

    public SealConfiguration setImageSize(int imageSizeX,int imageSizeY) {
        this.imageSizeX = imageSizeX;
        this.imageSizeY = imageSizeY;
        return this;
    }

    public SealFont getMainFont() {
        return mainFont;
    }

    public SealFont getViceFont() {
        return viceFont;
    }

    public SealFont getTitleFont() {
        return titleFont;
    }

    public SealFont getCenterFont() {
        return centerFont;
    }
    
    public SealFont getCenterFont2() {
        return centerFont2;
    }

    public SealCircle getBorderCircle() {
        return borderCircle;
    }

    public SealCircle getBorderInnerCircle() {
        return borderInnerCircle;
    }

    public SealCircle getInnerCircle() {
        return innerCircle;
    }

    public Color getBackgroudColor() {
        return backgroudColor;
    }

    public int getImageSizeX() {
        return imageSizeX;
    }
    
    public int getImageSizeY() {
        return imageSizeY;
    }
}

package lib.image.compress;

import android.graphics.Bitmap;

final class Compress {

    static {
        System.loadLibrary("jpeg_compress");
    }

    /**
     *
     * @param outpath 保存路径
     * @param bitmap bitmap图片
     * @param ratio 质量1-100 1表示最低质量
     * @param hoffman 是否使用哈夫曼编码
     * @return 1:成功, 0：失败
     */
    public static native int sync(String outpath, Bitmap bitmap, int ratio, boolean hoffman);
}
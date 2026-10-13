package center;

import java.awt.*;

public class CenterFramebyPoint {
    public static Point getLocation(int width, int height) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSizeDim = toolkit.getScreenSize();

        int sw = screenSizeDim.width;
        int sh = screenSizeDim.height;

        int x = (sw-width)/2;
        int y = (sh-height)/2;

        Point point = new Point(x, y);

        return point;
    }
}

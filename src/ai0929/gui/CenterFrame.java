package ai0929.gui;

import java.awt.*;

public class CenterFrame {
    public static int[] getLocation(int width, int height) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSizeDim = toolkit.getScreenSize();

        int sw = screenSizeDim.width;
        int sh = screenSizeDim.height;

        int x = (sw-width)/2;
        int y = (sh-height)/2;

        int[] location = {x, y};

//        Dimension locationDim = new Dimension(x, y);

        return location;
    }
}

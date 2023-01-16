import util.MenuUtil;

import java.io.IOException;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "resources", "ikea.csv");
        MenuUtil menuUtil = new MenuUtil();
        menuUtil.menuList(path);
    }
}

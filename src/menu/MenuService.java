package menu;

import model.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private List<MenuItem> menuItems;

    public MenuService() {
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}

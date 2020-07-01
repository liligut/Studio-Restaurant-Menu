package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menu = new ArrayList<>();
    private Date date;

    public Menu() {
        this.date = new Date();
    }

    public void addMenuItem(MenuItem aMenuItem){
        menu.add(aMenuItem);
    }

    public static Date getDate(){
        return new Date();
    }
}

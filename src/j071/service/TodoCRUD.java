package j071.service;
import j071.model.TodoItem;
import java.util.*;

public class TodoCRUD implements iCRUD {

    private ArrayList<TodoItem> list;

    public TodoCRUD(){
        this.list = new ArrayList<>();
    }

    @Override
    public Object createItem(){
        String title, desc;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the title: ");
        title = s.nextLine().trim();

        if(isDuplicated(title)){
            System.out.println("Title can't be duplicated.");
            return null;
        }

        System.out.print("Enter the detail: ");
        desc = s.nextLine().trim();

        TodoItem t = new TodoItem(title, desc);

        return t;
    }

    @Override
    public int addItem() {
       System.out.println("Add a Todo item");

       TodoItem t = (TodoItem)createItem();

       if(t == null) return 1;

       this.list.add(t);
       System.out.println("item added.");
       return 0;

    }

    @Override
    public int updateItem(){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the title of the item to edit: ");
        String title = s.nextLine().trim();

        TodoItem item = findItem(title);
        if(item == null){
            System.out.println("Not found.");
            return 1;
        }

        System.out.println(item.toString());
        System.out.print("Enter the detail: ");
        String desc = s.nextLine().trim();

        item.setDetail(desc);
        System.out.println("item updated.");

        return 0;

    }

    @Override
    public int deleteItem(){
        Scanner s = new Scanner(System.in);
        String title;

        System.out.println("Delete a Todo Item");
        System.out.print("Enter the title of the item to remove: ");
        title = s.nextLine().trim();

        TodoItem item = findItem(title);
        if(item == null){
            System.out.println("Not found");
            return 1;
        }

        System.out.println(item.toString());
        this.list.remove(item);

        System.out.println("item deleted.");

        return 0;
    }

    @Override
    public int printItem(){
        return printAll();
    }

    TodoItem findItem(String title){
        for(TodoItem item : this.list){
            if(title.equals(item.getTitle())){
                return item;
            }
        }

        return null;
    }

    boolean isDuplicated(String title){
        for(TodoItem item : this.list){
            if(title.equals(item.getTitle())){
                return true;
            }
        }
        return false;
    }

    public int printAll(){
        Scanner s = new Scanner(System.in);

        System.out.println("Total " + this.list.size() + " items");
        for(TodoItem item : this.list){
            System.out.println(item.toString());
        }

        return 0;
    }

}

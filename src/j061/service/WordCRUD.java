package j061.service;
import j061.model.Word;
import java.util.*;

public class WordCRUD implements iWordCRUD {
    ArrayList<Word> list;

    public WordCRUD(){
        list = new ArrayList<Word>();
    }

    @Override
    public void addWord(){
        String english, korean;
        int level;

        Scanner s = new Scanner(System.in);
        System.out.print("English > ");
        english = s.next();
        s.nextLine();
        System.out.print("Korean > ");
        korean = s.nextLine();
        System.out.print("Level (1-3) > ");
        level = s.nextInt();

        Word new_word = new Word(english, korean, level);
        list.add(new_word);
    }

    @Override
    public void editWord() {
        listWord();

        if (list.size() == 0) {
            System.out.println("Empty");
            return;
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Number to edit > ");
        int index = s.nextInt() - 1;

        if(index < 0 || index >= list.size()){
            System.out.println("Wrong number");
            return;
        }

        s.nextLine();

        System.out.print("New meaning > ");
        String korean = s.nextLine();

        list.get(index).setKorean(korean);

        System.out.println("Updated.");
    }

    @Override
    public void listWord(){
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%d - %s\n", i+1, list.get(i).toString());
        }
    }

    @Override
    public void deleteWord(){
        listWord();

        if(list.size() == 0){
            System.out.println("Empty");
            return;
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Number to delete > ");
        int index = s.nextInt() - 1;

        if(index < 0 || index >= list.size()){
            System.out.println("Wrong number.");
            return;
        }

        list.remove(index);

        System.out.println("Deleted.");
    }
}

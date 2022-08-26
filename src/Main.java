import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        // 1
        File Games = new File("D:/Games");
        if (Games.mkdir()) s.append("Папка Games создана" + "\n");
        else s.append("Папка Games не создана" + "\n");
        System.out.println(s);

        File src = new File("D:/Games/src");
        if (src.mkdir()) s.append("Папка src создана" + "\n");
        else s.append("Папка src не создана" + "\n");

        File res = new File("D:/Games/res");
        if (res.mkdir()) s.append("Папка res создана" + "\n");
        else s.append("Папка res не создана" + "\n");

        File savegames = new File("D:/Games/savegames");
        if (savegames.mkdir()) s.append("Папка savegames создана" + "\n");
        else s.append("Папка savegames не создана" + "\n");

        File temp = new File("D:/Games/temp");
        if (temp.mkdir()) s.append("Папка temp создана" + "\n");
        else s.append("Папка temp не создана" + "\n");
        // 2
        File main = new File("D:/Games/src/main");
        if (main.mkdir()) s.append("Папка src/main создана" + "\n");
        else s.append("Папка src/main не создана" + "\n");

        File test = new File("D:/Games/src/test");
        if (test.mkdir()) s.append("Папка src/test создана" + "\n");
        else s.append("Папка src/test не создана" + "\n");
        // 3
        File MainJava = new File("D:/Games/src/main", "Main.java");
        try {
            if (MainJava.createNewFile()){
                s.append("Файл Main.java создан" + "\n");
            }
        } catch (IOException e) {
            s.append("Файл Main.java не создан" + "\n");
        }

        File UtilsJava = new File("D:/Games/src/main", "Utils.java");
        try {
            if (UtilsJava.createNewFile()){
                s.append("Файл Utils.java создан" + "\n");
            }
        } catch (IOException e) {
            s.append("Файл Utils.java не создан" + "\n");
        }
        //4
        File drawables = new File("D:/Games/res/drawables");
        if (drawables.mkdir()) s.append("Папка drawables создана" + "\n");
        else s.append("Папка drawables не создана" + "\n");

        File vectors = new File("D:/Games/res/vectors");
        if (vectors.mkdir()) s.append("Папка vectors создана" + "\n");
        else s.append("Папка vectors не создана" + "\n");

        File icons = new File("D:/Games/res/icons");
        if (icons.mkdir()) s.append("Папка icons создана" + "\n");
        else s.append("Папка icons не создана" + "\n");
        //5
        File tempTxt = new File("D:/Games/temp", "temp.txt");
        try {
            if (tempTxt.createNewFile()){
                s.append("Файл temp.txt создан" + "\n");
            }
        } catch (IOException e) {
            s.append("Файл temp.txt не создан" + "\n");
        }
        //6
        try (FileWriter fout = new FileWriter(tempTxt)) {
            fout.write(String.valueOf(s));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

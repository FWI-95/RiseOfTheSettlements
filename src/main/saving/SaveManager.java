import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.List;

public class SaveManager {
    private static final String SAVE_FILE = "game_save.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void saveGame(GameState gameState) {
        try (Writer writer = new FileWriter(SAVE_FILE)) {
            gson.toJson(gameState, writer);
            System.out.println("Game saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameState loadGame() {
        try (Reader reader = new FileReader(SAVE_FILE)) {
            return gson.fromJson(reader, GameState.class);
        } catch (FileNotFoundException e) {
            System.out.println("No save found. Starting a new game.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

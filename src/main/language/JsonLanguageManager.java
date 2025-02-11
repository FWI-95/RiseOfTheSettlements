import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

public class JsonLanguageManager {
    private static JsonObject translations;
    private static String currentLanguage = "en"; // Standard: Englisch

    /**
     * Lädt die Sprachdatei basierend auf dem gegebenen Sprachcode.
     * @param languageCode Sprachcode (z. B. "en", "de")
     */
    public static void loadLanguage(String languageCode) {
        currentLanguage = languageCode;
        String filePath = "assets/lang/lang_" + languageCode + ".json";

        try (FileReader reader = new FileReader(filePath)) {
            Gson gson = new Gson();
            translations = gson.fromJson(reader, JsonObject.class);
        } catch (IOException e) {
            System.err.println("Fehler beim Laden der Sprachdatei: " + filePath);
            e.printStackTrace();
        }
    }

    /**
     * Ruft einen Text basierend auf dem Schlüssel ab.
     * Unterstützt verschachtelte Keys (z. B. "game.start").
     * @param key Der Schlüssel für den Text.
     * @return Der übersetzte Text oder ein Platzhaltertext, falls nicht gefunden.
     */
    public static String getText(String key) {
        if (translations == null) {
            loadLanguage(currentLanguage);
        }

        String[] keys = key.split("\\."); // Unterstützung für verschachtelte Keys
        JsonObject currentObject = translations;
        for (int i = 0; i < keys.length - 1; i++) {
            if (currentObject.has(keys[i])) {
                currentObject = currentObject.getAsJsonObject(keys[i]);
            } else {
                return "???" + key + "???"; // Falls der Key nicht existiert
            }
        }
        return currentObject.has(keys[keys.length - 1]) ? currentObject.get(keys[keys.length - 1]).getAsString() : "???" + key + "???";
    }

    /**
     * Ruft einen Text mit Platzhalter-Unterstützung ab.
     * Beispiel: "player_joined" mit Platzhalter `{player}` wird durch den Wert ersetzt.
     * @param key Der Schlüssel für den Text.
     * @param placeholders Platzhalter-Werte als Map.
     * @return Der übersetzte und ersetzte Text.
     */
    public static String getText(String key, Map<String, String> placeholders) {
        String text = getText(key); // Holt den Originaltext

        for (Map.Entry<String, String> entry : placeholders.entrySet()) {
            text = text.replace("{" + entry.getKey() + "}", entry.getValue());
        }
        return text;
    }
}

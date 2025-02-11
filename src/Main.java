import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sprache laden
        JsonLanguageManager.loadLanguage("de");

        // Standard-Text abrufen
        System.out.println(JsonLanguageManager.getText("welcome")); // → Willkommen im Spiel!
        System.out.println(JsonLanguageManager.getText("game.start")); // → Spiel starten

        // Sprache wechseln
        JsonLanguageManager.loadLanguage("en");
        System.out.println(JsonLanguageManager.getText("welcome")); // → Welcome to the game!

        // Platzhalter-Unterstützung nutzen
        Map<String, String> values = Map.of("player", "Alex");
        System.out.println(JsonLanguageManager.getText("player_joined", values)); 
        // → Alex ist dem Spiel beigetreten!

        values = Map.of("level", "3", "time", "45");
        System.out.println(JsonLanguageManager.getText("level_complete", values));
        // → Level 3 wurde in 45 Sekunden abgeschlossen.
    }
}

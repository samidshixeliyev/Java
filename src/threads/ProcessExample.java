package threads;

public class ProcessExample {

    public static void main(String[] args) {
        try {
            // Windows üzərində "notepad" tətbiqini başlatmaq
            Process process = Runtime.getRuntime().exec("notepad.exe");
            // Process başlatdıqdan sonra bir müddət gözləyirik
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

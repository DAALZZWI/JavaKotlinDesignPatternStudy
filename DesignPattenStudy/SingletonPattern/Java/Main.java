package SingletonPattern.Java;

public class Main {

    public static void main(String[] args) {

        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        systemSpeaker1.setVolume(5);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        systemSpeaker1.setVolume(10);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());

        systemSpeaker2.setVolume(2);
        System.out.println(systemSpeaker1.getVolume());
        System.out.println(systemSpeaker2.getVolume());
    }
}

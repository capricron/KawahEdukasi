package week1;

public class FlowControll {
    public static void main(String[] args) {
        String nol = null;
        Float desimal = null;
        int angka = 24;
        if (angka > 20) {
            System.out.println("angka lebih dari dua puluh");
        } else {
            System.out.println("angka kurang dari dua puluh");
        }
        // Tenary operator
        String penampung = (angka < 25) ? "Angka kurang dari 25" : "Angka lebih dari 25";
        System.out.println(penampung);

        // Switch Case
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("nilai 80");
                break;
            case "B":
                System.out.println("nilai 70");
                break;
            case "C":
                System.out.println("nilai 60");
                break;
            default:
                System.out.println("nilai 50");
        }
    }
}

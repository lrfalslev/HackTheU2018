package project;

public class modifier {
    public static int getMod (int abilityScore){
        if (abilityScore <= 1) {
            return -5;
        } else if (abilityScore <= 3) {
            return -4;
        } else if (abilityScore <= 5) {
            return -3;
        } else if (abilityScore <= 7) {
            return -2;
        } else if (abilityScore <= 9) {
            return -1;
        } else if (abilityScore <= 11) {
            return 0;
        } else if (abilityScore <= 13) {
            return 1;
        } else if (abilityScore <= 15) {
            return 2;
        } else if (abilityScore <= 17) {
            return 3;
        } else if (abilityScore <= 19) {
            return 4;
        } else if (abilityScore <= 21) {
            return 5;

        }



    }
}

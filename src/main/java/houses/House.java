package houses;

import java.util.Arrays;

public class House {
    private Foundation foundation;
    private Residents[] residents;

    public House(Foundation foundation) {
        this.foundation = foundation;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public Residents[] getResidents() {
        return residents;
    }

    public void setResidents(Residents[] residents) {
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation=" + foundation +
                ", residents=" + Arrays.toString(residents) +
                '}';
    }
}

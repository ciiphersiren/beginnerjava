import space.missions.MarsMission;
import space.missions.JupiterMission;
import space.missions.SaturnMission;

public class SpaceAdventure {
    public static void main(String[] args) {
        MarsMission marsMission = new MarsMission();
        JupiterMission jupiterMission = new JupiterMission();
        SaturnMission saturnMission = new SaturnMission();

        marsMission.launch();
        jupiterMission.launch();
        saturnMission.launch();
    }
}

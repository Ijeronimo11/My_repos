package src.flowControl.ifElse.SamoletxD;

public class AirplaneFactory {
    public int weightCount(Airplane[]airs) {
        int count = 0;
        for (Airplane airplane : airs) {
            if (airplane.weighth >= 50) {
                count++;
            }
        }
        return count;
    }
}

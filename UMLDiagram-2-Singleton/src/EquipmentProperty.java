public class EquipmentProperty {
    private static EquipmentProperty instance;

    private EquipmentProperty() {
        // Constructor logic...
    }

    public static EquipmentProperty getInstance() {
        if (instance == null) {
            instance = new EquipmentProperty();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Equipment Property Object";
    }
}

public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void setModelName(String newModelName) {
        this.modelName = newModelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}

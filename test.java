class CoffeeMachine implements Runnable {
    private String machineId;
    private String coffeeType;

    public CoffeeMachine(String machineId, String coffeeType) {
        this.machineId = machineId;
        this.coffeeType = coffeeType;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Currently the coffee Machine " + machineId + " is brewing " + coffeeType);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread machine1 = new Thread(new CoffeeMachine("CM1", "Espresso"));
        Thread machine2 = new Thread(new CoffeeMachine("CM2", "Latte"));
        Thread machine3 = new Thread(new CoffeeMachine("CM3", "Cappuccino"));

        machine1.start();
        machine2.start();
        machine3.start();
    }
}

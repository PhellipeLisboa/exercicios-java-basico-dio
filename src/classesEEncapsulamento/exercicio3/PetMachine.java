package classesEEncapsulamento.exercicio3;

public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void washPet() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para inciar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.printf("%s está limpo.\n", pet.getName());
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("O nível de água da máquina já está no máximo.");
            return;
        }

        water += 2;
    }
    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("O nível de shampoo da máquina já está no máximo.");
            return;
        }

        shampoo += 2;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {

        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpá-la primeiro.");
            return;
        }

        if (hasPet()) {
            System.out.printf("%s já está na máquina nesse momento. \n", this.pet.getName());
            return;
        }

        this.pet = pet;
        System.out.printf("%s foi colocado na máquina.\n ", pet.getName());
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.printf("%s foi retirado da máquina.\n", pet.getName());
        this.pet = null;
    }

    public void clearMachine() {
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina está limpa.");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

}

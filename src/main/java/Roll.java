public class Roll {

    private int[] roll;

    public Roll(int... dices){
        roll = new int[dices.length];

        for (int i = 0; i < dices.length; i++){
            System.out.println();
            roll[i] = dices[i];
        }
    }
    public int[] getRoll(){
        return this.roll;
    }
}
public class LoenKonto {

    private int saldo;

    public void laegPengeInd(int belob) {
        saldo = saldo + belob;
    }

    public int getSaldo() {
        return saldo;
    }

    public int setSaldo(int saldo) {
        this.saldo = saldo;
        return saldo;
    }
}

public class Terminal<MABDA,MAGHSAD,MODEL,NAME> {
    private MABDA shahrMabda;
    private MAGHSAD shahrMaghsad;
    private MODEL carModel;
    private NAME name;

    public MABDA getShahrMabda() {
        return shahrMabda;
    }

    public MAGHSAD getShahrMaghsad() {
        return shahrMaghsad;
    }

    public MODEL getCarModel() {
        return carModel;
    }

    public NAME getName() {
        return name;
    }

    public void setShahrMabda(MABDA shahrMabda) {
        this.shahrMabda = shahrMabda;
    }

    public void setShahrMaghsad(MAGHSAD shahrMaghsad) {
        this.shahrMaghsad = shahrMaghsad;
    }

    public void setCarModel(MODEL carModel) {
        this.carModel = carModel;
    }

    public void setName(NAME name) {
        this.name = name;
    }
}

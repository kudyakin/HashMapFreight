import java.util.Objects;

public class Freight {
    private final String PortOfLoading;
    private final String PortOfDischarge;
    private final String Carrier;
    private final int rate;

    public Freight(String portOfLoading, String portOfDischarge, String carrier, int rate) {
        PortOfLoading = portOfLoading;
        PortOfDischarge = portOfDischarge;
        Carrier = carrier;
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Freight freight = (Freight) o;
        return rate == freight.rate && PortOfLoading.equals(freight.PortOfLoading) && PortOfDischarge.equals(freight.PortOfDischarge) && Carrier.equals(freight.Carrier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PortOfLoading, PortOfDischarge, Carrier, rate);
    }

    public String toString() {
        return "[Порт Погрузки: " + PortOfLoading + ", Порт Выгрзуки: " + PortOfDischarge + ", Перевозчик: " + Carrier + ", Ставка: " + rate + "]";
    }
}
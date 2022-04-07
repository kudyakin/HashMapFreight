import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Freight freight1 = new Freight("Shanghai", "Odessa", "OOCL", 13300);
        Freight freight2 = new Freight("Ningbo", "Rotterdam", "COSCO", 16700);
        Freight freight3 = new Freight("Qingdao", "Gdinya", "CMA", 8700);
        Freight freight4 = new Freight("Istanbul", "Contstanta", "ZIM", 800);
        Freight freight5 = new Freight("Zhapu", "Hamburg", "MSC", 7200);
        
        FreightMap<String, Freight> map = new BaseFreightHashMap<>();

        System.out.println("   ");
        System.out.println("put key null: " + map.put(null, freight1));
        System.out.println("put value null: " + map.put("SHA-ODS 40HC", null));
        System.out.println("   ");
        System.out.println("put info for freight-1: " + map.put("SHA-ODS 40HC", freight1));
        System.out.println("put info for freight-2: " + map.put("NGB-ROT 40HC", freight2));
        System.out.println("put info for freight-3: " + map.put("QIN-GDN 20DV", freight3));
        System.out.println("put info for freight-4: " + map.put("IST-CON 40HC", freight4));
        System.out.println("put info for freight-5: " + map.put("ZHA-HAM 20DV", freight5));
        System.out.println("   ");
        System.out.println("all freight rates in base now: " + map.toString());
        System.out.println("   ");
        System.out.println("remove freight-5: " + map.remove("ZHA-HAM 20DV"));
        System.out.println("   ");
        System.out.println("contains key ZHA-HAM 20D: " + map.containsKey("ZHA-HAM 20DV"));
        System.out.println("   ");
        System.out.println("get info for IST-CON 40HC: " + map.get("IST-CON 40HC"));
        System.out.println("   ");
        System.out.println("is empty map: " + map.isEmpty());
        System.out.println("   ");
        System.out.println("map size: " + map.size());
        System.out.println("   ");
        System.out.println("map to array = " + Arrays.toString(map.toArray()));
        System.out.println("   ");
        System.out.println("clear map");
        map.clear();
        System.out.println("   ");
        System.out.println("is empty map: " + map.isEmpty());
        System.out.println("   ");
        System.out.println("map size: " + map.size());
    }
}

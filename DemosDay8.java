
interface AllowStorage{
}

class TestStorage {
}
public class DemosDay8 {
static void store(Object obj) {
if(obj instanceof AllowStorage)
System.out.println("obj can be stored");

else
System.out.println("Obj cannot be stored");
}

public static void main(String[] args) {

TestStorage ts=new TestStorage();
store(ts);

}
}








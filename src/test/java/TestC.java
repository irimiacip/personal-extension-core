import org.testng.annotations.Test;

public class TestC extends A{
@Test(priority = 1)
    public void test(){
    TestC.xxx();
    TestC.yyy();
}
}

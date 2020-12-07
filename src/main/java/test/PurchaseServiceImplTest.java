package test;

import com.heeexy.example.model.Purchase;
import com.heeexy.example.service.PurchaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseServiceImplTest {
    @Autowired
    PurchaseService purchaseService;

    @Test
    public void spilit(){
        purchaseService.splitPurchase(1941);
    }


}
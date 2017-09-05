package com.jgb.designpatterns.bridge.abstraction;

import com.jgb.designpatterns.bridge.implementer.CentralLocking;
import com.jgb.designpatterns.bridge.implementer.GearLocking;
import com.jgb.designpatterns.bridge.implementer.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author txoppe
 * @since 05/09/2017 | 15:57
 */
public class BridgePatternTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testBridgePattern() throws Exception {
        Product centralLockingProduct = new CentralLocking("Central Locking System");
        Product gearLockingProduct = new GearLocking("Gear Locking System");

        Car carBigWheelCentralLocking = new BigWheel(centralLockingProduct, "BigWheel XZ model");
        carBigWheelCentralLocking.produceProduct();
        carBigWheelCentralLocking.assemble();
        carBigWheelCentralLocking.printDetails();

        System.out.println();

        Car carBigWheelGearLocking = new BigWheel(gearLockingProduct, "BigWheel XZ model");
        carBigWheelGearLocking.produceProduct();
        carBigWheelGearLocking.assemble();
        carBigWheelGearLocking.printDetails();

        System.out.println("-----------------------------------------------------");

        Car carMotorenCentralLocking = new Motoren(centralLockingProduct, "Motoren lm model");
        carMotorenCentralLocking.produceProduct();
        carMotorenCentralLocking.assemble();
        carMotorenCentralLocking.printDetails();

        System.out.println();

        Car carMotorenGearLocking = new Motoren(gearLockingProduct, "Motoren lm model");
        carMotorenGearLocking.produceProduct();
        carMotorenGearLocking.assemble();
        carMotorenGearLocking.printDetails();
    }

}
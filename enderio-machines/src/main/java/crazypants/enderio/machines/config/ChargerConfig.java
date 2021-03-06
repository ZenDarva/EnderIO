package crazypants.enderio.machines.config;

import crazypants.enderio.base.config.factory.IValue;
import crazypants.enderio.base.config.factory.IValueFactory;

public final class ChargerConfig {

  public static final IValueFactory F = Config.F.section("wireless");

  public static final IValue<Integer> wirelessRange = F.make("wirelessRange", 16, //
      "The range of wireless chargers (block version).").setRange(1, 160).sync();

  public static final IValue<Integer> wirelessRangeAntenna = F.make("wirelessRangeAntenna", 24, //
      "The range of wireless chargers (antenna version).").setRange(1, 160).sync();

  public static final IValue<Integer> wirelessRangeEnhancedAntenna = F.make("wirelessRangeEnhancedAntenna", 64, //
      "The range of wireless chargers (enhanced antenna version).").setRange(1, 160).sync();

  public static final IValue<Integer> wirelessRangeEnhancedAntennaExtension = F.make("wirelessRangeEnhancedAntennaExtension", 128, //
      "The range of wireless chargers (extension antennas).").setRange(1, 160).sync();

}

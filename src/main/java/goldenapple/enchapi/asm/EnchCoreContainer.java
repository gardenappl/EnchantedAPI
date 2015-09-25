package goldenapple.enchapi.asm;

import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.FMLRelaunchLog;
import goldenapple.enchapi.reference.Reference;
import org.apache.logging.log4j.Level;

public class EnchCoreContainer extends DummyModContainer {
    public static final String MOD_ID = "enchcore";
    public static final String MOD_NAME = "Enchanted Core";

    public EnchCoreContainer(){
        super(new ModMetadata());
        ModMetadata meta = getMetadata();
        meta.modId = MOD_ID;
        meta.name = MOD_NAME;
        meta.version = Reference.VERSION;
        meta.authorList.add("goldenapple");
        meta.description = "The core mod for the Enchanted API. It's needed for stuff and things to work.";
        meta.credits = "Ljfa for providing examples of writing coremods";
        meta.parent = Reference.MOD_ID;
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        return true;
    }

    public static class RelaunchLogHelper{
        public static void info(String string, Object... formatData){
            FMLRelaunchLog.log(MOD_NAME, Level.INFO, string, formatData);
        }

        public static void error(String string, Object... formatData){
            FMLRelaunchLog.log(MOD_NAME, Level.ERROR, string, formatData);
        }
    }
}

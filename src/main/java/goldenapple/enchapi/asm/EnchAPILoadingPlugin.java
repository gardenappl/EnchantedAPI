package goldenapple.enchapi.asm;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

/* !! Make sure to not exclude event classes or else they won't work http://www.minecraftforge.net/forum/index.php?topic=9378.0 !! */
@IFMLLoadingPlugin.TransformerExclusions("goldenapple.enchapi.asm") //modifying my own mod while I'm modifying my own mod isn't cool.
@IFMLLoadingPlugin.MCVersion("1.7.10")
public class EnchAPILoadingPlugin implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        return new String[]{ItemTransformer.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return EnchCoreContainer.class.getName();
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}

# EnchantedAPI
A small Minecraft coremod that provides a small API. It hooks into the game's enchanting mechanics, and fires events that allows other modders to do stuff with things.

Originally was a part of [EnchantedBaubles] (https://github.com/goldenapple3/EnchantedBaubles).

**Note**: If you want to run the mod in a development environment, you'll have to put
```-Dfml.coreMods.load=goldenapple.enchapi.asm.EnchAPILoadingPlugin``` in the *VM* arguments 
(*not* the Program arguments). Otherwise Forge won't load the built-in coremod, and the mod won't work.

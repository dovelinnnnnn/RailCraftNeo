package cn.dovelin.railcraftneo.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new RailcraftNeoBlockModelGen(output,helper));
        generator.addProvider(
                // Tell generator to run only when client assets are generating
                event.includeClient(),
                // Localizations for American English
                new RailcraftNeoLanProvider.TranslationForEnglish(output,"en_us")
        );
        generator.addProvider(
                // Tell generator to run only when client assets are generating
                event.includeClient(),
                // Localizations for American English
                new RailcraftNeoLanProvider.TranslationForEnglish(output,"zh_cn")
        );

    }
}

package com.ybzg.gradlebuild;

import com.android.SdkConstants;
import com.android.build.gradle.BaseExtension;
import com.android.build.gradle.api.AndroidSourceSet;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.SourceSet;

public class ComBuild implements Plugin<Project> {
    @Override
    public void apply(final Project project) {

        boolean isRunAlone = Boolean.parseBoolean((String) project.getProperties().get("isRunAlone"));

        if (isRunAlone) {
            project.getPluginManager().apply("com.android.application");
            final BaseExtension extension = project.getExtensions().findByType(BaseExtension.class);
            AndroidSourceSet main = extension.getSourceSets().getByName(SourceSet.MAIN_SOURCE_SET_NAME);
            main.getManifest().srcFile("src/" + main.getName() + "/" + "runalone/" + SdkConstants.FN_ANDROID_MANIFEST_XML);

        } else {
            project.getPluginManager().apply("com.android.library");
        }

    }
}

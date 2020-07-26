package net.haesleinhuepf.clijx.incubator.interactive.suggestions;

import net.haesleinhuepf.clijx.incubator.interactive.generated.MultiplyImageAndScalar;
import net.haesleinhuepf.clijx.incubator.interactive.generated.Rotate;
import net.haesleinhuepf.clijx.incubator.interactive.handcrafted.SphereTransform;
import net.haesleinhuepf.clijx.incubator.utilities.SuggestedPlugin;

// this is generated code. See src/test/java/net/haesleinhuepf/clincubator/PluginGenerator.java for details.
public interface TransposeXYSuggestion extends SuggestedPlugin {
    default Class[] suggestedNextSteps() {
        return new Class[] {
                Rotate.class,
SphereTransform.class
        };
    }

    default Class[] suggestedPreviousSteps() {
        return new Class[]{
                MultiplyImageAndScalar.class
        };
    }
}

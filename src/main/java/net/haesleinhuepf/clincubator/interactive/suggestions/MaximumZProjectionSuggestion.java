package net.haesleinhuepf.clincubator.interactive.suggestions;

import net.haesleinhuepf.clincubator.utilities.SuggestedPlugin;

public interface MaximumZProjectionSuggestion extends SuggestedPlugin {
    default Class[] suggestedNextSteps() {
        return new Class[] {
                net.haesleinhuepf.clincubator.interactive.generated.DetectAndLabelMaxima.class,
net.haesleinhuepf.clincubator.interactive.generated.ThresholdDoG.class
        };
    }

    default Class[] suggestedPreviousSteps() {
        return new Class[]{
                net.haesleinhuepf.clincubator.interactive.generated.Rotate.class,
net.haesleinhuepf.clincubator.interactive.handcrafted.SphereTransform.class,
net.haesleinhuepf.clincubator.interactive.handcrafted.MakeIsotropic.class,
net.haesleinhuepf.clincubator.interactive.generated.ResliceLeft.class,
net.haesleinhuepf.clincubator.interactive.handcrafted.CylinderTransform.class
        };
    }
}

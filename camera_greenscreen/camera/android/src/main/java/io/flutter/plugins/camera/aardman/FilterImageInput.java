package io.flutter.plugins.camera.aardman;

/**
 * Interface for a class that will consume successive frames
 * from an ImageReader used in the Filter pipeline
 *
 * Instantiated in the current pipeline by FilterRenderer
 */
interface FilterImageInput {
    void handleNextImageFrame();
}

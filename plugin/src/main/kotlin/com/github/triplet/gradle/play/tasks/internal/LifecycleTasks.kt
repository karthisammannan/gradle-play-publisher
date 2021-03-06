package com.github.triplet.gradle.play.tasks.internal

import com.github.triplet.gradle.play.PlayPublisherExtension
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Nested
import javax.inject.Inject

internal open class ArtifactLifecycleTask @Inject constructor(
        @get:Nested override val extension: PlayPublisherExtension
) : DefaultTask(), ArtifactExtensionOptions

internal open class WriteTrackLifecycleTask @Inject constructor(
        @get:Nested override val extension: PlayPublisherExtension
) : DefaultTask(), WriteTrackExtensionOptions

internal open class UpdatableTrackLifecycleTask @Inject constructor(
        @get:Nested override val extension: PlayPublisherExtension
) : DefaultTask(), UpdatableTrackExtensionOptions

internal open class PublishableTrackLifecycleTask @Inject constructor(
        @get:Nested override val extension: PlayPublisherExtension
) : DefaultTask(), PublishableTrackExtensionOptions

internal open class GlobalPublishableArtifactLifecycleTask @Inject constructor(
        @get:Nested override val extension: PlayPublisherExtension
) : DefaultTask(), GlobalPublishableArtifactExtensionOptions

internal open class BootstrapLifecycleTask : DefaultTask(),
        BootstrapOptions by BootstrapOptions.Holder

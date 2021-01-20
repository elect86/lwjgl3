/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_dedicated_allocation_image_aliasing = "NVDedicatedAllocationImageAliasing".nativeClassVK("NV_dedicated_allocation_image_aliasing", type = "device", postfix = NV) {
    documentation =
        """
        This extension allows applications to alias images on dedicated allocations, subject to specific restrictions: the extent and the number of layers in the image being aliased must be smaller than or equal to those of the original image for which the allocation was created, and every other image parameter must match.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_dedicated_allocation_image_aliasing}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>241</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRDedicatedAllocation VK_KHR_dedicated_allocation}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Nuno Subtil <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_dedicated_allocation_image_aliasing:%20&amp;body=@nsubtil%20">nsubtil</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-01-04</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Nuno Subtil, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
                <li>Axel Gneiting, id Software</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_EXTENSION_NAME".."VK_NV_dedicated_allocation_image_aliasing"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV".."1000240000"
    )
}
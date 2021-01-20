/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_provoking_vertex = "EXTProvokingVertex".nativeClassGL("EXT_provoking_vertex", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides an alternative provoking vertex convention for rendering lines, triangles, and (optionally depending on the implementation)
        quads.

        The provoking vertex of a primitive is the vertex that determines the constant primary and secondary colors when flat shading is enabled.

        In OpenGL, the provoking vertex for triangle, quad, line, and (trivially) point primitives is the last vertex used to assemble the primitive. The
        polygon primitive is an exception in OpenGL where the first vertex of a polygon primitive determines the color of the polygon, even if actually broken
        into triangles and/or quads.

        See section 2.14.7 (Flatshading) of the OpenGL 2.1 specification, particularly Table 2.12 for more details.

        Alternatively the provoking vertex could be the first vertex of the primitive. Other APIs with flat-shading functionality such as Reality Lab and
        Direct3D have adopted the "first vertex of the primitive" convention to determine the provoking vertex. However, these APIs lack quads so do not have a
        defined provoking vertex convention for quads.

        The motivation for this extension is to allow applications developed for APIs with a "first vertex of the primitive" provoking vertex to be easily
        converted to OpenGL.
        """

    IntConstant(
        "Accepted by the {@code mode} parameter of ProvokingVertexEXT.",

        "FIRST_VERTEX_CONVENTION_EXT"..0x8E4D,
        "LAST_VERTEX_CONVENTION_EXT"..0x8E4E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PROVOKING_VERTEX_EXT"..0x8E4F,
        "QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT"..0x8E4C
    )

    void(
        "ProvokingVertexEXT",
        "",

        GLenum("mode", "")
    )
}
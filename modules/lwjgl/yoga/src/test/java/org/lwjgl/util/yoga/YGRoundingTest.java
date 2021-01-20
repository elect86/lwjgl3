/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.AssertJUnit.*;

@SuppressWarnings("MisorderedAssertEqualsArgumentsTestNG")
public class YGRoundingTest {
    @Test
    public void test_rounding_flex_basis_flex_grow_row_width_of_100() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(100f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(33f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(33f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(34f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(67f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(33f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(67f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(33f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(33f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(34f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(33f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_flex_basis_flex_grow_row_prime_number_width() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(113f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root.addChildAt(root_child2, 2);

        YogaNode root_child3 = createNode(config);
        root_child3.setFlexGrow(1f);
        root.addChildAt(root_child3, 3);

        YogaNode root_child4 = createNode(config);
        root_child4.setFlexGrow(1f);
        root.addChildAt(root_child4, 4);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(113f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(23f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(23f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(22f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(45f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(23f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

        assertEquals(68f, root_child3.getLayoutX(), 0.0f);
        assertEquals(0f, root_child3.getLayoutY(), 0.0f);
        assertEquals(22f, root_child3.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child3.getLayoutHeight(), 0.0f);

        assertEquals(90f, root_child4.getLayoutX(), 0.0f);
        assertEquals(0f, root_child4.getLayoutY(), 0.0f);
        assertEquals(23f, root_child4.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child4.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(113f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(90f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(23f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(68f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(22f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(45f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(23f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

        assertEquals(23f, root_child3.getLayoutX(), 0.0f);
        assertEquals(0f, root_child3.getLayoutY(), 0.0f);
        assertEquals(22f, root_child3.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child3.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child4.getLayoutX(), 0.0f);
        assertEquals(0f, root_child4.getLayoutY(), 0.0f);
        assertEquals(23f, root_child4.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child4.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_flex_basis_flex_shrink_row() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(101f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexShrink(1f);
        root_child0.setFlexBasis(100f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexBasis(25f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexBasis(25f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(101f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(51f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(51f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(25f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(76f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(25f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(101f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(50f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(51f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(25f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(25f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(25f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_flex_basis_overrides_main_size() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(100f);
        root.setHeight(113f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasis(50f);
        root_child0.setHeight(20f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setHeight(10f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(64f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(64f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_total_fractial() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(87.4f);
        root.setHeight(113.4f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(0.7f);
        root_child0.setFlexBasis(50.3f);
        root_child0.setHeight(20.3f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1.6f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1.1f);
        root_child2.setHeight(10.7f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(87f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(59f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(59f, root_child1.getLayoutY(), 0.0f);
        assertEquals(87f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(30f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(87f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(87f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(59f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(59f, root_child1.getLayoutY(), 0.0f);
        assertEquals(87f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(30f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(87f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_total_fractial_nested() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(87.4f);
        root.setHeight(113.4f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(0.7f);
        root_child0.setFlexBasis(50.3f);
        root_child0.setHeight(20.3f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setFlexGrow(1f);
        root_child0_child0.setFlexBasis(0.3f);
        root_child0_child0.setPosition(YogaEdge.BOTTOM, 13.3f);
        root_child0_child0.setHeight(9.9f);
        root_child0.addChildAt(root_child0_child0, 0);

        YogaNode root_child0_child1 = createNode(config);
        root_child0_child1.setFlexGrow(4f);
        root_child0_child1.setFlexBasis(0.3f);
        root_child0_child1.setPosition(YogaEdge.TOP, 13.3f);
        root_child0_child1.setHeight(1.1f);
        root_child0.addChildAt(root_child0_child1, 1);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1.6f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1.1f);
        root_child2.setHeight(10.7f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(87f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(59f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(-13f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(12f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child1.getLayoutX(), 0.0f);
        assertEquals(25f, root_child0_child1.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(47f, root_child0_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(59f, root_child1.getLayoutY(), 0.0f);
        assertEquals(87f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(30f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(87f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(87f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(59f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(-13f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(12f, root_child0_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child1.getLayoutX(), 0.0f);
        assertEquals(25f, root_child0_child1.getLayoutY(), 0.0f);
        assertEquals(87f, root_child0_child1.getLayoutWidth(), 0.0f);
        assertEquals(47f, root_child0_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(59f, root_child1.getLayoutY(), 0.0f);
        assertEquals(87f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(30f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(87f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_fractial_input_1() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(100f);
        root.setHeight(113.4f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasis(50f);
        root_child0.setHeight(20f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setHeight(10f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(64f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(64f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_fractial_input_2() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setWidth(100f);
        root.setHeight(113.6f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasis(50f);
        root_child0.setHeight(20f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setHeight(10f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(114f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(65f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(65f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(114f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(65f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(65f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_fractial_input_3() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setPosition(YogaEdge.TOP, 0.3f);
        root.setWidth(100f);
        root.setHeight(113.4f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasis(50f);
        root_child0.setHeight(20f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setHeight(10f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(114f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(65f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(114f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(65f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_fractial_input_4() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setPosition(YogaEdge.TOP, 0.7f);
        root.setWidth(100f);
        root.setHeight(113.4f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setFlexBasis(50f);
        root_child0.setHeight(20f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setHeight(10f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(1f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(64f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(1f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(113f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(64f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(64f, root_child1.getLayoutY(), 0.0f);
        assertEquals(100f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(89f, root_child2.getLayoutY(), 0.0f);
        assertEquals(100f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(24f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_inner_node_controversy_horizontal() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(320f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setHeight(10f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setHeight(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child1_child0 = createNode(config);
        root_child1_child0.setFlexGrow(1f);
        root_child1_child0.setHeight(10f);
        root_child1.addChildAt(root_child1_child0, 0);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setHeight(10f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(320f, root.getLayoutWidth(), 0.0f);
        assertEquals(10f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(107f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(107f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(106f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(106f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(213f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(107f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(320f, root.getLayoutWidth(), 0.0f);
        assertEquals(10f, root.getLayoutHeight(), 0.0f);

        assertEquals(213f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(107f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(107f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(106f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(106f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(107f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_inner_node_controversy_vertical() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setHeight(320f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setWidth(10f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setWidth(10f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child1_child0 = createNode(config);
        root_child1_child0.setFlexGrow(1f);
        root_child1_child0.setWidth(10f);
        root_child1.addChildAt(root_child1_child0, 0);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setWidth(10f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(10f, root.getLayoutWidth(), 0.0f);
        assertEquals(320f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(107f, root_child1.getLayoutY(), 0.0f);
        assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(213f, root_child2.getLayoutY(), 0.0f);
        assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(10f, root.getLayoutWidth(), 0.0f);
        assertEquals(320f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1.getLayoutX(), 0.0f);
        assertEquals(107f, root_child1.getLayoutY(), 0.0f);
        assertEquals(10f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(10f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(213f, root_child2.getLayoutY(), 0.0f);
        assertEquals(10f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child2.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_rounding_inner_node_controversy_combined() {
        YogaConfig config = new YogaConfig();

        YogaNode root = createNode(config);
        root.setFlexDirection(YogaFlexDirection.ROW);
        root.setWidth(640f);
        root.setHeight(320f);

        YogaNode root_child0 = createNode(config);
        root_child0.setFlexGrow(1f);
        root_child0.setHeightPercent(100f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child1 = createNode(config);
        root_child1.setFlexGrow(1f);
        root_child1.setHeightPercent(100f);
        root.addChildAt(root_child1, 1);

        YogaNode root_child1_child0 = createNode(config);
        root_child1_child0.setFlexGrow(1f);
        root_child1_child0.setWidthPercent(100f);
        root_child1.addChildAt(root_child1_child0, 0);

        YogaNode root_child1_child1 = createNode(config);
        root_child1_child1.setFlexGrow(1f);
        root_child1_child1.setWidthPercent(100f);
        root_child1.addChildAt(root_child1_child1, 1);

        YogaNode root_child1_child1_child0 = createNode(config);
        root_child1_child1_child0.setFlexGrow(1f);
        root_child1_child1_child0.setWidthPercent(100f);
        root_child1_child1.addChildAt(root_child1_child1_child0, 0);

        YogaNode root_child1_child2 = createNode(config);
        root_child1_child2.setFlexGrow(1f);
        root_child1_child2.setWidthPercent(100f);
        root_child1.addChildAt(root_child1_child2, 2);

        YogaNode root_child2 = createNode(config);
        root_child2.setFlexGrow(1f);
        root_child2.setHeightPercent(100f);
        root.addChildAt(root_child2, 2);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(640f, root.getLayoutWidth(), 0.0f);
        assertEquals(320f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(213f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(320f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(213f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(320f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child1.getLayoutX(), 0.0f);
        assertEquals(107f, root_child1_child1.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child1.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child1_child0.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child2.getLayoutX(), 0.0f);
        assertEquals(213f, root_child1_child2.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child2.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child1_child2.getLayoutHeight(), 0.0f);

        assertEquals(427f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(213f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(320f, root_child2.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(640f, root.getLayoutWidth(), 0.0f);
        assertEquals(320f, root.getLayoutHeight(), 0.0f);

        assertEquals(427f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(213f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(320f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(213f, root_child1.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1.getLayoutWidth(), 0.0f);
        assertEquals(320f, root_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child1.getLayoutX(), 0.0f);
        assertEquals(107f, root_child1_child1.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child1.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1_child1.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child1_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child1_child1_child0.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child1_child0.getLayoutWidth(), 0.0f);
        assertEquals(106f, root_child1_child1_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child1_child2.getLayoutX(), 0.0f);
        assertEquals(213f, root_child1_child2.getLayoutY(), 0.0f);
        assertEquals(214f, root_child1_child2.getLayoutWidth(), 0.0f);
        assertEquals(107f, root_child1_child2.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child2.getLayoutX(), 0.0f);
        assertEquals(0f, root_child2.getLayoutY(), 0.0f);
        assertEquals(213f, root_child2.getLayoutWidth(), 0.0f);
        assertEquals(320f, root_child2.getLayoutHeight(), 0.0f);
    }

}

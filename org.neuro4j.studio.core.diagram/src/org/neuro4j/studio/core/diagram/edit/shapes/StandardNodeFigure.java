/*
 * Copyright (c) 2013-2014, Neuro4j.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neuro4j.studio.core.diagram.edit.shapes;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Image;
import org.neuro4j.studio.core.diagram.part.Neuro4jDiagramEditorPlugin;

public class StandardNodeFigure extends JoinNodeFigure {

    public static final Image CIRCLE_IMAGE = Neuro4jDiagramEditorPlugin.imageDescriptorFromPlugin(Neuro4jDiagramEditorPlugin.ID, "icons/images/CircleRelation.png").createImage();

    /**
     * @param type
     * @generated
     */
    public StandardNodeFigure(Image image) {
        super(image);
        BorderLayout layoutThis = new BorderLayout();

        this.setLayoutManager(layoutThis);

        createContents();
    }

    public StandardNodeFigure() {
        this(JoinNodeFigure.DEFAULT_IMAGE);
    }

    /**
     * @generated
     */
    public WrappingLabel getFigureNodeName() {
        return fFigureJoinNodeName;
    }

}
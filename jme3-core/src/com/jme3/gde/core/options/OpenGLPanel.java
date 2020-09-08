/*
 *  Copyright (c) 2009-2020 jMonkeyEngine
 *  All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 * 
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 
 *  * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.gde.core.options;

import com.jme3.gde.core.Installer;
import org.openide.util.NbPreferences;

/**
 * A Settings Panel to control various openGL Settings (i.e. the used renderer)
 * @author normenhansen
 */
final class OpenGLPanel extends javax.swing.JPanel {

    private final OpenGLOptionsPanelController controller;

    OpenGLPanel(OpenGLOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkHeavyweightCanvas = new javax.swing.JCheckBox();
        scrollHeavyweight = new javax.swing.JScrollPane();
        txtHeavyweight = new javax.swing.JTextArea();

        org.openide.awt.Mnemonics.setLocalizedText(chkHeavyweightCanvas, org.openide.util.NbBundle.getMessage(OpenGLPanel.class, "OpenGLPanel.text")); // NOI18N
        chkHeavyweightCanvas.setName(""); // NOI18N

        txtHeavyweight.setEditable(false);
        txtHeavyweight.setColumns(20);
        txtHeavyweight.setLineWrap(true);
        txtHeavyweight.setRows(5);
        txtHeavyweight.setText(org.openide.util.NbBundle.getMessage(OpenGLPanel.class, "OpenGLPanel.txtHeavyweight.text")); // NOI18N
        txtHeavyweight.setWrapStyleWord(true);
        txtHeavyweight.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        scrollHeavyweight.setViewportView(txtHeavyweight);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollHeavyweight, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkHeavyweightCanvas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkHeavyweightCanvas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollHeavyweight, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void load() {
        chkHeavyweightCanvas.setSelected("true".equals(NbPreferences.forModule(Installer.class).get("use_lwjgl_canvas", "false")));
    }

    void store() {
        if(chkHeavyweightCanvas.isSelected()){
            NbPreferences.forModule(Installer.class).put("use_lwjgl_canvas", "true");
        }else{
            NbPreferences.forModule(Installer.class).put("use_lwjgl_canvas", "false");
        }
    }

    boolean valid() {
        // There is nothing here that could be in an invalid state
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkHeavyweightCanvas;
    private javax.swing.JScrollPane scrollHeavyweight;
    private javax.swing.JTextArea txtHeavyweight;
    // End of variables declaration//GEN-END:variables
}

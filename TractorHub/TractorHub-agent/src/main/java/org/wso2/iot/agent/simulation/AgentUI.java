/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.iot.agent.simulation;

import org.wso2.iot.agent.Application;
import org.wso2.iot.agent.analytics.SiddhiEngine;
import org.wso2.siddhi.core.stream.input.InputHandler;

import javax.swing.*;

public class AgentUI extends javax.swing.JFrame {

    private SiddhiEngine siddhiEngine;

    /**
     * Creates new form Agent
     */
    public AgentUI(SiddhiEngine siddhiEngine) {
        initComponents();
        jlblVersion.setText(Application.AGENT_VERSION);
    }

    public double getEngineTemp() {
        return (double) spnrEngineTemperature.getValue();
    }

    public double getHumidity() {
        return (double) spnrHumidity.getValue();
    }

    public double getTractorSpeed() {
        return (double) spnrTractorSpeed.getValue();
    }

    public double getLoadWeight() {
        return (double) spnrTractorLoad.getValue();
    }

    public double getSoilMoisture() {
        return (double) spnrSoilMoisture.getValue();
    }

    public double getIllumination() {
        return (double) spnrIllumination.getValue();
    }

    public double getFuelUsage() {
        return (double) spnrFuelLevel.getValue();
    }

    public double getTemperature() {
        return (double) spnrTemperature.getValue();
    }

    public boolean isEngineIdle() {
        return chkidle.isSelected();
    }

    public boolean isRaining() {
        return chkRaining.isSelected();
    }

    public long getInterval() {
        return ((int) spnrInterval.getValue()) * 1000L;
    }

    public void addAlert(String alert) {
        SwingUtilities.invokeLater(() -> txtAlerts.setText(txtAlerts.getText() + alert + "\n"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlAlert = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlerts = new javax.swing.JTextArea();
        jpnlParameters = new javax.swing.JPanel();
        jlblHumidity = new javax.swing.JLabel();
        jlblSoilMoisture = new javax.swing.JLabel();
        jlblIllumination = new javax.swing.JLabel();
        jlblEngineTemperature = new javax.swing.JLabel();
        jlblTractorSpeed = new javax.swing.JLabel();
        jlblTractorLoad = new javax.swing.JLabel();
        jlblFuelLevel = new javax.swing.JLabel();
        jlblTemperature = new javax.swing.JLabel();
        jlblEngineState = new javax.swing.JLabel();
        spnrTemperature = new javax.swing.JSpinner();
        spnrHumidity = new javax.swing.JSpinner();
        spnrSoilMoisture = new javax.swing.JSpinner();
        spnrIllumination = new javax.swing.JSpinner();
        spnrEngineTemperature = new javax.swing.JSpinner();
        spnrTractorSpeed = new javax.swing.JSpinner();
        spnrTractorLoad = new javax.swing.JSpinner();
        spnrFuelLevel = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chkRaining = new javax.swing.JCheckBox();
        chkidle = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        spnrInterval = new javax.swing.JSpinner();
        jbtnTrigger = new javax.swing.JButton();
        jlblVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlAlert.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("ALERTS");

        txtAlerts.setColumns(20);
        txtAlerts.setRows(5);
        jScrollPane2.setViewportView(txtAlerts);

        javax.swing.GroupLayout jpnlAlertLayout = new javax.swing.GroupLayout(jpnlAlert);
        jpnlAlert.setLayout(jpnlAlertLayout);
        jpnlAlertLayout.setHorizontalGroup(
            jpnlAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlAlertLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnlAlertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jpnlAlertLayout.setVerticalGroup(
            jpnlAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlAlertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnlParameters.setBackground(java.awt.Color.lightGray);

        jlblHumidity.setText("Humidity :");

        jlblSoilMoisture.setText("SoilMoisture :");

        jlblIllumination.setText("Illumination :");

        jlblEngineTemperature.setText("Engine Temperature :");

        jlblTractorSpeed.setText("Tractor Speed :");

        jlblTractorLoad.setText("Tractor Load :");

        jlblFuelLevel.setText("Fuel Level :");

        jlblTemperature.setText("Temperature :");

        jlblEngineState.setText("Engine Idle :");

        spnrTemperature.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.25d));

        spnrHumidity.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 0.25d));

        spnrSoilMoisture.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 0.25d));

        spnrIllumination.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.25d));

        spnrEngineTemperature.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.25d));

        spnrTractorSpeed.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.25d));

        spnrTractorLoad.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 0.25d));

        spnrFuelLevel.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 0.25d));

        jLabel4.setText("C");

        jLabel5.setText("%");

        jLabel6.setText("%");

        jLabel8.setText("%");

        jLabel9.setText("C");

        jLabel10.setText("%");

        jLabel12.setText("kmph");

        jLabel13.setText("candela");

        jLabel7.setText("Raining :");

        chkRaining.setText("true");

        chkidle.setText("true");

        javax.swing.GroupLayout jpnlParametersLayout = new javax.swing.GroupLayout(jpnlParameters);
        jpnlParameters.setLayout(jpnlParametersLayout);
        jpnlParametersLayout.setHorizontalGroup(
            jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlParametersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlParametersLayout.createSequentialGroup()
                        .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlParametersLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jlblTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnrTemperature)
                            .addComponent(chkRaining)
                            .addComponent(spnrTractorSpeed)
                            .addComponent(spnrIllumination)
                            .addComponent(spnrFuelLevel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(74, 74, 74))
                    .addGroup(jpnlParametersLayout.createSequentialGroup()
                        .addComponent(jlblIllumination, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel13))
                    .addGroup(jpnlParametersLayout.createSequentialGroup()
                        .addComponent(jlblTractorSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel12))
                    .addGroup(jpnlParametersLayout.createSequentialGroup()
                        .addComponent(jlblFuelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlblSoilMoisture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblHumidity, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblEngineTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTractorLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblEngineState, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlParametersLayout.createSequentialGroup()
                        .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnrTractorLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnrEngineTemperature, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnrSoilMoisture, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnrHumidity, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(14, 14, 14))
                    .addGroup(jpnlParametersLayout.createSequentialGroup()
                        .addComponent(chkidle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpnlParametersLayout.setVerticalGroup(
            jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlParametersLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTemperature)
                    .addComponent(spnrTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblHumidity)
                    .addComponent(spnrHumidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblIllumination)
                    .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblSoilMoisture)
                        .addComponent(spnrSoilMoisture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnrIllumination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTractorSpeed)
                    .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblEngineTemperature)
                        .addComponent(spnrEngineTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnrTractorSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTractorLoad)
                    .addComponent(spnrTractorLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblFuelLevel)
                    .addComponent(spnrFuelLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlParametersLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpnlParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(chkRaining)
                            .addComponent(chkidle)))
                    .addGroup(jpnlParametersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlblEngineState)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(184, 222, 179));

        jLabel3.setText("Data Push Interval :");

        spnrInterval.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnrInterval.setValue(10);

        jbtnTrigger.setText("Trigger");
        jbtnTrigger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTriggerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnrInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnTrigger)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnrInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTrigger))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblVersion.setText("agent version 1.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jpnlAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblVersion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnlParameters, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlAlert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnlParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTriggerActionPerformed(
            java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTriggerActionPerformed
        try {
            InputHandler inputHandler = siddhiEngine.getInputHandler("agentEventStream");
            inputHandler.send(new Object[]{getEngineTemp(), getHumidity(), getTractorSpeed(), getLoadWeight(),
                                           getSoilMoisture(), getIllumination(), getFuelUsage(), isEngineIdle(),
                                           isRaining(), getTemperature()});
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
    }//GEN-LAST:event_jbtnTriggerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkRaining;
    private javax.swing.JCheckBox chkidle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnTrigger;
    private javax.swing.JLabel jlblEngineState;
    private javax.swing.JLabel jlblEngineTemperature;
    private javax.swing.JLabel jlblFuelLevel;
    private javax.swing.JLabel jlblHumidity;
    private javax.swing.JLabel jlblIllumination;
    private javax.swing.JLabel jlblSoilMoisture;
    private javax.swing.JLabel jlblTemperature;
    private javax.swing.JLabel jlblTractorLoad;
    private javax.swing.JLabel jlblTractorSpeed;
    private javax.swing.JLabel jlblVersion;
    private javax.swing.JPanel jpnlAlert;
    private javax.swing.JPanel jpnlParameters;
    private javax.swing.JSpinner spnrEngineTemperature;
    private javax.swing.JSpinner spnrFuelLevel;
    private javax.swing.JSpinner spnrHumidity;
    private javax.swing.JSpinner spnrIllumination;
    private javax.swing.JSpinner spnrInterval;
    private javax.swing.JSpinner spnrSoilMoisture;
    private javax.swing.JSpinner spnrTemperature;
    private javax.swing.JSpinner spnrTractorLoad;
    private javax.swing.JSpinner spnrTractorSpeed;
    private javax.swing.JTextArea txtAlerts;
    // End of variables declaration//GEN-END:variables
}

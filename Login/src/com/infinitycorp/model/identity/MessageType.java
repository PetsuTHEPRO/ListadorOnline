/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.infinitycorp.model.identity;

import javax.swing.JOptionPane;

public enum MessageType {
    ERROR(JOptionPane.ERROR_MESSAGE),
    INFO(JOptionPane.INFORMATION_MESSAGE),
    SUCCESS(JOptionPane.INFORMATION_MESSAGE); // Success treated as info

    private final int messageType;

    MessageType(int messageType) {
        this.messageType = messageType;
    }

    public int getMessageType() {
        return messageType;
    }
}
